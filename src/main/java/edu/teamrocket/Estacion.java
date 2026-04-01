package edu.teamrocket;

public class Estacion {

    private final int id;
    private final String direccion;
    private final Anclajes anclajes;

    public Estacion(int id, String direccion, int numeroAnclajes){

        this.id = id;
        this.direccion = direccion;
        this.anclajes = new Anclajes(numeroAnclajes);
    }

    private int getId(){
        return this.id;
    }

    private String getDireccion(){
        return this.direccion;
    }   

    public String toString(){
        StringBuilder estacion = new StringBuilder();
        estacion.append("Estación de id: " + getId() + '\n' 
                        + "direccion: " + getDireccion() + '\n' +
                        "nº anclajes: " + numAnclajes());
        return estacion.toString();
    }

    private Anclaje[] anclajes(){
        return this.anclajes.anclajes();
    }

    private int numAnclajes(){
        return this.anclajes.numAnclajes();
    }

    public void consultarEstacion(){
        System.out.println(this);
    }

    public int anclajesLibres(){
        int numeroLibres = 0;
        for(Anclaje anclaje : anclajes()){
            if(anclaje.isOcupado() == false){
                numeroLibres += 1;
            }
        }
        return numeroLibres;
    }

    void anclarBicicleta(Movil bicicleta){
        if(anclajesLibres() > 0){
            for(Anclaje anclaje : anclajes()){
                if(anclaje.isOcupado() == false){
                    anclaje.anclarBicicleta(bicicleta);
                    break;
                }
            }
        }
    }
  
    public Boolean leerTarjetaUsuario(Autenticacion autenticacion){
        return autenticacion.isActivada();
    }

    public void retirarBicicleta(Autenticacion autenticacion){
        if(leerTarjetaUsuario(autenticacion) == true && anclajesLibres() < numAnclajes()){
            for(Anclaje anclaje : anclajes()){
                if(anclaje.isOcupado() == true){
                    anclaje.liberarBicicleta();
                }
            }
        }
    }

    private void mostrarBicicleta(Movil bicicleta, int numeroAnclaje){
        System.out.println("La bicicleta " + bicicleta.getId() + " ha sido retirada del anclaje " + numeroAnclaje);
    }

    private void mostrarAnclaje(Movil bicicleta, int numeroAnclaje){
        System.out.println("El anclaje " + numeroAnclaje + " contiene la bicicleta " + bicicleta.getId());
    }

    public void consultarAnclajes(){

        for(Anclaje anclaje : anclajes()){
            int numeroAnclaje = 0;
            if(anclaje.isOcupado() == true){
                numeroAnclaje += 1;
                System.out.println("El anclaje " + numeroAnclaje + " está ocupado por la bicicleta de id " + anclaje.getBicicleta().getId());
            }
            else {
                numeroAnclaje += 1;
                System.out.println("El anclaje " + numeroAnclaje + " no está ocupado");
            }
        }
    }

}
