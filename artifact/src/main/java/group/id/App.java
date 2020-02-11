package group.id;

import java.util.ArrayList;



/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
       Pelicula ABC = new Pelicula("abc", "abc", "abc", "abc","abc");
       ABC.reproducir();
    }
}

abstract class Contenido {
    String titulo;
    String descripcion;
    String fecha;
    String director;
    String productora;

    public Contenido(String titulo, String descripcion, String fecha, String director, String productora) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.director = director;
        this.productora = productora;
    }
}

interface IReproducible {
    public void iniciar();

    public void pausar();

    public void adelantar();

    public void retroceder();

    public void reproducir();
}

class Pelicula extends Contenido implements IReproducible {
    public Pelicula(String titulo, String descripcion, String fecha, String director, String productora) {
        super(titulo, descripcion, fecha, director, productora);
    }

    public void reproducir() {
        System.out.println("reproducir");
    }

    public void iniciar(){
        System.out.println("iniciando");
    }
  
    public void pausar() {
        System.out.println("pausando");
    }

    public void adelantar(){
        System.out.println("adelantando");
    }
    public void retroceder(){
        System.out.println("retrocediento");
    }

}

class Capitulo implements IReproducible {
    public void reproducir() {
        System.out.println("reproducir");
    }

    public void iniciar(){
        System.out.println("iniciando");
    }
  
    public void pausar() {
        System.out.println("pausando");
    }

    public void adelantar(){
        System.out.println("adelantando");
    }
    public void retroceder(){
        System.out.println("retrocediento");
    }

}

class Serie extends Contenido {
    private ArrayList<Capitulo> capitulos = new ArrayList<Capitulo>();


    public Serie(String titulo, String descripcion, String fecha, String director, String productora) {
        super(titulo, descripcion, fecha, director, productora);
    }
    public void add (Capitulo capitulos){
        this.capitulos.add(capitulos);
    }

 
    

    
    
}