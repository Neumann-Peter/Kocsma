package hu.kocsma.wysio.kocsma.controller;

import hu.kocsma.wysio.kocsma.model.Vendeg;
import hu.kocsma.wysio.kocsma.service.VendegService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/vendegek")
public class VendegController {

    private VendegService vendegService;

    public VendegController(VendegService vendegService) {
        super();
        this.vendegService = vendegService;
    }

    //build create Vendeg REST API
    @PostMapping()
    public ResponseEntity<Vendeg> saveVendeg(@RequestBody Vendeg vendeg){
        return new ResponseEntity<Vendeg>(vendegService.saveVendeg(vendeg), HttpStatus.CREATED);
    }
}
