public class Main {
    public static void main(String[] args) {
        Procesador procesador = new Procesador();
        procesador.marca = "AMD";
        procesador.modelo = "AM456";
        procesador.precio = 3.4;

        System.out.println("Procesador");

        PlacaBase placabase = new PlacaBase(); //new es un operador que crea un objeto
        placabase.marca = "Gigabyte";
        placabase.modelo = "B550";
        placabase.precio = 144.99;
        placabase.chipset = "AMD b550";

        System.out.println("PlacaBase");

        MemoriaPrincipal memoriaprincipal= new MemoriaPrincipal();
        memoriaprincipal.marca = "Corsair";
        memoriaprincipal.modelo = "Vengeance LPX";
        memoriaprincipal.velocidad = 3200;
        memoriaprincipal.capacidadtotal = 32;
        memoriaprincipal.unidades = "2x16";
        memoriaprincipal.precio = 72.99;

        System.out.println("MemoriaPrincipal");

        Caja caja= new Caja();
        caja.marca = "Alurin";
        caja.modelo = "Torre ATX negra";
        caja.fuentedealimentacion = "Fuente de Alimentacion 500W";
        caja.precio = 54.99;

        System.out.println("Caja");
    }
}