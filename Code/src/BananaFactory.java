import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BananaFactory extends AbstractFactory{

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
    public GroceryProduct createProduct(String productName) {
        if(productName.equalsIgnoreCase("PLANTAIN_BANANA")){
            PlantainBanana plantainBanana = new PlantainBanana();
            plantainBanana.setPrice(getPriceFromFile("PLANTAIN_BANANA"));
            return plantainBanana;
        }else if(productName.equalsIgnoreCase("CAVENDISH_BANANA")){
            CavendishBanana cavendishBanana = new CavendishBanana();
            cavendishBanana.setPrice(getPriceFromFile("CAVENDISH_BANANA"));
            return cavendishBanana;
        }
        return null;
    }
}
