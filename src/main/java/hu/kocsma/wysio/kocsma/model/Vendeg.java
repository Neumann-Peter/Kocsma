package hu.kocsma.wysio.kocsma.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="vendegek")
public class Vendeg {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String email;
}
