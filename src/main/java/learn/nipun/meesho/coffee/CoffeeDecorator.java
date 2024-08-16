package learn.nipun.meesho.coffee;

public class CoffeeDecorator implements Coffee {

    private Coffee coffee;
    private int price;
    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    void getPrice(){
        return
    }

    @Override
    public void makeCoffee() {

    }

    @Override
    public void addAddon() {

    }

    void brewCoffee() {}

}
