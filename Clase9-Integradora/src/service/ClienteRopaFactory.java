package service;

import model.ClienteRopa;

import java.util.HashMap;

public class ClienteRopaFactory {

    private final static HashMap<String, ClienteRopa> listaClienteRopa = new HashMap<>();

    public ClienteRopa crearClienteRopa(String pTipo){
        ClienteRopa clienteRopa1= listaClienteRopa.get(pTipo);

        if(clienteRopa1==null){
            clienteRopa1 = new ClienteRopa(pTipo);
        }

        return listaClienteRopa.get(pTipo);
    }
}
