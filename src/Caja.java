public class Caja {
    public String marca;
    public String modelo;
    public String fuentedealimentacion;
    public Double precio;

    public String getNombreCompleto() { return marca + " " + modelo + " " + fuentedealimentacion + " " + precio; }
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public String getFuenteDeAlimentacion() { return fuentedealimentacion; }
    public Double getPrecio() { return precio; }
}