package pe.edu.upeu.classeinterface;

public class Loro implements Animal {


    @Override
    public void emitirSonido() {
        System.out.println("arrrrr");
    }

    @Override
    public void dormir() {
        System.out.println("durmiendo....");
    }
}
