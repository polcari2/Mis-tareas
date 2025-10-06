package pe.edu.upeu.asistencia.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pe.edu.upeu.asistencia.enums.Perfil;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @Column(length = 8, nullable = false)
    private String dni;

    @Column(length = 60, nullable = false)
    private String clave;

    @Enumerated(EnumType.STRING)
    @Column(length = 20, nullable = false)
    private Perfil perfil;


}