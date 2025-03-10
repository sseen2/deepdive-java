package mission.management;

public class Employee {
    private String name = "김직원";
    private int pay = 10000;

    public Employee() {}

    public Employee(String name, int pay) {
        this.name = name;
        this.pay = pay;
    }

    public void print() {
        System.out.println("이름은 " + name + " 이고, 임금은 " + pay + "원 입니다.");
    }
}
