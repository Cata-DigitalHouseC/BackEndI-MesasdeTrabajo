package model;

public class Arbol {

    private int ancho;
    private int alto;
    private String color;
    private String tipo;

    public Arbol(String pTipo) {
        if(pTipo == "Ornamentales"){
            this.tipo=pTipo;
            this.ancho=400;
            this.alto= 200;
            this.color="verde";
        }else if(pTipo == "Frutales"){
            this.tipo=pTipo;
            this.ancho=500;
            this.alto= 300;
            this.color="verde";
        }else if(pTipo == "Frutales") {
            this.tipo = pTipo;
            this.ancho = 200;
            this.alto = 100;
            this.color = "verde";
        }
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
