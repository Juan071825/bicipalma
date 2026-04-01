package edu.teamrocket;

public class TarjetaUsuario implements Autenticacion{
    
    private final String id;
    private Boolean activada = false;

    public TarjetaUsuario(String id, Boolean activada){
        this.id = id;
        this.activada = activada;
    }

    public Boolean isActivada(){
        return this.activada;
    }

    public void setActivada(Boolean estado){
        this.activada = estado;
    }

    public String getId(){
        return this.id;
    }

    public String toString(){
        StringBuilder tarjetaUsuario = new StringBuilder();
        tarjetaUsuario.append("El estado de autenticacion de " + 
                              getId() + " es " + isActivada());
        return tarjetaUsuario.toString();
    }

}
