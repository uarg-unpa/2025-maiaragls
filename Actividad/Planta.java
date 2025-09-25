
public class Planta {

   private String nombre;
   private String tipo;
   private int nivelAgua;
   private double altura; 

       //constructor
    public Planta (String nombre, String tipo, int nivelAgua, double altura)
        {
          this.nombre = nombre;
          this.tipo = tipo;
          this.nivelAgua = nivelAgua;
          this.altura = altura;
        }

     public String getNombre(){
            return nombre;
        }
    public String getTipo(){
        return tipo;
    }
     public int getNivelAgua(){
            return nivelAgua;
        }
     public double getAltura(){
            return altura;
        }
     public void setNombre(String nombre){
             this.nombre = nombre;
        }
    public void setTipo(String tipo){
             this.tipo = tipo;
        }
    public void setNivelAgua(int nivelAgua ){
             this.nivelAgua = nivelAgua;
        }
     public void setAltura (double altura){
             this.altura = altura;
        }

    // metodos

public String verificarRiego(){
      if (this.nivelAgua <= 30){
         return "La planta necesita ser regada.";
      }
      else{
         return "La planta no necesita ser regada.";
      }
   }
public void crecer (double crecimiento){

    altura = altura + crecimiento;

}

public String toString (){
    return "Planta:" + nombre +" "+ "Tipo de planta:" + tipo +" "+ "Nivel del agua:" + nivelAgua +" " + "Altura de la planta:" + altura + "cm" + " " + "Estado:" + verificarRiego(); 

}



}

