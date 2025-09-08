
public class PruebaCancion{
    
    public static void main(String[] args) {

    Cancion c1 = new Cancion("live forever", "Oasis", "definitely maybe" , 4.38);
    Cancion c2 = new Cancion("Walkabout", "Red Hot Chili Peppers", "One hot minute" ,  5.07);

    System.out.println(c1);
    System.out.println(c2);

        System.out.println(c1.reproducirYPausar()); 
        System.out.println(c1.reproducirYPausar()); 
    

        System.out.println(c2.reproducirYPausar());
    }
     }