import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AppleFactory extends AbstractFactory{
    public float getPriceFromFile(String productName) {
        try {
            File myObj = new File("product_prices.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if (data.contains(productName)){
                    return Float.parseFloat(data.substring(data.indexOf("=") + 1));

                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }

        return -1;
    }
    @Override
    public GroceryProduct createProduct(String productName) {
        if(productName.equalsIgnoreCase("GALA_APPLE")){
            GalaApple galaApple = new GalaApple();
            galaApple.setPrice(getPriceFromFile("GALA_APPLE"));
            return galaApple;
        }else if(productName.equalsIgnoreCase("FUJI_APPLE")){
            FujiApple fujiApple = new FujiApple();
            fujiApple.setPrice(getPriceFromFile("FUJI_APPLE"));
            return fujiApple;
        }
        return null;
    }
}
