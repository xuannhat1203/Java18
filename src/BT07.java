import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BT07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap kich thuoc cua mang: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Number " + i + ": ");
            numbers[i] = sc.nextInt();
            System.out.println();
        }
        Map<Integer, Integer> arr = new HashMap<>();
        for (int number : numbers) {
            arr.put(number, arr.getOrDefault(number, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : arr.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
