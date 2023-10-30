package configurar_ordenador;

public class PlacaBase {
    //Atributos
    public String marca;
    public String modelo;
    public Double precio;
    public String chipset;

    //Metodos (funcion dentro de una clase)
    //Guardar informacion public void (void = nada) set*nombre*(Integer *paramid*){atributo= paramid;}
    //this, operador que se refiere a los atributos de la clase, se puede usar en el ejemplo anterior: "" "" {this.id = id;}

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
