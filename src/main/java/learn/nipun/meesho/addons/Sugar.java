package learn.nipun.meesho.addons;

public class Sugar implements Addon{

    int price;

    public Sugar() {
        this.price = 1;
    }
    @Override
    public int getPrice() {
        return price;
    }
}
