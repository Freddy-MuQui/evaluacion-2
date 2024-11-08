/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sucursal;

/**
 *
 * @author Cetecom
 */
public class Auto extends Vehiculo {
    private int capacidadPasajeros;
    private String modoAutopilot;

    public Auto() {
    }

    public Auto(int capacidadPasajeros, String modoAutopilot) {
        this.capacidadPasajeros = capacidadPasajeros;
        this.modoAutopilot = modoAutopilot;
    }

    public Auto(int capacidadPasajeros, String modoAutopilot, String idVehiculo, String servicioMantenimiento) {
        super(idVehiculo, servicioMantenimiento);
        this.capacidadPasajeros = capacidadPasajeros;
        this.modoAutopilot = modoAutopilot;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public String getModoAutopilot() {
        return modoAutopilot;
    }

    public void setModoAutopilot(String modoAutopilot) {
        this.modoAutopilot = modoAutopilot;
    }

    @Override
    public String toString() {
        return "Auto{" + "capacidadPasajeros=" + capacidadPasajeros + ", modoAutopilot=" + modoAutopilot + '}';
    }
    
    
    
}
