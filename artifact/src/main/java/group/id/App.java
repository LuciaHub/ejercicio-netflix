package group.id;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
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



class Serie extends Contenido implements IReproducible {
    public Serie(String titulo, String descripcion, String fecha, String director, String productora) {
        super(titulo, descripcion, fecha, director, productora);
    }

    public void reproducir() {
        System.out.println("reproducir");
    }
	
	public void adelantar() {
		System.out.println("adelantando");
	}
    
    public void iniciar(){
        System.out.println("iniciando");
    }
	public void pausar() {
        System.out.println("pausando");
    }	
    
    public void retroceder(){
        System.out.println("retrocediento");
    }

    }
    

    
    
}