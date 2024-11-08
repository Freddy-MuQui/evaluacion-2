/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sucursal;

/**
 *
 * @author Cetecom
 */
public abstract class Vehiculo {
    private String idVehiculo;
    private String servicioMantenimiento;

    public Vehiculo() {
    }

    public Vehiculo(String idVehiculo, String servicioMantenimiento) {
        this.idVehiculo = idVehiculo;
        this.servicioMantenimiento = servicioMantenimiento;
    }

    public String getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(String idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getServicioMantenimiento() {
        return servicioMantenimiento;
    }

    public void setServicioMantenimiento(String servicioMantenimiento) {
        this.servicioMantenimiento = servicioMantenimiento;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "idVehiculo=" + idVehiculo + ", servicioMantenimiento=" + servicioMantenimiento + '}';
    }
    
    
}
