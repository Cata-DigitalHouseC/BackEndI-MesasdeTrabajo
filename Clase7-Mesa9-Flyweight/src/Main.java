import flyweight.ArbolFactory;
import model.Arbol;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Arbol> bosque = new ArrayList<>();
        ArbolFactory factory = new ArbolFactory();

        for (int i=1; i<1000000; i++){
            if(i<500000) {
                bosque.add(factory.crearArbol("Ornamentales"));
            }else{
                bosque.add(factory.crearArbol("Frutales"));
            }
        }
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Memoria usada: " + (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024));

    }
}