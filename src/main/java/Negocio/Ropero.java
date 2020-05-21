package Negocio;

import com.google.common.collect.Sets;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Ropero {
    private Set<Prenda> prendas;
    private CondicionesClimaticas condicionesClimaticas;

    public Ropero(Set<Prenda> prendas, CondicionesClimaticas condicionesClimaticas){
        if (prendas == null){
            this.prendas = new HashSet<>();
        } else{
            this.prendas = prendas;
        }
        this.condicionesClimaticas = condicionesClimaticas;
    }

    private Set<Prenda> prendasSuperiores(){
        return obtenerPrendasDelTipo(CategoriaDePrenda.PARTESUPERIOR);
    }

    private Set<Prenda> prendasInferiores(){
        return obtenerPrendasDelTipo(CategoriaDePrenda.PARTEINFERIOR);
    }

    private Set<Prenda> calzados(){
        return obtenerPrendasDelTipo(CategoriaDePrenda.CALZADO);
    }

    private Set<Prenda> accesorios(){
        return obtenerPrendasDelTipo(CategoriaDePrenda.ACCESORIO);
    }

    private Set<Prenda> obtenerPrendasDelTipo(CategoriaDePrenda categoria){
        return this.prendas.stream().filter(prenda -> prenda.categoriaDePrenda().equals(categoria)).collect(Collectors.toSet());
    }

    public Set<Uniforme> obtenerSugerencia(){
        return Sets
                .cartesianProduct(this.prendasSuperiores(), this.prendasInferiores(), this.calzados(), this.accesorios())
                .stream()
                .map(lista -> new Uniforme(lista.get(0), lista.get(1), lista.get(2), lista.get(3)))
                .filter(uniforme -> uniforme.poseePrendasConTemperaturaInsuficiente(condicionesClimaticas.getTemperatura()))
                .collect(Collectors.toSet());
    }
}
