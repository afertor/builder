/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacasa;

public class CasaLujo extends Casa {
    public CasaLujo() {
        this.habitaciones = 4;
        this.banios = 3;
        this.cochera = true;
        this.jardin = true;
        this.piscina = true;
    }

    @Override
    public String obtenerDescripcion() {
        return "Casa de lujo: " + habitaciones + " habitaciones, " + banios + " baños, cochera para 2 autos y jardín amplio con piscina";
    }
}
