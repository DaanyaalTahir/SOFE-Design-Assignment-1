public class CavendishBanana implements GroceryProduct {
    float price;

    @Override
    public float getPrice() {
        return this.price;
    }
    public void setPrice(float price) {
        this.price=price;
    }
}
