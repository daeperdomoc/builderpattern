package builderpattern;

public class VegBurger  extends Burger {
    
    @Override
    public float price(){
        return 8000.0f;
    }
    
    @Override
    public String name(){
        return "Veggie Burger";
    }
    
}