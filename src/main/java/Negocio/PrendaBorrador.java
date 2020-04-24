package Negocio;

import Excepciones.FaltaParametroException;

public class PrendaBorrador {

    private TipoDePrenda tipoDePrenda;
    private Material material;
    private Color colorPrimario;
    private Color colorSecundario;
    private Trama trama = Trama.LISA;

    public void cargarTipo(TipoDePrenda tipoDePrenda){
        if (tipoDePrenda == null) throw new FaltaParametroException("Es requerido ingresar el Tipo de prenda");
        this.tipoDePrenda = tipoDePrenda;
    }

    public void cargarMaterial(Material material){
        if (material == null) throw new FaltaParametroException("Es requerido ingresar la tela o material");
        this.material = material;
    }

    public void cargarColorPrimario(Color colorPrimario){
        if (colorPrimario == null) throw new FaltaParametroException("Es requerido ingresar el Color primario");
        this.colorPrimario = colorPrimario;
    }

    public void cargarColorSecundario(Color colorSecundario){
        this.colorSecundario = colorSecundario;
    }

    public void cargarTrama(Trama trama){
        if (trama == null){
            this.trama = Trama.LISA;
        }else{
            this.trama = trama;
        }
    }

    public Prenda confirmarPrenda(){
        return new Prenda(tipoDePrenda, material, colorPrimario, colorSecundario, trama);
    }

}
