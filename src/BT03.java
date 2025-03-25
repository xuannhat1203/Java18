import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class BT03 {
    public static void main(String[] args) {
        LinkedHashMap<String,Double> productList = new LinkedHashMap<>();
        productList.put("Laptop", 1.0);
        productList.put("Smartphone", 2.0);
        productList.put("Vehicle", 3.0);
        for (String key : productList.keySet()) {
            System.out.println(key + " : " + productList.get(key));
        }
        productList.put("Laptop", 6.0);
        productList.remove("Smartphone");
        System.out.println("-------------------");
        for (String key : productList.keySet()) {
            System.out.println(key + " : " + productList.get(key));
        }
    }
}
