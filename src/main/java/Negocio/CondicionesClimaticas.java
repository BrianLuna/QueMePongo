package Negocio;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CondicionesClimaticas {
    private AccuWeatherAPI servicioDeClima;
    private LocalDateTime ultimaConsulta;
    private Temperatura temperaturaConsultada;
    private Integer intervaloDeConsultaEnHoras;

    public CondicionesClimaticas (AccuWeatherAPI servicioDeClima){
        this.servicioDeClima = servicioDeClima;
        this.intervaloDeConsultaEnHoras = 12;
        this.ultimaConsulta = LocalDateTime.MIN;
    }

    @SuppressWarnings("unchecked")
    private void consultarClima() {
        List<Map<String, Object>> resultadoDeConsulta = this.servicioDeClima.getWeather("Buenos Aires, Argentina");
        Map<String, Object> temperatura = (HashMap<String, Object>) resultadoDeConsulta.get(0).get("Temperature");
        long epochDateTime = (long) resultadoDeConsulta.get(0).get("EpochDateTime");
        this.temperaturaConsultada = new Temperatura(BigDecimal.valueOf((Double) temperatura.get("value")), temperatura.get("Unit") == "F" ? UnidadDeTemperatura.F : UnidadDeTemperatura.C);
        this.ultimaConsulta = LocalDateTime.ofInstant(Instant.ofEpochMilli(epochDateTime), ZoneId.systemDefault());
    }

    public void setIntervaloDeConsultaEnHoras(Integer intervaloDeConsultaEnHoras) {
        this.intervaloDeConsultaEnHoras = intervaloDeConsultaEnHoras;
    }

    public Temperatura getTemperatura(){
        this.actualizarInformacionSiEsNecesario();
        return this.temperaturaConsultada;
    }

    private void actualizarInformacionSiEsNecesario() {
        if(LocalDateTime.now().minusHours(this.intervaloDeConsultaEnHoras).isAfter(this.ultimaConsulta)){
            this.consultarClima();
        }
    }
}
