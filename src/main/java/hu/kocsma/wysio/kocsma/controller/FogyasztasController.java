package hu.kocsma.wysio.kocsma.controller;

import hu.kocsma.wysio.kocsma.model.Fogyasztas;
import hu.kocsma.wysio.kocsma.model.Kocsmazas;
import hu.kocsma.wysio.kocsma.service.FogyasztasService;
import hu.kocsma.wysio.kocsma.service.KocsmazasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/fogyasztas")
public class FogyasztasController {

    private final FogyasztasService fogyasztasService;
    private final KocsmazasService kocsmazasService;

    @Autowired
    public FogyasztasController(FogyasztasService fogyasztasService, KocsmazasService kocsmazasService) {
        this.fogyasztasService = fogyasztasService;
        this.kocsmazasService = kocsmazasService;
    }

    @PostMapping("{kocsmazasId}")
    public ResponseEntity<Fogyasztas> saveFogyasztas(@PathVariable Long kocsmazasId, @RequestBody Fogyasztas fogyasztas) {
        return new ResponseEntity<>(fogyasztasService.saveFogyasztas(kocsmazasId, fogyasztas), HttpStatus.CREATED);
    }
}


