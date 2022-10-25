package services;

import model.Hotel;
import model.Vuelo;

public interface IFacadeBusqueda {
    public String busquedaViaje(Vuelo vuelo, Hotel hotel);
}
