public class TestPersona {
     public static void main(String[] args) {
        Domicilio dom1 = new Domicilio("Av. Rivadavia", 1234);
        Persona p1 = new Persona("Laura", 20, "12345678", 'M', 60.5, 1.65, dom1);
        System.out.println(p1);
        System.out.println(p1.infoDomicilio());

        Persona p2 = new Persona("Pedro");
        System.out.println(p2); // Domicilio por defecto

        Domicilio dom3 = new Domicilio("Prefectura naval", 1020);
        Persona p3 = new Persona ("Carla", 20, "45862593", 'M', 75.2, 1.70, dom3);
        System.out.println(p3);
        System.out.println(p3.infoDomicilio());
    }
}
