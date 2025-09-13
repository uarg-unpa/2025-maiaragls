public class Teatro {
    
    private String nombre;
    private String direccion;
    private Obra obra1;
    private Obra obra2;
    private Obra obra3;

    public Teatro(String nombre, String direccion, Obra obra1, Obra obra2, Obra obra3) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.obra1 = obra1;
        this.obra2 = obra2;
        this.obra3 = obra3;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void setObra1(Obra obra1) {
        this.obra1 = obra1;
    }

    public void setObra2(Obra obra2) {
        this.obra2 = obra2;
    }

    public void setObra3(Obra obra3) {
        this.obra3 = obra3;
    }

    public String toString() {
        return "Teatro: " + nombre + " Dirección: " + direccion + " Obra 1: " + obra1  + " Obra 2: " + obra2  + " Obra 3: " + obra3;
    }
}
    

