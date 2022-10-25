package services;

import model.Vuelo;

public class SistemaVuelo {
    public String busquedaVuelo(Vuelo vuelo){
        return "Se encontro vuelo dede "+vuelo.getCiudadOrigen()+" para la ciudad "+vuelo.getCiudadDestino()+" entre las fechas: "+vuelo.getFechaEntrada()+" y "+vuelo.getFechaSalida();
    }
}
