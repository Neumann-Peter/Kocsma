package hu.kocsma.wysio.kocsma.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name="vendegek")
public class Vendeg {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String beceNev;
    @Column(length = 255)
    private String majErosseg;
    @Column(precision = 8)
    private Double bicepszMeret;
    @ManyToMany(mappedBy = "vendegek")
    private List<Bunyo> bunyok;
    @OneToMany
    private List<Kocsmazas> kocsmazasok;

}
