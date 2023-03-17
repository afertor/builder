
# BUILDER

¿Cual es el funcionamiento del patron builder? El patrón Builder tiene como función principal separar la construcción de objetos complejos en varias etapas o pasos, lo que permite crear objetos con diferentes configuraciones sin tener que definir diferentes constructores con diferentes parámetros. De esta forma, se puede simplificar la creación de objetos complejos y hacerla más modular y escalable, lo que facilita su mantenimiento y evolución en el tiempo. Al dividir el proceso de construcción en pasos, el patrón Builder también proporciona mayor flexibilidad y control sobre la creación de objetos, lo que puede ser útil en situaciones en las que se requiere crear objetos con configuraciones específicas o personalizadas. 

## EJEMPLO En este ejemplo, se presenta el uso del patrón Builder en Java para crear objetos complejos con múltiples atributos de manera más sencilla. La clase Casa se define con sus atributos y los métodos getter y setter correspondientes.

A continuación, se presenta la clase BuilderCasa que contiene métodos para establecer cada uno de los atributos de la casa y el método build() para construir un objeto Casa completo.

En la clase Main, se utiliza BuilderCasa para crear dos objetos de la clase Casa con diferentes configuraciones. Uno con tres habitaciones, dos baños, cochera y jardín y otro con cuatro habitaciones, tres baños, piscina y sin cochera.

Finalmente, se verifica que cada casa haya sido construida correctamente al imprimir sus atributos. Este ejemplo ilustra cómo el patrón Builder puede simplificar la creación de objetos complejos con múltiples atributos, lo que permite la creación de objetos con diferentes configuraciones sin tener que definir múltiples constructores con diferentes combinaciones de parámetros. Como resultado, el código se vuelve más modular y escalable.

`mermaid 
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
        Main --> "1" BuilderCasa´
        

