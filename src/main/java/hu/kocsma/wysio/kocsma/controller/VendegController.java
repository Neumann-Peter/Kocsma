package hu.kocsma.wysio.kocsma.controller;

import hu.kocsma.wysio.kocsma.dto.VendegDTO;
import hu.kocsma.wysio.kocsma.mapper.VendegMapper;
import hu.kocsma.wysio.kocsma.model.Vendeg;
import hu.kocsma.wysio.kocsma.service.VendegService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController //HTTP Protokolt használó REST API
@RequestMapping("/api/vendegek")
public class VendegController {

    private final VendegService vendegService;
    private final VendegMapper vendegMapper;

    @Autowired
    public VendegController(VendegService vendegService, VendegMapper vendegMapper) {
        this.vendegService = vendegService;
        this.vendegMapper = vendegMapper;
    }
    @PostMapping()
    public ResponseEntity<Vendeg> saveVendeg(@RequestBody VendegDTO vendegDTO) {
        Vendeg vendeg = vendegMapper.toEntity(vendegDTO);
        Vendeg savedVendeg = vendegService.saveVendeg(vendeg);
        return new ResponseEntity<>(savedVendeg, HttpStatus.CREATED);
    }
}
