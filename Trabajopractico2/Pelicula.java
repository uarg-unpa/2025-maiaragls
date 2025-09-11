public class Pelicula {
    // atributos
    private String titulo;
    private String director;
    private int AnioEstreno;
    private double duracion;

    // constructor
    public Pelicula(String titulo, String director, int AnioEstreno, double duracion) {
        this.titulo = titulo;
        this.director = director;
        this.AnioEstreno = AnioEstreno;
        this.duracion = duracion;
    }

  
    public String getTitulo() {
        return titulo;
    }
    public String getDirector() {
        return director;
    }
    public int getAnioEstreno() {
        return anioEstreno;
    }
     public double getDuracion() {
        return duracion;
    }
   
     public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public void setAnioEstreno(int AnioEstreno) {
        this.anioEstreno = anioEstreno;
    }
     public void setDuracion (double duracion) {
        this.duracion = duracion;
    }

    public int calcularAntiguedad(int anioActual) {
    return anioActual - this.anioEstreno;
}

    public String toString() {
        return "Título: " + titulo + " Director: " + director + " Año de estreno: " + anioEstreno + " Duracion:" + duracion;
    }
}