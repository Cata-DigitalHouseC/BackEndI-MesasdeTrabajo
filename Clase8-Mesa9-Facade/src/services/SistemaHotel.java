package services;

import model.Hotel;

public class SistemaHotel {

    public String busquedaHotel(Hotel hotel)
    {
        return "Se encontro hotel para la ciudad "+hotel.getCiudad()+" entre las fechas: "+hotel.getFechaEntrada()+" y "+hotel.getFechaSalida();
    }
}
