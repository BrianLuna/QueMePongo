package Negocio;

public class Uniforme {
    private final Prenda prendaSuperior;
    private final Prenda prendaInferior;
    private final Prenda calzado;
    private final Prenda accesorio;

    public Uniforme(Prenda prendaSuperior, Prenda prendaInferior, Prenda calzado, Prenda accesorio){
        this.prendaSuperior = prendaSuperior;
        this.prendaInferior = prendaInferior;
        this.calzado = calzado;
        this.accesorio = accesorio;
    }

    public static Uniforme fabricar(Sastre sastre){
        return new Uniforme(sastre.fabricarPrendaSuperior(), sastre.fabricarPrendaInferior(), sastre.fabricarCalzado(), null);
    }

    public Boolean poseePrendasConTemperaturaInsuficiente(Temperatura temperatura){
        return this.prendaSuperior.sePuedeUsarConTemperatura(temperatura)
                || this.prendaInferior.sePuedeUsarConTemperatura(temperatura)
                || this.calzado.sePuedeUsarConTemperatura(temperatura)
                || this.accesorio.sePuedeUsarConTemperatura(temperatura);
    }

}
