package pe.edu.upeu.encapsulamiento;

import pe.edu.upeu.encapsulamiento.modelo.Estudiante;

public class ClaseGeneral {

    public static void probarJugador(){
        Jugador jugador= new Jugador();
        jugador.setNombre("Messi");
        jugador.setApellido("gaaaa");
        jugador.setEdad("35");
        jugador.setPosicion("Delantero");
        jugador.setNumeroCam(15);
        System.out.println(jugador);
    }
    public static void probar(){
        Estudiante estudiante = new Estudiante();
        estudiante.setCarrera("Ing. Sistemas");
        estudiante.setCodigo("202523131");
        estudiante.trabajo();
    }


    public static void main(String[] args) {
        Persona persona = new Persona();//objeto
        persona.setNombre("Paul");
        persona.setEdad(17);
        persona.setGenero('M');
        persona.saludo();
        System.out.println("Genero:"+persona.getGenero());
        probar();
        probarJugador();


    }
}