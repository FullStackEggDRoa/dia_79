/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_2;

import Entidades.Lavadora;
import Entidades.Televisor;
import Servicios.serviciosLavadora;
import Servicios.serviciosTelevisor;

/**
 *
 * @author droa
 */
public class Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        serviciosLavadora sL = new serviciosLavadora();
        serviciosTelevisor sT = new serviciosTelevisor();
        
        System.out.println("LAVADORA");
        Lavadora l1 = sL.crearLavadora();
        System.out.println("TELEVISOR");
        Televisor t1 = sT.crearTelevisor();
        
        l1.precioFinal();
        t1.precioFinal();
        
        System.out.println("..:: PRECIOS FINALES ::..");
        System.out.println("Precio Final Lavadora: "+String.format("%.2f",l1.getPrecio())+" USD");
        System.out.println("Precio Final Televisor: "+String.format("%.2f",t1.getPrecio())+" USD");
        
        
    }
    
}
