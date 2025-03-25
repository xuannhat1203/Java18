import java.util.TreeMap;

public class BT04 {
    public static void main(String[] args) {
        TreeMap<String, Double> employees = new TreeMap<>();
        employees.put("NV1234", 6.0);
        employees.put("NV2345", 4.0);
        employees.put("NV3456", 1.0);
        for (String key : employees.keySet()) {
            System.out.println(key + " : " + employees.get(key));
        }
        System.out.println("----------------------");
        employees.put("NV1234", 9.0);
        employees.remove("NV2345");
        for (String key : employees.keySet()) {
            System.out.println(key + " : " + employees.get(key));
        }
    }
}
