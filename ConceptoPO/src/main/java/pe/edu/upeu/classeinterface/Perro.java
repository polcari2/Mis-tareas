package pe.edu.upeu.classeinterface;

public class Perro implements Animal{
    @Override
    public void emitirSonido() {
        System.out.println("guaau");
    }

    @Override
    public void dormir() {
        System.out.println("ahshsh");
    }
}
