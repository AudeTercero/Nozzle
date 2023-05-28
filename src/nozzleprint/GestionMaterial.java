/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nozzleprint;

import java.util.HashMap;

/**
 *
 * @author Asus
 */
public class GestionMaterial {
    private HashMap <String,Material> materiales =  new HashMap();
    
    public void alta(String marca, String tipo, String color, String enlaceCompra, float precioKilo)throws MisExceptions{
        Material mat = new Material(marca,tipo,color,enlaceCompra,precioKilo);
        if(!materiales.containsKey(marca+color)){
            materiales.put(marca+color, mat);
        }else
            throw new MisExceptions("Ese material ya esta guardado");
        
    }
    public void baja(String marca, String modelo){
        
    }
    
}
