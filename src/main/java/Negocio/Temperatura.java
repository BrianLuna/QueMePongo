package Negocio;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Temperatura {
    private BigDecimal valor;
    private UnidadDeTemperatura unidadDeTemperatura;

    public Temperatura(BigDecimal temperatura, UnidadDeTemperatura unidadDeTemperatura){
        this.unidadDeTemperatura = unidadDeTemperatura;
        this.valor = temperatura.setScale(2, RoundingMode.HALF_UP);
    }

    public BigDecimal cambiarUnidad(){
        return unidadDeTemperatura.cambiarUnidad(this.valor);
    }

    public Boolean esMayorA(Temperatura temperatura){
        if(this.unidadDeTemperatura.equals(temperatura.unidadDeTemperatura)){
            return this.valor.compareTo(temperatura.valor) >= 0;
        } else {
            return this.cambiarUnidad().compareTo(temperatura.valor) >= 0;
        }
    }
}
