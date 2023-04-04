package hu.kocsma.wysio.kocsma.service;

import hu.kocsma.wysio.kocsma.model.Vendeg;
import hu.kocsma.wysio.kocsma.repository.VendegRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendegService{
    private final VendegRepository vendegRepository;
    @Autowired
    public VendegService(VendegRepository vendegRepository) {
        this.vendegRepository = vendegRepository;
    }

    public Vendeg saveVendeg(Vendeg vendeg) {
        return vendegRepository.save(vendeg);
    }
}
