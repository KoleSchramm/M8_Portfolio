public class Main {
    public static void main(String[] args) throws InterruptedException {
        int counter = 0;
        System.out.println("Initial value: " + counter);

        CountUp countUp = new CountUp(counter);
        Thread thread1 = new Thread(countUp);

        thread1.start();
        thread1.join();
        counter = countUp.counter;

        CountDown countDown = new CountDown(counter);
        Thread thread2 = new Thread(countDown);

        thread2.start();
        thread2.join();
        counter = countDown.counter;
    }
}