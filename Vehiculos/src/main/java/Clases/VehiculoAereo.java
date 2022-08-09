/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author yoc91
 */
public class VehiculoAereo extends Vehiculo{
    private Double rapidez;
    private int precio;
    private String cantPasajeros;
    private String motor;

    public Double getRapidez() {
        return rapidez;
    }

    public void setRapidez(Double rapidez) {
        this.rapidez = rapidez;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getCantPasajeros() {
        return cantPasajeros;
    }

    public void setCantPasajeros(String cantPasajeros) {
        this.cantPasajeros = cantPasajeros;
    }
    
    public class avion extends VehiculoAereo{
            private String tipo;
            private String CantPilotos;
    }
    
    public class helicoptero extends VehiculoAereo{
            private String NoHelices;
            private String tipo;
    }
    
    
}
