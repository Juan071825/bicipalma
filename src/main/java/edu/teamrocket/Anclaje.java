package edu.teamrocket;

public class Anclaje {

    private Boolean ocupado = false;
    private Movil bicicleta;

    Anclaje(){}

    Boolean isOcupado() {
        return ocupado;
    }

    Movil getBicicleta(){
        return bicicleta;
    }

    void anclarBicicleta(Movil bicicleta){
        this.bicicleta = bicicleta;
        ocupado=true;
    }

    void liberarBicicleta(){
        this.bicicleta = null;
        ocupado=false;
    }

    public String toString(){
        StringBuilder anclaje = new StringBuilder();
        anclaje.append("Bici: " + getBicicleta() + "  Ocupado: " + isOcupado());
        return anclaje.toString();
    }

}
