import java.util.Scanner;

public class PruebaInversa{
    public static void main (String[]args){
         Scanner sc = new Scanner (System.in);

    
    System.out.println("Ingrese una palabra");
    String palabra = sc.nextLine();

    PilaInversa p1 = new PilaInversa();

        for (int i=0; i < palabra.length(); i++){
            char letra = palabra.charAt(i);
            p1.meter(letra);

        }

        while (!p1.estaVacia()){
            System.out. println(p1.sacar());

        }











    }











}