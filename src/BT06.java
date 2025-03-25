import java.util.*;

public class BT06 {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> studentList = new LinkedHashMap<>();
        studentList.put("Xuan Nhat", 4);
        studentList.put("Hoang Nam", 5);
        studentList.put("Dinh Duong", 6);
        studentList.put("Trung Hieu", 7);
        studentList.put("Hoang Loan", 8);
        studentList.put("Thanh Mai", 9);
        studentList.put("Truc Ma", 10);
        studentList.put("Dan Truong", 3);
        studentList.put("Xuan Mai", 2);
        studentList.put("Xuan Ca", 1);
        for (Map.Entry<String, Integer> entry : studentList.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("----------------------");
        int count = 0;
        for (Map.Entry<String, Integer> entry : studentList.entrySet()) {
            count += entry.getValue();
        }
        System.out.println("Diem trung binh: "+(count/studentList.size()));
        Iterator<Map.Entry<String, Integer>> iterator = studentList.entrySet().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getValue() < 5) {
                iterator.remove();
            }
        }
        System.out.println("\nDanh sách học sinh sau khi xóa:");
        for (Map.Entry<String, Integer> entry : studentList.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
