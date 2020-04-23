package Negocio;

public class TipoDePrenda {
    private CategoriaDePrenda categoria;

    public TipoDePrenda(CategoriaDePrenda categoria){
        this.categoria = categoria;
    }

    public CategoriaDePrenda getCategoria() {
        return categoria;
    }
}
