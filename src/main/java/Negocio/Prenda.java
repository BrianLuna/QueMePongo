package Negocio;

import Excepciones.FaltaParametroException;

public class Prenda {
    private TipoDePrenda tipoDePrenda;
    private Material material;
    private Color colorPrimario;
    private Color colorSecundario;

    public Prenda(TipoDePrenda tipoDePrenda, Material material, Color colorPrimario){
        if (tipoDePrenda == null) throw new FaltaParametroException("Es requerido ingresar el Tipo de prenda");
        if (material == null) throw new FaltaParametroException("Es requerido ingresar la tela o material");
        if (colorPrimario == null) throw new FaltaParametroException("Es requerido ingresar el Color primario");

        this.tipoDePrenda = tipoDePrenda;
        this.material = material;
        this.colorPrimario = colorPrimario;

    }

    public void setColorSecundario(Color colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

    public CategoriaDePrenda categoriaDePrenda(){
        return tipoDePrenda.getCategoria();
    }
}