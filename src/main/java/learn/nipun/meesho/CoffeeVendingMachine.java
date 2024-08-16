package learn.nipun.meesho;

import java.util.HashMap;
import java.util.Map;
import learn.nipun.meesho.addons.Addon;
import learn.nipun.meesho.coffee.Coffee;

public class CoffeeVendingMachine {
    Map<String, Integer> inventory;
    Validatoins validations;
    Coffee coffee;

    public CoffeeVendingMachine(){
        inventory = new HashMap<>();
        inventory.put("LCOFFE", 1000);
        inventory.put("MILK", 1000);
        inventory.put("CHSYRUP", 500);
        inventory.put("SUGAR", 500);
    }

    private brewCoffee(){
        coffee.makeCoffee();
    }

    public selectCoffee(Coffee coffee){
        this.coffee = coffee;

//        validations.validateQuantity(coffee, inventory);
    }

    public addAddons(Addon addon){
        coffee =
    }

    public doPayment(){

        validations.validateQuantity(coffee, inventory);

        System.out.println(coffee.getPrice());


        // accept amount
        brewCoffee();

    }

}
