/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacasa;

public interface CasaBuilder {
    CasaBuilder setHabitaciones(int habitaciones);
    CasaBuilder setBanios(int banios);
    CasaBuilder setCochera(boolean cochera);
    CasaBuilder setJardin(boolean jardin);
    CasaBuilder setPiscina(boolean piscina);
    Casa build();
}
