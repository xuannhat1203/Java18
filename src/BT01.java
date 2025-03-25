import java.util.HashMap;

public class BT01 {
    public static void main(String[] args) {
        HashMap<String,Integer> studentList = new HashMap<>();
        studentList.put("Nguyen Xuan Nhat", 6);
        studentList.put("Lai Hoang Nam", 7);
        studentList.put("Nguyen Dinh Duong", 8);
        studentList.put("Pham Trung Hieu", 9);
        for (HashMap.Entry<String,Integer> entry : studentList.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("-----------------------------");
        for (HashMap.Entry<String,Integer> entry : studentList.entrySet()) {
            if (entry.getKey().equals("Nguyen Xuan Nhat")) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
}
