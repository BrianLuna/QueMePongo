package Negocio;

import Excepciones.CategoriaInconsistenteException;
import Excepciones.FaltaParametroException;

import java.awt.Color;

public class Prenda {
    private TipoDePrenda tipoDePrenda;
    private CategoriaDePrenda categoriaDePrenda;
    private String telaOMaterial;
    private Color colorPrimario;
    private Color colorSecundario;

    public Prenda(TipoDePrenda _tipoDePrenda, CategoriaDePrenda _categoriaDePrenda, String _telaOMaterial, Color _colorPrimario){
        if (_tipoDePrenda == null) throw new FaltaParametroException("Es requerido ingresar el Tipo de prenda");
        if (_categoriaDePrenda == null) throw new FaltaParametroException("Es requerido ingresar el Tipo de prenda");
        if (_telaOMaterial == null) throw new FaltaParametroException("Es requerido ingresar la tela o material");
        if (_colorPrimario == null) throw new FaltaParametroException("Es requerido ingresar el Color primario");
        if (!_tipoDePrenda.correspondeCategoria(_categoriaDePrenda)) throw new CategoriaInconsistenteException(_tipoDePrenda, _categoriaDePrenda);

        tipoDePrenda = _tipoDePrenda;
        categoriaDePrenda = _categoriaDePrenda;
        telaOMaterial = _telaOMaterial;
        colorPrimario = _colorPrimario;

    }

    public void setColorSecundario(Color colorSecundario) {
        this.colorSecundario = colorSecundario;
    }
}