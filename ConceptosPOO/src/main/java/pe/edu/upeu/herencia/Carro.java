package pe.edu.upeu.herencia;

public class Carro  extends Vehiculo{

    String modelo=" Ford Focus";
    String placa = "34213";
    String color = "rojo";

    void caracteristicas(){

        System.out.println("Las caracteristicas del carro son: ");
        System.out.println("marca :"+marca);
        System.out.println("modelo :"+modelo);
        System.out.println("color :"+color);
        System.out.println("placa :"+placa);

    }

    public static void main (String [] args){

        Carro carro = new Carro();
        carro.caracteristicas();
        carro.sonido();



    }

}
