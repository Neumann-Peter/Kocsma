package hu.kocsma.wysio.kocsma.service;

import hu.kocsma.wysio.kocsma.dto.VendegDTO;
import hu.kocsma.wysio.kocsma.mapper.VendegMapper;
import hu.kocsma.wysio.kocsma.model.Vendeg;
import hu.kocsma.wysio.kocsma.repository.VendegRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendegService {
    private final VendegRepository vendegRepository;
    private final VendegMapper vendegMapper;

    @Autowired
    public VendegService(VendegRepository vendegRepository, VendegMapper vendegMapper) {
        this.vendegRepository = vendegRepository;
        this.vendegMapper = vendegMapper;
    }

    public Vendeg saveVendeg(VendegDTO vendegDTO) {
        Vendeg vendeg = vendegMapper.toEntity(vendegDTO);
        return vendegRepository.save(vendeg);
    }
}
