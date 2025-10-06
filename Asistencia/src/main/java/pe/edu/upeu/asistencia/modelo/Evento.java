package pe.edu.upeu.asistencia.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import pe.edu.upeu.asistencia.enums.TipoEvento;

import java.time.LocalDate;
import java.time.LocalTime;

@AllArgsConstructor
@NoArgsConstructor
//@Data
@Entity
@Table(name = "evento")
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEvento;

    @Column(length = 100, nullable = false)
    private String nombreEvento;

    @Column(nullable = false)
    private LocalDate fecha;

    @Column(nullable = false)
    private LocalTime hora;

    @Enumerated(EnumType.STRING)
    @Column(length = 20, nullable = false)
    private TipoEvento tipoEvento;

    @Column(nullable = false)
    private Boolean estado;

    @Column(nullable = false)
    private Integer cantidadRegistro;
}
