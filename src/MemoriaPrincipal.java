public class MemoriaPrincipal {
    public String marca;
    public String modelo;
    public Integer velocidad;
    public Integer capacidadtotal;
    public String unidades;
    public Double precio;

    public String getNombreCompleto() { return marca + " " + modelo + " " + velocidad + " " + capacidadtotal + " " + unidades + " " + precio; }
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public Integer getVelocidad() { return velocidad; }
    public Integer getCapacidadTotal() { return capacidadtotal; }
    public Double getPrecio() { return precio; }

}
