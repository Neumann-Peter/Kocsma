package hu.kocsma.wysio.kocsma.controller;

import hu.kocsma.wysio.kocsma.model.Fogyasztas;
import hu.kocsma.wysio.kocsma.service.FogyasztasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/fogyasztas")
public class FogyasztasController {

    private final FogyasztasService fogyasztasService;

    @Autowired
    public FogyasztasController(FogyasztasService fogyasztasService) {
        this.fogyasztasService = fogyasztasService;
    }

    @PostMapping("{kocsmazasId}")
    public ResponseEntity<Fogyasztas> saveFogyasztas(@PathVariable Long kocsmazasId, @RequestBody Fogyasztas fogyasztas) {
        return new ResponseEntity<>(fogyasztasService.saveFogyasztas(kocsmazasId, fogyasztas), HttpStatus.CREATED);
    }
}
