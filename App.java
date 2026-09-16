/* 
public class App {
    public static void main(String[] args) {
        /*Punto p1 = new Punto();

    System.out.println(p1.getX());
    System.out.println(p1.getY());
    p1.setX(2);
    p1.setY(3);
    

   Punto p1 = new Punto (2,3);
   Punto p2 = new Punto (8);
   Punto p3 = new Punto ();
   System.out.println(p1.getx());
   System.out.println(p1.setx());
   System.out.println(p2.getx());
   System.out.println(p2.setx());
   System.out.println(p3.getx());
   System.out.println(p3.setx());
    }

}
*/
public class App {
    public static void main(String[] args) throws Exception {
       




        Libro libro1 = new Libro("El Principito", "Antoine de Saint-Exupéry", true);
        Libro libro2 = new Libro();
        libro2.setTitulo("Don Quijote de la Mancha");
        libro2.setAutor("Miguel de Cervantes");
        libro2.setDisponible(true);
        Libro libro3 = new Libro("Furia", "Tracy Wolff ", true);
        System.out.println("\n--- Catálogo de Libros ---");
        libro1.mostrarInformacion();
        System.out.println();
        libro2.mostrarInformacion();
        libro3.mostrarInformacion();

        System.out.println("\n--- Préstamo y Devolución ---");
        libro1.prestar();
        libro1.prestar();
        libro1.devolver();

        Vuelo vuelo1 = new Vuelo("AV123", "Bogotá", "Medellín", 150, 200);
        Vuelo vuelo2 = new Vuelo();
        vuelo2.setNumero("AV456");
        vuelo2.setOrigen("Cali");
        vuelo2.setDestino("Cartagena");
        vuelo2.setCapacidad(180);
        vuelo2.setOcupacion(190); 
        Vuelo vuelo3 = new Vuelo("AV789", "Barranquilla", "Santa Marta", 100, 150);
        

        System.out.println("\n---Información de Vuelos ---");
        vuelo1.mostrarInformacion();
        System.out.println();
        vuelo2.mostrarInformacion();
        vuelo3.mostrarInformacion();

        System.out.println("\n--- Embarque de Pasajeros ---");
        vuelo1.embarcar(30);
        vuelo1.embarcar(25);
        vuelo1.desembarcar(15);
        vuelo1.desembarcar(20);

        System.out.println("\n--- Estado final del vuelo 1 ---");

    }
}