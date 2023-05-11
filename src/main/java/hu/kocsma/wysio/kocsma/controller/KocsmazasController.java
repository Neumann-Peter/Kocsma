package hu.kocsma.wysio.kocsma.controller;

import hu.kocsma.wysio.kocsma.model.Kocsmazas;
import hu.kocsma.wysio.kocsma.service.KocsmazasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/kocsmazas")
public class KocsmazasController {

    private final KocsmazasService kocsmazasService;

    @Autowired
    public KocsmazasController(KocsmazasService kocsmazasService) {
        this.kocsmazasService = kocsmazasService;
    }

    @PostMapping("{vendegId}")
    public ResponseEntity<Kocsmazas> saveKocsmazas(@PathVariable Long vendegId, @RequestBody Kocsmazas kocsmazas) {
        return new ResponseEntity<>(kocsmazasService.saveKocsmazas(vendegId, kocsmazas), HttpStatus.CREATED);
    }

    @PutMapping("/lezaras/{id}")
    public ResponseEntity<Kocsmazas> lezaras(@PathVariable Long id) {
        throw new UnsupportedOperationException(); // TODO: implementálni a lezárást
    }
}
