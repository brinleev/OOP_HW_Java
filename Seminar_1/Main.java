import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new HotDrink("black tea", 100, 50, 200));
        productList.add(new HotDrink("black tea", 70, 50, 150));
        productList.add(new HotDrink("green tea", 200, 40, 100));
        productList.add(new HotDrink("green tea", 250, 40, 150));
        HotDrinkVendingMachine vendingMachine = new HotDrinkVendingMachine();
        vendingMachine.initProduct(productList);
        System.out.println(vendingMachine.getProduct("green tea",40,100));
    
    }
}