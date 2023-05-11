package hu.kocsma.wysio.kocsma.service;

import hu.kocsma.wysio.kocsma.Exception.VendegNotFoundException;
import hu.kocsma.wysio.kocsma.model.Kocsmazas;
import hu.kocsma.wysio.kocsma.model.Vendeg;
import hu.kocsma.wysio.kocsma.repository.KocsmazasRepository;
import hu.kocsma.wysio.kocsma.repository.VendegRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

        if(vendeg.isEmpty()) {
            throw new VendegNotFoundException("Nem található Vendeg az adatbázisban a következő ID-val: " + vendegId);
        }

        kocsmazas.setVendeg(vendeg.get());

        return kocsmazasRepository.save(kocsmazas);
    }
}


