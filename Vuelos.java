/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadevuelo.clases;

/**
 *
 * @author camper
 */
public class Vuelos {
    private String aerolinea;
    private String destino;
    private String asiento;
    private double costo;
    
    public Vuelos(String aerolinea, String destino, String asiento){
        this.aerolinea = aerolinea;
        this.destino = destino;
        this.asiento = asiento;
        this.costo = 0;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
    
    public String toString(){
        return "Aerolinea: " + aerolinea + " destino: " + destino + " Primera Clase: " + asiento + " Costo: " + getCosto();
    }
    
}
