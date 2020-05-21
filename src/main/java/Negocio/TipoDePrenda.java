package Negocio;

import static java.util.Objects.requireNonNull;

public class TipoDePrenda {
    private CategoriaDePrenda categoria;
    private Temperatura temperaturaMaxima;

    public TipoDePrenda(CategoriaDePrenda categoria, Temperatura temperaturaMaxima){
        this.categoria = requireNonNull(categoria, "Debe especificar la categoría");
        this.temperaturaMaxima = requireNonNull(temperaturaMaxima, "Debe especificar la temperatura máxima");
    }

    public CategoriaDePrenda getCategoria() {
        return categoria;
    }

    public Boolean sePuedeUsarConTemperatura(Temperatura temperatura){
        return this.temperaturaMaxima.esMayorA(temperatura);
    }
}
