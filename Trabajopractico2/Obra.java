public class Obra {
    /*Un teatro se caracteriza por su nombre y su dirección y en él se realizan 3 obras teatrales al día. Cada obra
tiene un nombre y un precio. Realice el diseño de clases e indique qué métodos tendría cada clase, teniendo en
cuenta que se pueda cambiar el nombre del teatro y el nombre y precio de las obras. Implemente dichas clases. */
    private String nombre;
    private int precio;

public Obra (String nombre, int precio){
    this.nombre = nombre;
    this.precio = precio;
}

    public String getNombre(){
        return nombre;
    }
    public int getPrecio(){
        return precio;
    }
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    public void setPrecio (int precio){
        this.precio = precio;
    }
    public String toString() {
        return "Obra: " + nombre + " Precio:"+ " " + precio;
    }
}