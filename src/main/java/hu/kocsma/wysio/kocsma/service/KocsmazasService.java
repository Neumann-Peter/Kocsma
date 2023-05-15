package hu.kocsma.wysio.kocsma.service;

import hu.kocsma.wysio.kocsma.Exception.KocsmazasHasAlreadyClosedException;
import hu.kocsma.wysio.kocsma.Exception.KocsmazasNotFoundException;
import hu.kocsma.wysio.kocsma.Exception.VendegNotFoundException;
import hu.kocsma.wysio.kocsma.model.Kocsmazas;
import hu.kocsma.wysio.kocsma.model.Vendeg;
import hu.kocsma.wysio.kocsma.repository.KocsmazasRepository;
import hu.kocsma.wysio.kocsma.repository.VendegRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class KocsmazasService {
    private final KocsmazasRepository kocsmazasRepository;
    private final VendegRepository vendegRepository;

    @Autowired
    public KocsmazasService(KocsmazasRepository kocsmazasRepository, VendegRepository vendegRepository) {
        this.kocsmazasRepository = kocsmazasRepository;
        this.vendegRepository = vendegRepository;
    }

    public Kocsmazas saveKocsmazas(Long vendegId, Kocsmazas kocsmazas) {
        Optional<Vendeg> vendeg = vendegRepository.findById(vendegId);

        if (vendeg.isEmpty()) {
            throw new VendegNotFoundException("Nem található Vendeg az adatbázisban a következő ID-val: " + vendegId);
        }

        kocsmazas.setVendeg(vendeg.get());
        kocsmazas.setLezarva(false);
        kocsmazas.setMikortol(LocalDateTime.now());

        return kocsmazasRepository.save(kocsmazas);
    }

    public Kocsmazas lezaras(Long id) {
        Optional<Kocsmazas> kocsmazasOptional = kocsmazasRepository.findById(id);

        if (kocsmazasOptional.isEmpty()) {
            throw new KocsmazasNotFoundException("Nem található Kocsmazas az adatbázisban a következő ID-val: " + id);
        }

        Kocsmazas kocsmazas = kocsmazasOptional.get();
        if (kocsmazas.isLezarva()) {
            throw new KocsmazasHasAlreadyClosedException("Már lezártad ezt a kocsmázást");
        }
        kocsmazas.setLezarva(true);
        kocsmazas.setMeddig(LocalDateTime.now());

        return kocsmazasRepository.save(kocsmazas);
    }
}


