package edu.teamrocket;

public class Bicicleta implements Movil{

    private final int id;

    Bicicleta(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public String toString(){

        StringBuilder mensaje = new StringBuilder();
        mensaje.append("Se te ha asignado la bicicleta de id " + getId());
        return mensaje.toString();
    }
}
