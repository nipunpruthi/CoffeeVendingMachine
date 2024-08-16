package learn.nipun.meesho;

public class Main {

    /*
    Design and implement a coffee vending machine with the below functions
    Ability to choose a product
    Expresso(only liquid coffee 10 ml) - 2$
    Cappuccino (Espresso + 10 ml milk) - 4$
    Latte (Cappuccino + 2 ml chocolate syrup) - 6$

    inventory management and refilling capacity. -> at the end, print total left
    Ability to choose an addon on the coffee
    Sugar added (add 1 $ to the total price)
    Caramel Syrup (add 2 $ to the total price)

    Ability to see the total price based on the choice. :
    dispense items purchased (mock the dispensing service)
    Possible exceptions:
    Sold out
    Not fully paid

    What are we looking for
    Clean code
    OOPS concepts
    extensibility
    correct design patterns
     */

    /*
    Coffee Machine
//    Map<liquid cofee, milk, chocolate syrup, addOns>
    * orderCoffee() ->
        selectCoffee
        select addon
        verification ->
        show amount
        pay amount()
        dispense();

     */

    /*
    Coffee abstract
    * expresso(price,

    * cuppuccino
    * latte
     */

    public static void main(String[] args) {

        System.out.println("Hello world!");
    }
}