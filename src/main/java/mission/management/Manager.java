package mission.management;

public class Manager extends Employee {
    private final String position;

    public Manager(String position) {
        this.position = position;
    }

    public Manager(String name, int pay, String position) {
        super(name, pay);
        this.position = position;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("직급은 " + position + "입니다.");
    }
}
