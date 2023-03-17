package pizza;

public class Main {
    public static void main(String[] args) {
        Pizza pizza1 = new BuilderPizza().build();
        System.out.println(pizza1.toString() +"\n");
        Pizza pizzaPsicopata = new BuilderPizza().setPiña(true).build();
        System.out.println(pizzaPsicopata.toString() +"\n");
        Pizza pizza3 = new BuilderPizza()
                .setSalsa(true)
                .setTipoSalsa("Tomate")
                .build();
        System.out.println(pizza3.toString() +"\n");
    }
}