package edu.teamrocket;

public class BiciPalma {

    public static void main(String[] args){

        Estacion estacion = new Estacion(1, "palma", 5);


        System.out.println(estacion.anclajesLibres());


        TarjetaUsuario usuario = new TarjetaUsuario("pepe", false);
        System.out.println(usuario);

        usuario.setActivada(true);
        System.out.println(usuario);

        System.out.println(estacion.leerTarjetaUsuario(usuario));


        System.out.println(estacion);




        Bicicleta bici = new Bicicleta(1);


        estacion.anclarBicicleta(bici);
        System.out.println(bici);        
        System.out.println(estacion.anclajesLibres());

        estacion.retirarBicicleta(usuario);
        System.out.println(estacion.anclajesLibres()); 
        
        

        usuario.setActivada(false);

        estacion.anclarBicicleta(bici);     
        System.out.println(estacion.anclajesLibres());

        estacion.retirarBicicleta(usuario);
        System.out.println(estacion.anclajesLibres());     
        
        usuario.setActivada(true);      
        estacion.retirarBicicleta(usuario);
        System.out.println(estacion.anclajesLibres());
    }
}
