public class PlacaBase {
    public String marca;
    public String modelo;
    public Double precio;
    public String chipset;

    public String getNombreCompleto() {
        return marca + " " + modelo + " " + precio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Double getPrecio() {
        return precio;
    }

    public String getChipset() {
        return chipset;
    }
}
