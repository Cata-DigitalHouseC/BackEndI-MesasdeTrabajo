package services;

import model.Hotel;
import model.Vuelo;

public class FacadeBusqueda implements IFacadeBusqueda{

    private SistemaHotel sistHotel;
    private SistemaVuelo sistVuelo;

    public FacadeBusqueda(){
        sistHotel = new SistemaHotel();
        sistVuelo = new SistemaVuelo();
    }

    public String busquedaViaje(Vuelo vuelo, Hotel hotel){
        return sistVuelo.busquedaVuelo(vuelo)+" y "+sistHotel.busquedaHotel(hotel);
    }
}
