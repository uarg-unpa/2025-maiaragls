public class PruebaPelicula {

    public static void main(String[] args) {

        Pelicula p1 = new Pelicula("Orgullo y prejuicio", "Joe Wright",2005, 2.08);
        Pelicula p2 = new Pelicula("Blade runner", "Ridley Scott", 1982, 1.57);
        Pelicula p3 = new Pelicula("The Lord of the Rings: The Fellowship of the Ring", "Peter Jackson", 2001, 2.58);
        Pelicula p4= new Pelicula("Amelie", "Jean-Pierre Jeunet ", 2001, 2.02);

    
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

        System.out.println("Antiguedad de Blade runner:"+ " " + p2.calcularAntiguedad(2025) + " " +"años");
        System.out.println("Antiguedad The Lord of the Rings:"+ " " + p2.calcularAntiguedad(2025) + " " +"años");
    
}
}
