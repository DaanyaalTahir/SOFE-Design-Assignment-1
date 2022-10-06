public class PlantainBanana implements GroceryProduct {
    float price;
    @Override
    public float getPrice() {
        return this.price;
    }
    public void setPrice(float price) {
        this.price=price;
    }
}
