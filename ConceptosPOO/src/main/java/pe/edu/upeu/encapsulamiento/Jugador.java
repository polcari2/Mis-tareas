package pe.edu.upeu.encapsulamiento;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data

public class Jugador {
    private String nombre;
    private String apellido;
    private int edad;
    private String posicon;
    private int numeroCam;

    @Override
    public String toString() {
        return "El jugador tienes estas caracteristicas: \n"
                + "Nombre: " + nombre + "\n"
                + "Apellido: " + apellido + "\n"
                + "Edad: " + edad + "\n"
                + "Posicion: " + posicon + "\n"
                + "Numero camisas: " + numeroCam;
    }

}