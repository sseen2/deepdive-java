package mission.thread;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Drum();
        Thread thread2 = new Guitar();

        thread1.start();
        thread2.start();

        System.out.println("===== 메인 종료 =====");
    }
}
