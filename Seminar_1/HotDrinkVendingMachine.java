import java.util.ArrayList;
import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine {
   
    private List<Product> productList = new ArrayList<>();
  
    @Override
    public void initProduct(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public Product getProduct(String name) {
        for (Product item : productList)
            if(item.getName().equals(name))
                return item;
                        
        return null;
    }

    public Product getProduct(String name, int temperature){
        for (Product item : productList)
            if(item.getName().equals(name) && ((HotDrink) item).getTemperature() == temperature)
                return item;
        return null;
    }

    public Product getProduct(int temperature){
        for (Product item : productList)
            if(((HotDrink) item).getTemperature() == temperature)
                return item;
        return null;
    }

    public Product getProduct(String name, int temperature, int volume){
        for (Product item: productList) 
            if (item.getName().equals(name) && ((HotDrink) item).getTemperature() == temperature && ((HotDrink) item).getVolume() == volume)
                return item;
        return null;
            
        
    }
}
    

