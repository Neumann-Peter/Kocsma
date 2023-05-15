package hu.kocsma.wysio.kocsma.mapper;

import hu.kocsma.wysio.kocsma.dto.VendegDTO;
import hu.kocsma.wysio.kocsma.model.Vendeg;
import org.springframework.stereotype.Component;

@Component
public class VendegMapper {

    public Vendeg toEntity(VendegDTO vendegDTO) {
        Vendeg vendeg = new Vendeg();
        vendeg.setBeceNev(vendegDTO.getBeceNev());
        vendeg.setMajErosseg(vendegDTO.getMajErosseg());
        vendeg.setBicepszMeret(vendegDTO.getBicepszMeret());
        return vendeg;
    }

    public VendegDTO toDTO(Vendeg vendeg) {
        VendegDTO vendegDTO = new VendegDTO();
        vendegDTO.setBeceNev(vendeg.getBeceNev());
        vendegDTO.setMajErosseg(vendeg.getMajErosseg());
        vendegDTO.setBicepszMeret(vendeg.getBicepszMeret());
        return vendegDTO;
    }
}

