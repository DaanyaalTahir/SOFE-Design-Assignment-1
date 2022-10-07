public class GroceryStore {
    public static void main(String[] args) {
        // Get Abstract Factory for Banana's
        AbstractFactory BananaFactory = GroceryProductFactory.getFactory(false);
        GroceryProduct product1 = BananaFactory.createProduct("CAVENDISH_BANANA");
        GroceryProduct product2 = BananaFactory.createProduct("PLANTAIN_BANANA");
        System.out.println("Price of CAVENDISH_BANANA: " + product1.getPrice());
        System.out.println("Price of PLANTAIN_BANANA: " + product2.getPrice());

        // Get Abstract Factory for Apples
        AbstractFactory AppleFactory = GroceryProductFactory.getFactory(true);
        GroceryProduct product3 = AppleFactory.createProduct("GALA_APPLE");
        GroceryProduct product4 = AppleFactory.createProduct("FUJI_APPLE");
        System.out.println("Price of GALA_APPLE: " + product3.getPrice());
        System.out.println("Price of FUJI_APPLE: " + product4.getPrice());

    }
}
