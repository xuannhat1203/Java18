import java.util.HashMap;
import java.util.Map;

public class BT02 {
    public static void main(String[] args) {
        Map<String,Double> productList = new HashMap<String,Double>();
        productList.put("Laptop", 1.0);
        productList.put("Smartphone", 2.0);
        productList.put("Vehicle", 3.0);
        if (productList.containsKey("Laptop")) {
            System.out.println("Laptop co trong productList");
        }else{
            System.out.println("Laptop khong co trong danh sach");
        }
    }
}
