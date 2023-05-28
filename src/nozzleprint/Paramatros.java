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
public class Paramatros implements Serializable{
    private String nombreParametros;
    private float precioDiseño ;
    private float precioMantenimiento;
    private float precioElectrico;
    private float precioMargen;

    public Paramatros(String nombreParametros, float precioDiseño, float precioMantenimiento, float precioElectrico, float precioMargen) {
        this.nombreParametros = nombreParametros;
        this.precioDiseño = precioDiseño;
        this.precioMantenimiento = precioMantenimiento;
        this.precioElectrico = precioElectrico;
        this.precioMargen = precioMargen;
    }

    public String getNombreParametros() {
        return nombreParametros;
    }

    public void setNombreParametros(String nombreParametros) {
        this.nombreParametros = nombreParametros;
    }

    public float getPrecioDiseño() {
        return precioDiseño;
    }

    public void setPrecioDiseño(float precioDiseño) {
        this.precioDiseño = precioDiseño;
    }

    public float getPrecioMantenimiento() {
        return precioMantenimiento;
    }

    public void setPrecioMantenimiento(float precioMantenimiento) {
        this.precioMantenimiento = precioMantenimiento;
    }

    public float getPrecioElectrico() {
        return precioElectrico;
    }

    public void setPrecioElectrico(float precioElectrico) {
        this.precioElectrico = precioElectrico;
    }

    public float getPrecioMargen() {
        return precioMargen;
    }

    public void setPrecioMargen(float precioMargen) {
        this.precioMargen = precioMargen;
    }

    @Override
    public String toString() {
        return "Paramatros{" + "nombreParametros=" + nombreParametros + ", precioDise\u00f1o=" + precioDiseño + ", precioMantenimiento=" + precioMantenimiento + ", precioElectrico=" + precioElectrico + ", precioMargen=" + precioMargen + '}';
    }
    
}
