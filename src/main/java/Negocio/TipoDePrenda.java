package Negocio;

public class TipoDePrenda {

    private CategoriaDePrenda categoria;

    TipoDePrenda(CategoriaDePrenda _categoriaDePrenda) {
        this.categoria = _categoriaDePrenda;
    }

    public boolean correspondeCategoria(CategoriaDePrenda unaCategoria){
        return categoria == unaCategoria;
    }

}