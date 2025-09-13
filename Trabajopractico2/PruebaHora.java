public class PruebaHora {
    public static void main(String[] args) {
        Hora h1 = new Hora(17, 17, 34); 
        Hora h2 = new Hora(25, 90, 200); 

        System.out.println(h1);
        System.out.println(h2);

        h2.setHora(14);
        h2.setMinutos(15);
        h2.setSegundos(43);

        System.out.println(h2);


        System.out.println("Hora 1 en minutos: " + h1.enMinutos());
        System.out.println("Hora 2 en minutos: " + h2.enMinutos());
    }
}
