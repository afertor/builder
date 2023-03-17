/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacasa;

public class CasaEstandar extends Casa {
    public CasaEstandar() {
        this.habitaciones = 2;
        this.banios = 1;
        this.cochera = false;
        this.jardin = false;
        this.piscina = false;
    }

    @Override
    public String obtenerDescripcion() {
        return "Casa estándar: " + habitaciones + " habitaciones, " + banios + " baño, sin cochera ni jardín";
    }
}