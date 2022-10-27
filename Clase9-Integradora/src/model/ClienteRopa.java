package model;

public class ClienteRopa {

    private String talle;
    private String tipo;
    private boolean esNuevo;
    private boolean importada;

    public ClienteRopa(String pTipo) {
        this.tipo=pTipo;
    }



    public String getTalle() {
        return talle;
    }

    public void setTalle(String talle) {
        this.talle = talle;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isEsNuevo() {
        return esNuevo;
    }

    public void setEsNuevo(boolean esNuevo) {
        this.esNuevo = esNuevo;
    }

    public boolean isImportada() {
        return importada;
    }

    public void setImportada(boolean importada) {
        this.importada = importada;
    }
}
