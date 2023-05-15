package hu.kocsma.wysio.kocsma.controller;

import hu.kocsma.wysio.kocsma.dto.VendegDTO;
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
        this.vendegService = vendegService;
    }

    @PostMapping()
    public ResponseEntity<Vendeg> saveVendeg(@RequestBody VendegDTO vendegDTO) {
        Vendeg savedVendeg = vendegService.saveVendeg(vendegDTO);
        return new ResponseEntity<>(savedVendeg, HttpStatus.CREATED);
    }
}
