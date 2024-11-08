/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sucursal;

/**
 *
 * @author Cetecom
 */
public class Moto extends Vehiculo {
    private int capacidadBateria;
    private String modoEco;

    public Moto() {
    }

    public Moto(int capacidadBateria, String modoEco) {
        this.capacidadBateria = capacidadBateria;
        this.modoEco = modoEco;
    }

    public Moto(int capacidadBateria, String modoEco, String idVehiculo, String servicioMantenimiento) {
        super(idVehiculo, servicioMantenimiento);
        this.capacidadBateria = capacidadBateria;
        this.modoEco = modoEco;
    }

    public int getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(int capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public String getModoEco() {
        return modoEco;
    }

    public void setModoEco(String modoEco) {
        this.modoEco = modoEco;
    }

    @Override
    public String toString() {
        return "Moto{" + "capacidadBateria=" + capacidadBateria + ", modoEco=" + modoEco + '}';
    }
    
    
    
}
