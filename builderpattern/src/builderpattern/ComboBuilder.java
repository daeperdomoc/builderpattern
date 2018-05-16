package builderpattern;

public class ComboBuilder {
    
   public Combo prepareVegCombo (){
      Combo meal = new Combo();
      meal.addItem(new VegBurger());
      meal.addItem(new CocaCola());
      return meal;
   }   

   public Combo prepareBaconCombo (){
      Combo meal = new Combo();
      meal.addItem(new BaconBurger());
      meal.addItem(new CocaCola());
      return meal;
   }
   
   public Combo prepareCheeseCombo (){
      Combo meal = new Combo();
      meal.addItem(new CheeseBurger());
      meal.addItem(new CocaCola());
      return meal;
   }
}
