package configurar_ordenador;

//Esta clase esta añadida a GIT
public class Procesador {
    //Estados, atributos, propiedades
    public String marca;
    public String modelo;
    public Double precio;

    //Comportamiento o método (funciones)
    // public (+) método accesible desde cualquier calse.
    // String: tipo devuelto por el método
    public String getNombreCompleto(){
        //Concatenar cadenas con +
        // AMD 7600 32.2
        return marca + " " + modelo + " " + precio;
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public Double getPrecio(){
        return precio;
    }


}