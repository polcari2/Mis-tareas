package pe.edu.upeu.abspolimorfismo;

public abstract class Animal {
    protected String tipo = "XYZ";
    public abstract void emitirSonido();

    public void dormir(){
        System.out.println("Zzz... Zzz...");
    }
}