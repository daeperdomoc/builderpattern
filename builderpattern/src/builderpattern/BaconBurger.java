package builderpattern;

public class BaconBurger  extends Burger {
    
    @Override
    public float price(){
        return 10000.0f;
    }
    
    @Override
    public String name(){
        return "Bacon Burger";
    }
    
}