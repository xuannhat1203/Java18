import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class BT08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số N từ bàn phím: ");
        int n = sc.nextInt();
        LinkedHashMap<String, Integer> laMa = new LinkedHashMap<>();
        laMa.put("X", 10);
        laMa.put("IX", 9);
        laMa.put("V", 5);
        laMa.put("IV", 4);
        laMa.put("I", 1);
        StringBuilder roman = new StringBuilder();
        for (Map.Entry<String, Integer> entry : laMa.entrySet()) {
            while (n >= entry.getValue()) {
                roman.append(entry.getKey());
                n -= entry.getValue();
            }
        }
        System.out.println("Số La Mã tương ứng: " + roman);
        sc.close();
    }
}
