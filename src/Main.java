public class Main {
    public static void main(String[] args) {
        Procesador procesador = new Procesador();
        procesador.marca = "AMD";
        procesador.modelo = "AM456";
        procesador.precio = 3.4;

        System.out.println("Procesador");

        PlacaBase placabase = new PlacaBase();
        placabase.marca = "Gigabyte";
        placabase.modelo = "B550";
        placabase.precio = 144.99;
        placabase.chipset = "AMD b550";

        System.out.println("PlacaBase");
    }
}