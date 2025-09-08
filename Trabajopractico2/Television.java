public class Television {
     
    private String marca;
    private int pulgadas;
    private int canal;
    private int volumen;
    private boolean encendido;

    public Television (String marca, int pulgadas) {
        this.marca = marca;
        this.pulgadas = pulgadas;
        this.canal = 8;
        this.volumen = 5; 
    }
   
    public String getMarca() {
        return marca;
    }
    public int getPulgadas() {
        return pulgadas;
    }
    public int getCanal() {
        return canal;
    }
    public int getvolumen() {
        return volumen;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }
    public void setCanal(int canal) {
           if (canal >=8  && canal <=80)
            this.canal = canal;
    }
    public void setVolumen(int volumen) {
        if (volumen >= 0 && volumen <=100)
            this.volumen = volumen;
    }

    public String encendidoYApagado() {
        if (encendido) {
            encendido = false;
            return "apagada";
        } else {
            encendido = true;
            return "encendida";
        }
 
    }
    public void subirVolumen(){
        if (volumen < 100)
            volumen++;

    }
     public void bajarVolumen(){
        if (volumen > 0)
            volumen--;

    }
    public void subirCanal(){
        if (canal < 80)
            canal++;
    }
     public void bajarCanal(){
        if (canal > 8)
            canal--;

    }
   
     
    public String toString() {
        return "Marca:" + marca + " " + "Pulgadas:" + pulgadas;
    }
        
    



}
