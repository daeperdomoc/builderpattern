package builderpattern;

public class Builderpattern {

    public static void main(String[] args) {
        
      ComboBuilder comboBuilder = new ComboBuilder();

      Combo vegMeal = comboBuilder.prepareVegCombo();
      
      System.out.println("Veggie Combo");
      vegMeal.showItems();
      System.out.println("Total Cost: " + vegMeal.getCost());

      Combo baconMeal = comboBuilder.prepareBaconCombo();
      System.out.println("\n\nBacon combo");
      baconMeal.showItems();
      System.out.println("Total Cost: " + baconMeal.getCost());
    }
    
}
