package hu.kocsma.wysio.kocsma.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "bunyok")
public class Bunyo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private LocalDateTime mikortol;
    @Column
    private LocalDateTime meddig;

    @ManyToMany
    // TODO: check if this is needed
//    @JoinTable(
//            name = "bunyo_vendeg",
//            joinColumns = @JoinColumn(name = "bunyo_id"),
//            inverseJoinColumns = @JoinColumn(name = "vendeg_id"))
    private List<Vendeg> vendegek;

}

