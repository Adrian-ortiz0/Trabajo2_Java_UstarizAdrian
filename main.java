/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemadevuelo;

import com.mycompany.sistemadevuelo.clases.Vuelos;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author camper
 */
public class SistemaDeVuelo {

    public static void main(String[] args) {
        
        double costoDestino = 0;
        double costoAsiento = 0;
        int count = 0;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Bienvenido al sistema de vuelos de campus!");
        
        ArrayList<Vuelos> reservas = new ArrayList();
        
        while(true){
            
            System.out.println("1. Realizar reserva");
            System.out.println("2. Cancelar reservas");
            System.out.println("3. Ver Reservas");
            System.out.println("0. Salir");
            
            int input = Integer.parseInt(scan.nextLine());
            if(input == 0){
                System.out.println("Hasta luego..");
                break;
            } else if(input == 1){
                System.out.println("Elige la aerolinea (avianca/latam): ");
                String aerolinea = scan.nextLine();
                if(aerolinea.equalsIgnoreCase("avianca")|| aerolinea.equalsIgnoreCase("latam")){
                } else {
                    System.out.println("Elige una aerolinea valida!");
                    continue;
                }
                System.out.println("Escribe el destino: ");
                String destino = scan.nextLine();
                if(destino.equalsIgnoreCase("colombia")){
                    costoDestino = 200.00;
                } else {
                    costoDestino = 500.00;
                }        
                System.out.println("Vuelas en primera fila? (si/no)");
                String asiento = scan.nextLine();
                
                if(asiento.equalsIgnoreCase("no")) {
                    costoAsiento = 60.00;
                } else if(asiento.equalsIgnoreCase("si")){
                    costoAsiento = 100.00;
                } else {
                    System.out.println("Selecciona una opcion valida!");
                    continue;
                }
                double costoTotal = costoAsiento + costoDestino;
                Vuelos vuelo = new Vuelos(aerolinea, destino, asiento);
                vuelo.setCosto(costoTotal);
                reservas.add(vuelo);
                System.out.println("Reserva hecha con exito!");
                
            } else if (input == 2) {
                if (reservas.isEmpty()) {
                    System.out.println("No hay reservas para cancelar.");
                } else {
                    System.out.println("Lista de reservas: ");
                    for (int i = 0; i < reservas.size(); i++) {
                        System.out.println(i + 1 + ". " + reservas.get(i));
                    }
                    System.out.println("Elige el número de la reserva que deseas cancelar (0 para cancelar): ");
                    int reservaCancelar = Integer.parseInt(scan.nextLine());

                    if (reservaCancelar > 0 && reservaCancelar <= reservas.size()) {
                        reservas.remove(reservaCancelar - 1);
                        System.out.println("Reserva cancelada con éxito.");
                    } else if (reservaCancelar == 0) {
                        System.out.println("Cancelación de reserva cancelada.");
                    } else {
                        System.out.println("Opción inválida. No se ha cancelado ninguna reserva.");
                    }
                }
                
                
            } else if (input == 3 ){
                for(Vuelos vuelo : reservas){
                    System.out.println(vuelo);
                }
            }
            
        }
        
        
    }
}
