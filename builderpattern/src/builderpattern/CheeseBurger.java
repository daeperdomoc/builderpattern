
package builderpattern;

public class CheeseBurger extends Burger {
    
    @Override
    public float price(){
        return 4000.0f;
    }
    
    @Override
    public String name(){
        return "Cheese Burger";
    }
    
}
