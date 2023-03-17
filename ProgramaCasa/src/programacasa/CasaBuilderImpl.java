/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacasa;

public class CasaBuilderImpl implements CasaBuilder {
    private int habitaciones;
    private int banios;
    private boolean cochera;
    private boolean jardin;
    private boolean piscina;

    @Override
    public CasaBuilder setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
        return this;
    }

    @Override
    public CasaBuilder setBanios(int banios) {
        this.banios = banios;
        return this;
    }

    @Override
    public CasaBuilder setCochera(boolean cochera) {
        this.cochera = cochera;
        return this;
    }

    @Override
    public CasaBuilder setJardin(boolean jardin) {
        this.jardin = jardin;
        return this;
    }

    @Override
    public CasaBuilder setPiscina(boolean piscina) {
        this.piscina = piscina;
        return this;
    }

    @Override
    public Casa build() {
        if (piscina) {
            CasaLujo casa = new CasaLujo();
            casa.setHabitaciones(habitaciones);
            casa.setBanios(banios);
            casa.setCochera(cochera);
            casa.setJardin(jardin);
            casa.setPiscina(piscina);
            return casa;
        } else {
            CasaEstandar casa = new CasaEstandar();
            casa.setHabitaciones(habitaciones);
            casa.setBanios(banios);
            casa.setCochera(cochera);
            casa.setJardin(jardin);
            casa.setPiscina(piscina);
            return casa;
        }
    }
}
