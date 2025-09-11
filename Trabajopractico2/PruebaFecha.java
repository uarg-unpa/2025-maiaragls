public class PruebaFecha {
    public static void main(String[] args) {
    
    Fecha mayor =null;

        Fecha f1 = new Fecha(20, 3, 1998); 
        System.out.println(f1); 

        Fecha f2 = new Fecha(17, 1, 2005); 
        System.out.println(f2);

        Fecha f3 = new Fecha(46, 10, 2005); 
        System.out.println(f3);


        
        if (f1.getAnio() > f2.getAnio()) {
            mayor = f1;
        } else if (f2.getAnio() > f1.getAnio()) {
            mayor = f2;
        } else {
            System.out.println("Las dos fechas tienen el mismo año");
        }
         System.out.printf("La fecha con mayor año es: %02d/%02d/%04d\n", mayor.getDia(), mayor.getMes(), mayor.getAnio());
    }
}