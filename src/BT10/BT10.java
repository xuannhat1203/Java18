package BT10;

import java.util.HashMap;
import java.util.Map;

public class BT10 {
    public static void main(String[] args) {
        Map<Integer, Employee> employees = new HashMap<>();
        employees.put(1, new Employee(1, "Nguyen Xuan Nhat", 1500.0f));
        employees.put(2, new Employee(2, "Pham Trung Hieu", 1800.0f));
        employees.put(3, new Employee(3, "Lai Hoang Nam", 1700.0f));
        employees.put(4, new Employee(4, "Nguyen Dinh Duong", 1600.0f));
        employees.put(5, new Employee(5, "Tran Quoc Anh", 1750.0f));
        for (Map.Entry<Integer, Employee> entry : employees.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue().name);
        }
        System.out.println("-----------------------------");
        float total = 0;
        for (Employee employee : employees.values()) {
            total += employee.getSalary();
        }
        System.out.println("Tong luong cua tat ca nhan vien: " + total);
        System.out.println("Luong trung binh: " + (total / employees.size()));
        Employee minEmployee = null;
        float minSalary = Float.MAX_VALUE;
        for (Employee employee : employees.values()) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                minEmployee = employee;
            }
        }
        if (minEmployee != null) {
            System.out.println("Nhan vien co luong thap nhat: " + minEmployee.getName());
        }
        Employee maxEmployee = null;
        float maxSalary = Float.MIN_VALUE; // Sửa lỗi: ban đầu gán giá trị nhỏ nhất thay vì lớn nhất
        for (Employee employee : employees.values()) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                maxEmployee = employee;
            }
        }
        if (maxEmployee != null) {
            System.out.println("Nhan vien co luong cao nhat: " + maxEmployee.getName());
        }
    }
}
