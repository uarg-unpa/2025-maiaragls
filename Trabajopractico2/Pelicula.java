public class Pelicula {
    // atributos
    private String titulo;
    private String director;
    private int fechaEstreno;
    private double duracion;

    // constructor
    public Pelicula(String titulo, String director, int fechaEstreno, double duracion) {
        this.titulo = titulo;
        this.director = director;
        this.fechaEstreno = fechaEstreno;
        this.duracion = duracion;
    }

  
    public String getTitulo() {
        return titulo;
    }
    public String getDirector() {
        return director;
    }
    public int getFechaEstreno() {
        return fechaEstreno;
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
    public void setFechaEstreno(int fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }
     public void setDuracion (double duracion) {
        this.duracion = duracion;
    }

    public int calcularAntiguedad(int anioActual) {
    return anioActual - this.fechaEstreno;
}

    public String toString() {
        return "Título: " + titulo + ", Director: " + director + ", Año de estreno: " + fechaEstreno + ", Duracion:" + duracion;
    }
}