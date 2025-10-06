package pe.edu.upeu.asistencia.modelo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@AllArgsConstructor
@NoArgsConstructor
//@Data
@Entity
public class Asistencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAsistencia;

    @Column(nullable = false)
    private LocalDateTime fechaHora;

    @Column(length = 10, nullable = false)
    private String estado;

    @ManyToOne
    @JoinColumn(name = "dni", nullable = false)
    private Participante participante;

    @ManyToOne
    @JoinColumn(name = "id_evento", nullable = false)
    private Evento evento;
}
