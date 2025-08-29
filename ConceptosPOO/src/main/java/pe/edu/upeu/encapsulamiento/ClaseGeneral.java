package pe.edu.upeu.encapsulamiento;

import pe.edu.upeu.encapsulamiento.modelo.Persona;

public class ClaseGeneral {

    public static void probarJugador(){
        Jugador jugador = new Jugador();
        jugador.setNombre("Messi");
        jugador.setApellido("GAAAA");
        jugador.setEdad(35);
        jugador.setPosicon("Delantero");
        jugador.setNumeroCam(15);
        System.out.println(jugador);
    }

    public static void probar(){
        Estudiante estudiante=new Estudiante();
        estudiante.setCodigo("2223234");
        estudiante.setCarrera("ing.Sistemas");
        estudiante.trabajo();
    }

    public static void main(String[] args) {
        Persona persona=new Persona();
        persona.setNombre("Paul ");
        persona.setEdad(17);
        persona.setGenero('M');
        persona.saludo();
        probar();
        probarJugador();
    }
}