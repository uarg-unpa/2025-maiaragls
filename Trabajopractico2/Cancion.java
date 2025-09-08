public class Cancion {

    private String titulo;
    private String artista;
    private String album;
    private double duracion;
    private boolean reproduciendo;

    public Cancion (String titulo, String artista, String album, double duracion) {
        this.titulo = titulo;
        this.artista = artista;
        this.album = album;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }
    public String getArtista() {
        return artista;
    }
    public String getAlbum() {
        return album;
    }
    public double getDuracion() {
        return duracion;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setArtista(String artista) {
        this.artista = artista;
    }
    public void setGenero(String album) {
        this.album = album;
    }
    public void setTitulo(double duracion) {
        this.duracion = duracion;
    }


    public String reproducirYPausar() {
        if (reproduciendo) {
            reproduciendo = false;
            return "La cancion esta en pausa";
        } else {
            reproduciendo = true;
            return "La cancion se esta reproduciendo";
 }
    }
    public String toString() {
        return "Título: " + titulo + ", Artista: " + artista + ", album: " + album+ ", Duracion:" + duracion + " " + "minutos";
    }

}
