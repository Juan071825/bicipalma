package edu.teamrocket;

import java.util.concurrent.ThreadLocalRandom;

class Anclajes {

    private final Anclaje[] anclajes;

    Anclajes(int numeroAnclajes){
        this.anclajes = new Anclaje[numeroAnclajes];
        crearAnclajes();
    }

    private void crearAnclajes(){
        for(int i=0; i<this.anclajes.length; i++){
            this.anclajes[i] = new Anclaje();
        }
    }

    Anclaje[] anclajes(){
        return this.anclajes;
    }

    int numAnclajes(){
        return this.anclajes.length;
    }

    void ocuparAnclaje(int indexAnclaje, Movil bicicleta){

        this.anclajes[indexAnclaje].anclarBicicleta(bicicleta);
    }

    boolean isAnclajeOcupado(int indexAnclaje){

        return this.anclajes[indexAnclaje].isOcupado();
    }

    void liberarAnclaje(int indexAnclaje){
        this.anclajes[indexAnclaje].liberarBicicleta();
    }

    Movil getBicicletaById(int idBicicleta){

            for(Anclaje anclaje : this.anclajes){
                Movil bicicleta = anclaje.getBicicleta();
                if(bicicleta.getId() == idBicicleta){
                    return anclaje.getBicicleta();
                }
            }
            return null;
    }

    Movil getBicicletaAt(int indexAnclaje){
        try{
            return this.anclajes[indexAnclaje].getBicicleta();
        } catch (IndexOutOfBoundsException excepcion){
            return null;
        }
    }


    int seleccionarAnclaje() {
        return ThreadLocalRandom.current().nextInt(0, numAnclajes());
    }

    public String toString(){
        StringBuilder anclajes = new StringBuilder();
        anclajes.append("Numero de anclajes" + numAnclajes());
        return anclajes.toString();
    }

}