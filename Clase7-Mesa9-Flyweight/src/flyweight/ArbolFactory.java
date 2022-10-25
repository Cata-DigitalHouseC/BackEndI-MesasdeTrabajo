package flyweight;

import model.Arbol;

import java.util.HashMap;
import java.util.Map;

public class ArbolFactory {

    private final static Map<String, Arbol> bosque = new HashMap<>();

    public Arbol crearArbol(String pTipo){

        if(!bosque.containsKey(pTipo)){
            bosque.put(pTipo, new Arbol(pTipo));
            return bosque.get(pTipo);
        }

        return bosque.get(pTipo);
    }
}
