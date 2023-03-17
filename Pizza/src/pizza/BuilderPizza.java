package pizza;

public class BuilderPizza {

    private Pizza _pizzas;

    public BuilderPizza(){
        _pizzas = new Pizza();
    }

    public BuilderPizza setMasa(String masa){
        _pizzas.setMasa(masa);
        return this;
    }

    public BuilderPizza setCebolla(boolean x){
        _pizzas.setCebolla(x);
        return this;
    }

    public BuilderPizza setChampiñones(boolean x){
        _pizzas.setChampiñones(x);
        return this;
    }

    public BuilderPizza setPiña(boolean x){
        _pizzas.setPiña(x);
        return this;
    }

    public BuilderPizza setJamon(boolean x){
        _pizzas.setJamon(x);
        return this;
    }

    public BuilderPizza setExtraQueso(boolean x){
        _pizzas.setExtraQueso(x);
        return this;
    }

    public BuilderPizza setRelleno(boolean x){
        _pizzas.setRelleno(x);
        return this;
    }

    public BuilderPizza setSalsa(boolean x){
        _pizzas.setSalsa(x);
        return this;
    }

    public BuilderPizza setSinGluten(boolean x){
        _pizzas.setSinGluten(x);
        return this;
    }

    public BuilderPizza setTamaño(int tamaño){
        _pizzas.setTamaño(tamaño);
        return this;
    }

    public BuilderPizza setTipoSalsa(String salsa){
        _pizzas.setTipoSalsa(salsa);
        return this;
    }

    public Pizza build(){
        return this._pizzas;
    }
}