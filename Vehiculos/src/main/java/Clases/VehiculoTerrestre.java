/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author yoc91
 */
public class VehiculoTerrestre {
    public class Terrestre extends Vehiculo{
        private int NoLlantas; 
        private int año;
        
        public int getNoLlantas() {
            return NoLlantas;
        }

        public void setNoLlantas(int NoLlantas) {
            this.NoLlantas = NoLlantas;
        }

        public int getAño() {
            return año;
        }

        public void setAño(int año) {
            this.año = año;
        }
       }
    
        public class automovil extends VehiculoTerrestre{
            private String motor;
            private String NoPuertas;

        public String getMotor() {
            return motor;
        }

        public void setMotor(String motor) {
            this.motor = motor;
        }

        public String getNoPuertas() {
            return NoPuertas;
        }

        public void setNoPuertas(String NoPuertas) {
            this.NoPuertas = NoPuertas;
        }
            
    }
    
        public class moto extends VehiculoTerrestre{
            private String velocidades;
            private String cambios;

        public String getVelocidades() {
            return velocidades;
        }

        public void setVelocidades(String velocidades) {
            this.velocidades = velocidades;
        }

        public String getCambios() {
            return cambios;
        }

        public void setCambios(String cambios) {
            this.cambios = cambios;
        }
            
            
    }
        
    
}
