
package programacasa;
public class Main {
    public static void main(String[] args) {
        CasaBuilder builder1 = CasaFactory.obtenerCasaBuilder(false);
        Casa casa1 = builder1.build();
        System.out.println(casa1.obtenerDescripcion());

        CasaBuilder builder2 = CasaFactory.obtenerCasaBuilder(true);
        Casa casa2 = builder2.build();
        System.out.println(casa2.obtenerDescripcion());
    }
}
