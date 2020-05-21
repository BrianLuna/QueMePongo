package Negocio;

public class TipoDePrenda {
    private String nombre;
    private CategoriaDePrenda categoria;

    public TipoDePrenda(String nombre, CategoriaDePrenda categoria){
        this.nombre = nombre;
        this.categoria = categoria;
    }

    public CategoriaDePrenda getCategoria() {
        return categoria;
    }
}
