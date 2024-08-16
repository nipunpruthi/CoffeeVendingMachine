package learn.nipun.meesho.coffee;

import java.util.HashMap;
import java.util.Map;

public class Latte implements Coffee{

    Map<String,Integer> ingredients;

    public Latte() {
        ingredients = new HashMap<>();

        ingredients.put("CHSYRUP", 2);
    }

    @Override
    public void makeCoffee() {

        System.out.println("Adding Chocolate Syrup " + ingredients.get("CHSYRUP")+ " ml");

    }

    @Override
    public void addAddon() {

    }
}
