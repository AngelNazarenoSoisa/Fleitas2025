package Principal;

public class Main {
    public static void main(String[] args) {
      
        Superheroe spiderman = new Superheroe("Spider-Man");
        spiderman.setDescripcion("Traje rojo y azul, telarañas");
        spiderman.setCapa(false);

        Superheroe batman = new Superheroe("Batman");
        batman.setDescripcion("Traje negro, orejas puntiagudas");
        batman.setCapa(true);

        Superheroe ironman = new Superheroe("Iron Man");
        ironman.setDescripcion("Armadura roja y dorada");
        ironman.setCapa(false);

   
        Dimension dim1 = new Dimension(10, 5, 4);
        Dimension dim2 = new Dimension(12, 6, 5);
        Dimension dim3 = new Dimension(11, 5, 5);

       
        Figura fig1 = new Figura("SP001", 1500.0, dim1, spiderman);
        Figura fig2 = new Figura("BT001", 2000.0, dim2, batman);
        Figura fig3 = new Figura("IM001", 1800.0, dim3, ironman);

       
        Coleccion coleccionMarvel = new Coleccion("Héroes Mixtos");

       
        coleccionMarvel.añadirFigura(fig1);
        coleccionMarvel.añadirFigura(fig2);
        coleccionMarvel.añadirFigura(fig3);

        
        System.out.println(coleccionMarvel);

       
        coleccionMarvel.subirPrecio(300.0, "SP001");

        
        System.out.println("Figuras con capa:");
        System.out.println(coleccionMarvel.conCapa());

        
        System.out.println("Figura más valiosa:");
        System.out.println(coleccionMarvel.masValioso());

        
        System.out.println("Valor total de la colección: $" + coleccionMarvel.getValorColeccion());

       
        System.out.println("Volumen total de la colección: " + coleccionMarvel.getVolumenColeccion());
    }
}
