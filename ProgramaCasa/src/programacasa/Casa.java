
package programacasa;
public abstract class Casa {
    protected int habitaciones;
    protected int banios;
    protected boolean cochera;
    protected boolean jardin;
    protected boolean piscina;
    
    public interface CasaBuilder {
    CasaBuilder setHabitaciones(int habitaciones);
    CasaBuilder setBanios(int banios);
    CasaBuilder setCochera(boolean cochera);
    CasaBuilder setJardin(boolean jardin);
    CasaBuilder setPiscina(boolean piscina);
    Casa build();
}


    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public int getBanios() {
        return banios;
    }

    public void setBanios(int banios) {
        this.banios = banios;
    }

    public boolean isCochera() {
        return cochera;
    }

    public void setCochera(boolean cochera) {
        this.cochera = cochera;
    }

    public boolean isJardin() {
        return jardin;
    }

    public void setJardin(boolean jardin) {
        this.jardin = jardin;
    }

    public boolean isPiscina() {
        return piscina;
    }

    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }

    public abstract String obtenerDescripcion();
}
