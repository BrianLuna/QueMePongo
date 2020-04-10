package Negocio;

public class TipoDePrenda {

    private CategoriaDePrenda categoria;

    TipoDePrenda(CategoriaDePrenda _categoriaDePrenda) {
        categoria = _categoriaDePrenda;
    }

    public CategoriaDePrenda getCategoria(){
        return categoria;
    }

}