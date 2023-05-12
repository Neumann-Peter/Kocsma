package hu.kocsma.wysio.kocsma.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Italok")
public class Ital {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String nev;
    @Column
    private int alkoholtartalom;
    @Column
    private int adagMennyiseg;
    @ManyToOne
    private Fogyasztas fogyasztas;
}
