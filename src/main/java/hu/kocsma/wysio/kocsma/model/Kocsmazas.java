package hu.kocsma.wysio.kocsma.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;


@Data
@Entity
@Table(name = "Kocsmazasok")
public class Kocsmazas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private LocalDateTime mikortol;
    @Column
    private LocalDateTime meddig;
    @Column
    private boolean detoxbaKerult;
    @ManyToOne
    private Vendeg vendeg;
}
