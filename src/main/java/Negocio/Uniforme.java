package Negocio;

public class Uniforme {
    private final Prenda prendaSuperior;
    private final Prenda prendaInferior;
    private final Prenda calzado;

    private Uniforme(Prenda prendaSuperior, Prenda prendaInferior, Prenda calzado){
        this.prendaSuperior = prendaSuperior;
        this.prendaInferior = prendaInferior;
        this.calzado = calzado;
    }

    public static Uniforme fabricar(Sastre sastre){
        return new Uniforme(sastre.fabricarPrendaSuperior(), sastre.fabricarPrendaInferior(), sastre.fabricarCalzado());
    }

}
