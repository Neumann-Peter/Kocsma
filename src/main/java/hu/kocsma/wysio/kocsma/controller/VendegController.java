package hu.kocsma.wysio.kocsma.controller;

import hu.kocsma.wysio.kocsma.model.Vendeg;
import hu.kocsma.wysio.kocsma.service.VendegService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //HTTP Protokolt használó REST API
@RequestMapping("/api/vendegek")
public class VendegController {

    private final VendegService vendegService;


    @Autowired
    public VendegController(VendegService vendegService) {
        // dependency injection miatt nem kell super()-t használni.
        this.vendegService = vendegService;
    }


    //build create Vendeg REST API
    @PostMapping()
    public ResponseEntity<Vendeg> saveVendeg(@RequestBody Vendeg vendeg) {
        return new ResponseEntity<>(vendegService.saveVendeg(vendeg), HttpStatus.CREATED);
    }
}
