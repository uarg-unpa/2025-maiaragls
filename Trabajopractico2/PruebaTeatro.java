public class PruebaTeatro {
    public static void main(String[] args) {

        
        Obra obra1 = new Obra ("Cabaret", 20000);
        Obra obra2 = new Obra ("Wicked", 25000);
        Obra obra3 = new Obra ("Chicago ", 25000);

        Teatro teatro = new Teatro ("Teatro Colon ", "Cerrito 628, CP 1010, en la Ciudad Autónoma de Buenos Aires", obra1, obra2, obra3);
        
        System.out.println(teatro);


         teatro.setNombre("Teatro Opera");
         teatro.setDireccion(": Av. Corrientes Nº 860.");

        teatro.setObra1(new Obra("Falsettos", 20000));

        System.out.println(teatro);
    }

}