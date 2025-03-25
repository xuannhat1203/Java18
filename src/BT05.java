import java.util.*;

public class BT05 {
    public static void main(String[] args) {
        Map<String, Integer> productList = new TreeMap<>();
        productList.put("Laptop", 700);
        productList.put("Smartphone", 200);
        productList.put("Device", 600);
        productList.put("Vehicle", 40);
        productList.entrySet().removeIf(entry -> entry.getValue() < 500 || entry.getValue() > 1000);
        List<Map.Entry<String, Integer>> listArray = new ArrayList<>(productList.entrySet());
        listArray.sort(Comparator.comparing(Map.Entry::getValue));
        for (Map.Entry<String, Integer> entry : listArray) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
