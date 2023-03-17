
package programacasa;

public class CasaFactory {
    public static CasaBuilder obtenerCasaBuilder(boolean piscina) {
        CasaBuilder builder = (CasaBuilder) new CasaBuilderImpl();
        if (piscina) {
            builder.setHabitaciones(4)
                    .setBanios(3)
                    .setCochera(true)
                    .setJardin(true);
        } else {
            builder.setHabitaciones(2)
                    .setBanios(1);
        }
        builder.setPiscina(piscina);
        return builder;
    }
}
