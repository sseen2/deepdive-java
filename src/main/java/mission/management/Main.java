package mission.management;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Manager manager1 = new Manager("총관리자");
        Manager manager2 = new Manager("이팀장", 500000, "관리팀장");

        System.out.println("===== employee print =====");
        employee.print();
        System.out.println("===== manager1 print =====");
        manager1.print();
        System.out.println("===== manager2 print =====");
        manager2.print();
    }
}