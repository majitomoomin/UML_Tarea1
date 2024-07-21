package UMLTarea;

public abstract class Personaje {
    private String nombre;
    private String descripcion;
    private long tamano;
    private int poder;
    private int vida;

    static void desplazar(Personaje personaje){}
    static int mostrarVida(Personaje personaje){
        return 0;
    }
    static void mostrarPoder(Personaje personaje){}
}
