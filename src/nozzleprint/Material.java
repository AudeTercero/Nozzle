/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nozzleprint;

import java.io.Serializable;

/**
 *
 * @author Asus
 */
public class Material implements Serializable{
    private int idMaterial;    
    private String marca;
    private String tipoMaterial;
    private String color;
    private String enlaceCompra;
    private float precioKilo;
    private static int cont = 0;

    public Material(String marca, String tipo, String color, String enlaceCompra, float precioKilo) {
        this.marca = marca;
        this.tipoMaterial = tipo;
        this.color = color;
        this.enlaceCompra = enlaceCompra;
        this.precioKilo = precioKilo;
        this.idMaterial = cont;
        cont++;
    }
    
    public int getIdMaterial(){
        return idMaterial;
    }

    public String getMarca() {
        return marca;
    }
    

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return tipoMaterial;
    }

    public void setModelo(String modelo) {
        this.tipoMaterial = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEnlaceCompra() {
        return enlaceCompra;
    }

    public void setEnlaceCompra(String enlaceCompra) {
        this.enlaceCompra = enlaceCompra;
    }

    public float getPrecioKilo() {
        return precioKilo;
    }

    public void setPrecioKilo(float precioKilo) {
        this.precioKilo = precioKilo;
    }

    @Override
    public String toString() {
        return "Material{" + "marca=" + marca + ", modelo=" + tipoMaterial + ", color=" + color + ", enlaceCompra=" + enlaceCompra + ", precioKilo=" + precioKilo + '}';
    }
    
    
}
