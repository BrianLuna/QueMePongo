package Excepciones;
import Negocio.CategoriaDePrenda;
import Negocio.TipoDePrenda;

public class CategoriaInconsistenteException extends RuntimeException{
    public CategoriaInconsistenteException(TipoDePrenda _tipoDePrenda, CategoriaDePrenda _categoriaDePrenda) {
        super("El tipo de prenda " + _tipoDePrenda + " no pertenece a la categoría " + _categoriaDePrenda);
    }
}