import java.util.ArrayList;

public class ConfigurarPC {
    private String id;
    private String fecha;
    private PlacaBase placabase;  // cuando la dependencia a otra clase es 0: "private Procesador procesador = null;"
    private Procesador procesador; // dependencia de otra clase cuando es 1
    private ArrayList<MemoriaPrincipal> memoriaprincipal; //ArrayList es una variable de tipo coleccion que permite guardar varias memorias principales
    private Caja caja;
    private Usuario usuario;
}
