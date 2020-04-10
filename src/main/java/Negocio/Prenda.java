package Negocio;

import Excepciones.FaltaParametroException;

import java.awt.Color;

public class Prenda {
    private TipoDePrenda tipoDePrenda;
    private String telaOMaterial;
    private Color colorPrimario;
    private Color colorSecundario;

    public Prenda(TipoDePrenda _tipoDePrenda, String _telaOMaterial, Color _colorPrimario){
        if (_tipoDePrenda == null) throw new FaltaParametroException("Es requerido ingresar el Tipo de prenda");
        if (_telaOMaterial == null) throw new FaltaParametroException("Es requerido ingresar la tela o material");
        if (_colorPrimario == null) throw new FaltaParametroException("Es requerido ingresar el Color primario");

        tipoDePrenda = _tipoDePrenda;
        telaOMaterial = _telaOMaterial;
        colorPrimario = _colorPrimario;

    }

    public void setColorSecundario(Color colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

    public CategoriaDePrenda categoriaDePrenda(){
        return tipoDePrenda.getCategoria();
    }
}