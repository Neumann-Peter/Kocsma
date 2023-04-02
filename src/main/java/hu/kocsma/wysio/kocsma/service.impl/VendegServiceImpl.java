package hu.kocsma.wysio.kocsma.service.impl;

import hu.kocsma.wysio.kocsma.model.Vendeg;
import hu.kocsma.wysio.kocsma.repository.VendegRepository;
import hu.kocsma.wysio.kocsma.service.VendegService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendegServiceImpl implements VendegService {
    private VendegRepository vendegRepository;
    public VendegServiceImpl(VendegRepository vendegRepository) {
        super();
        this.vendegRepository = vendegRepository;
    }
    @Override
    public Vendeg saveVendeg(Vendeg vendeg) {
        return vendegRepository.save(vendeg);
    }
}
