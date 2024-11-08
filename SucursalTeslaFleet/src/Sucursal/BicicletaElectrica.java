/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sucursal;

/**
 *
 * @author Cetecom
 */
public class BicicletaElectrica extends Vehiculo{
    private String tipoFrenado;
    private float bateriaKilometrica;

    public BicicletaElectrica() {
    }

    public BicicletaElectrica(String tipoFrenado, float bateriaKilometrica) {
        this.tipoFrenado = tipoFrenado;
        this.bateriaKilometrica = bateriaKilometrica;
    }

    public BicicletaElectrica(String tipoFrenado, float bateriaKilometrica, String idVehiculo, String servicioMantenimiento) {
        super(idVehiculo, servicioMantenimiento);
        this.tipoFrenado = tipoFrenado;
        this.bateriaKilometrica = bateriaKilometrica;
    }
    

    public String getTipoFrenado() {
        return tipoFrenado;
    }

    public void setTipoFrenado(String tipoFrenado) {
        this.tipoFrenado = tipoFrenado;
    }

    public float getBateriaKilometrica() {
        return bateriaKilometrica;
    }

    public void setBateriaKilometrica(float bateriaKilometrica) {
        this.bateriaKilometrica = bateriaKilometrica;
    }

    @Override
    public String toString() {
        return "BicicletaElectrica{" + "tipoFrenado=" + tipoFrenado + ", bateriaKilometrica=" + bateriaKilometrica + '}';
    }
    
    
    
}
