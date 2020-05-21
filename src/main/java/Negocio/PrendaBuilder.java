package Negocio;

import Excepciones.FaltaParametroException;

import static java.util.Objects.requireNonNull;

public class PrendaBuilder {

    private TipoDePrenda tipoDePrenda;
    private Material material;
    private Color colorPrimario;
    private Color colorSecundario;
    private Trama trama;

    public PrendaBuilder(TipoDePrenda tipoDePrenda){
        this.tipoDePrenda = requireNonNull(tipoDePrenda, "Es requerido ingresar el tipo de prenda");
        this.trama = Trama.LISA;
    }

    public void cargarMaterial(Material material){
        this.material = requireNonNull(material, "Es requerido ingresar la tela o material");
    }

    public void cargarColorPrimario(Color colorPrimario){
        this.colorPrimario = requireNonNull(colorPrimario, "Es requerido ingresar el Color primario");
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
