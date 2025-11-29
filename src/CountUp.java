public class CountUp implements Runnable{
    int counter;

    public CountUp(int counter){
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i<20; i++){
            counter++;
            System.out.println("  Counting up: " + counter);
        }
    }
}