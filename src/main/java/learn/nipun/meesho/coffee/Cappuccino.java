package learn.nipun.meesho.coffee;

import java.util.HashMap;
import java.util.Map;

public class Cappuccino implements Coffee{

    Map<String,Integer> ingredients;

    public Cappuccino() {
        ingredients = new HashMap<>();

        ingredients.put("MILK", 10);
    }

    @Override
    public void makeCoffee() {

        System.out.println("Adding Milk " + ingredients.get("MILK")+ " ml");

    }

    @Override
    public void addAddon() {

    }
}
