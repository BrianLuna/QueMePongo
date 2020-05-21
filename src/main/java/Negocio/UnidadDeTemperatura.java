package Negocio;

import java.math.BigDecimal;
import java.math.RoundingMode;

public enum UnidadDeTemperatura {
    F {
        @Override
        public BigDecimal cambiarUnidad(BigDecimal valor){
            return valor.subtract(BigDecimal.valueOf(32)).divide(BigDecimal.valueOf(1.8), RoundingMode.HALF_UP);
        }
    },
    C {
        @Override
        public BigDecimal cambiarUnidad(BigDecimal valor){
            return valor.multiply(BigDecimal.valueOf(1.8)).add(BigDecimal.valueOf(32));
        }
    };

    public abstract BigDecimal cambiarUnidad(BigDecimal valor);
}