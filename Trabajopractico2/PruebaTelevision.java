public class PruebaTelevision {
    public static void main(String[] args) {
        Television tv1 = new Television ("Samsung", 55);
        Television tv2 = new Television("LG", 70);

        
        System.out.println(tv1.encendidoYApagado()); 

        System.out.println(tv1);

        
        tv1.subirVolumen();
        tv1.subirVolumen();
        tv1.subirVolumen();
        tv1.subirVolumen();
        System.out.println("Volumen:" + tv1.getvolumen());

        
        tv1.subirCanal();
        tv1.subirCanal();
        tv1.subirCanal();
         System.out.println("Canal:" + tv1.getCanal());

         System.out.println(tv2);
}
}


