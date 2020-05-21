package Negocio;

public class Prenda {
    private final TipoDePrenda tipoDePrenda;
    private final Material material;
    private final Color colorPrimario;
    private final Color colorSecundario;
    private final Trama trama;

    public Prenda(TipoDePrenda tipoDePrenda, Material material, Color colorPrimario, Color colorSecundario, Trama trama){
        this.tipoDePrenda = tipoDePrenda;
        this.material = material;
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
        this.trama = trama;
    }

    public CategoriaDePrenda categoriaDePrenda(){
        return tipoDePrenda.getCategoria();
    }
}