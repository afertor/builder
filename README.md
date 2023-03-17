<script src="https://cdn.jsdelivr.net/npm/mermaid@8.0.0/dist/mermaid.min.js"></script>
<script>mermaid.initialize({startOnLoad:true});</script>

#PATRÓN BUILDER

¿Qué es?
El patrón Builder es un diseño que permite al constructor de una clase cambiar objetos complejos paso a paso. Esto te permite producir diferentes tipos y representaciones de un objeto utilizando el mismo constructor.

Clases
Primero tenemos la clase Pizza, la cual tiene dos constructores: uno que permite asignarle valores y otro por defecto con valores predeterminados. Utilizaremos este último constructor junto con el patrón Builder, el cual cuenta con sus respectivos setters y getters.

Luego, tenemos la clase BuilderPizzas, que tiene un constructor predeterminado que utiliza el constructor por defecto de la clase Pizza. Además, cuenta con setters que devuelven BuilderPizzas y, por último, el método build(), que devuelve el objeto del constructor.

¿Se puede combinar el patrón Builder con el patrón Factory?
Sí, es posible combinar ambos patrones de diseño.
  
    ```mermaid
    classDiagram
  Main "1" *-- "1..*" BuilderPizza : association
  class Main{
      +main()
  }
  class BuilderPizza{
      +tipoMasa(String)
      +ingredientes(List<String>)
      +tamano(int)
      +build() : Pizza
  }
  
  BuilderPizza *-- "1" Pizza : association
  class Pizza{
    +Pizza()
    +Pizza(String, List<String>, int)
    +getTipoMasa() : String
    +setTipoMasa(String)
    +getIngredientes() : List<String>
    +setIngredientes(List<String>)
    +getTamano() : int
    +setTamano(int)
  }
