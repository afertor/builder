
# BUILDER

¿Cual es el funcionamiento del patron builder? El patrón Builder tiene como función principal separar la construcción de objetos complejos en varias etapas o pasos, lo que permite crear objetos con diferentes configuraciones sin tener que definir diferentes constructores con diferentes parámetros. De esta forma, se puede simplificar la creación de objetos complejos y hacerla más modular y escalable, lo que facilita su mantenimiento y evolución en el tiempo. Al dividir el proceso de construcción en pasos, el patrón Builder también proporciona mayor flexibilidad y control sobre la creación de objetos, lo que puede ser útil en situaciones en las que se requiere crear objetos con configuraciones específicas o personalizadas. 

## EJEMPLO En este ejemplo, se presenta el uso del patrón Builder en Java para crear objetos complejos con múltiples atributos de manera más sencilla. La clase Casa se define con sus atributos y los métodos getter y setter correspondientes.

A continuación, se presenta la clase BuilderCasa que contiene métodos para establecer cada uno de los atributos de la casa y el método build() para construir un objeto Casa completo.

En la clase Main, se utiliza BuilderCasa para crear dos objetos de la clase Casa con diferentes configuraciones. Uno con tres habitaciones, dos baños, cochera y jardín y otro con cuatro habitaciones, tres baños, piscina y sin cochera.

Finalmente, se verifica que cada casa haya sido construida correctamente al imprimir sus atributos. Este ejemplo ilustra cómo el patrón Builder puede simplificar la creación de objetos complejos con múltiples atributos, lo que permite la creación de objetos con diferentes configuraciones sin tener que definir múltiples constructores con diferentes combinaciones de parámetros. Como resultado, el código se vuelve más modular y escalable.

¿Podemos conmbinarlo con el patron factory? Sí, podemos combinar el patrón Builder con el patrón Factory para crear objetos complejos de manera más eficiente y flexible.

La idea es utilizar el patrón Factory para crear el objeto Builder y, a partir de ahí, utilizar el patrón Builder para construir el objeto complejo con sus diferentes configuraciones.

En el siguiente codigo mostrare como poder combinarlos de manera eficiente: 

public interface Casa {
    String obtenerDescripcion();
}

public class CasaEstandar implements Casa {
    @Override
    public String obtenerDescripcion() {
        return "Casa estándar: 2 habitaciones, 1 baño, sin cochera ni jardín";
    }
}

public class CasaLujo implements Casa {
    @Override
    public String obtenerDescripcion() {
        return "Casa de lujo: 4 habitaciones, 3 baños, cochera para 2 autos y jardín amplio";
    }
}

public interface CasaBuilder {
    CasaBuilder setHabitaciones(int habitaciones);
    CasaBuilder setBanios(int banios);
    CasaBuilder setCochera(boolean cochera);
    CasaBuilder setJardin(boolean jardin);
    CasaBuilder setPiscina(boolean piscina);
    Casa build();
}

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
            return new CasaLujo();
        } else {
            return new CasaEstandar();
        }
    }
}

public class CasaFactory {
    public static CasaBuilder obtenerCasaBuilder(boolean piscina) {
        CasaBuilder builder = new CasaBuilderImpl();
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



```mermaid 
   classDiagram
        class Casa {
            -habitaciones: int
            -banios: int
            -cochera: boolean
            -jardin: boolean
            -piscina: boolean
            +Casa(habitaciones: int, banios: int, cochera: boolean, jardin: boolean, piscina: boolean)
            +getHabitaciones(): int
            +getBanios(): int
            +tieneCochera(): boolean
            +tieneJardin(): boolean
            +tienePiscina(): boolean
        }

        class BuilderCasa {
            -habitaciones: int
            -banios: int
            -cochera: boolean
            -jardin: boolean
            -piscina: boolean
            +BuilderCasa()
            +setHabitaciones(habitaciones: int): BuilderCasa
            +setBanios(banios: int): BuilderCasa
            +setCochera(cochera: boolean): BuilderCasa
            +setJardin(jardin: boolean): BuilderCasa
            +setPiscina(piscina: boolean): BuilderCasa
            +build(): Casa
        }

        class Main {
            +main(args: String[]): void
        }

        Casa --* BuilderCasa
        Main --> "1" BuilderCasa


