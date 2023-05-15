package hu.kocsma.wysio.kocsma.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Fogyasztasok")
public class Fogyasztas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private int elfogyaszottEgyseg;
    @ManyToOne
    private Kocsmazas kocsmazas;
}
