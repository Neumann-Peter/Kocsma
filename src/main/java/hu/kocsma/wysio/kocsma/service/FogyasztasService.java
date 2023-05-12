package hu.kocsma.wysio.kocsma.service;

import hu.kocsma.wysio.kocsma.Exception.FogyasztasNotFoundException;
import hu.kocsma.wysio.kocsma.model.Fogyasztas;
import hu.kocsma.wysio.kocsma.model.Kocsmazas;
import hu.kocsma.wysio.kocsma.repository.FogyasztasRepository;
import hu.kocsma.wysio.kocsma.repository.KocsmazasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FogyasztasService {
    private final FogyasztasRepository fogyasztasRepository;
    private final KocsmazasRepository kocsmazasRepository;

    @Autowired
    public FogyasztasService(FogyasztasRepository fogyasztasRepository, KocsmazasRepository kocsmazasRepository) {
        this.fogyasztasRepository = fogyasztasRepository;
        this.kocsmazasRepository = kocsmazasRepository;
    }

    public Fogyasztas saveFogyasztas(Long kocsmazasId, Fogyasztas fogyasztas) {
        Optional<Kocsmazas> kocsmazas = kocsmazasRepository.findById(kocsmazasId);

        if (kocsmazas.isEmpty()) {
            throw new FogyasztasNotFoundException("Nem található Kocsmazas az adatbázisban a következő ID-val: " + kocsmazasId);
        }
        fogyasztas.setKocsmazas(kocsmazas.get());
        return fogyasztasRepository.save(fogyasztas);
    }
}