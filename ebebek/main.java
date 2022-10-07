package ebebek;

public class main {
    public static void main(String[] args) {
        Employee employee = new Employee("OFG",2500,45,2020);
        System.out.println(employee.toString());;
        employee.raiseSalary();
        System.out.println(employee.toString());
    }
}
