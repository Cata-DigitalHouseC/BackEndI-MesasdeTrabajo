import model.Hotel;
import model.Vuelo;
import services.FacadeBusqueda;

public class Main {
    public static void main(String[] args) {
        String fechaSalida= "2022-01-05";
        String fechaLlegada = "2022-01-01";
        String ciudadDestino = "Lima";
        String ciudadOrigen ="Quito";

        Vuelo vuelo1= new Vuelo(fechaLlegada,fechaSalida, ciudadOrigen, ciudadDestino);
        Hotel hotel1= new Hotel(fechaLlegada, fechaSalida,ciudadDestino);
        FacadeBusqueda facade = new FacadeBusqueda();
        System.out.println("Busqueda: "+facade.busquedaViaje(vuelo1, hotel1));


    }
}