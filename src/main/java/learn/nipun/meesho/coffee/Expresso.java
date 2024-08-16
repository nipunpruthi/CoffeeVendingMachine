package learn.nipun.meesho.coffee;

import java.util.HashMap;
import java.util.Map;

public class Expresso implements Coffee{

    Map<String,Integer> ingredients;
    Coffee coffee;

    public Expresso() {
        ingredients = new HashMap<>();

        ingredients.put("LCOFFE", 10);
    }

    @Override
    public void makeCoffee() {

        coffee.makeCoffee();
        System.out.println("Adding Liquid coffee 10 ml");

    }

    @Override
    public void addAddon() {

    }
}
