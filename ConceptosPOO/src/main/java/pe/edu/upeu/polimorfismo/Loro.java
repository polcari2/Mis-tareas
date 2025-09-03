package pe.edu.upeu.polimorfismo;

import pe.edu.upeu.Animal;

public class Loro extends Animal {
    @Override
    public void emitirsonido(){
        System.out.println("Hola, como estas.... parece que" +
                "te estas durmiendo");
    }
}
