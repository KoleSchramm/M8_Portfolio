public class CountDown implements Runnable{
    int counter;

    public CountDown(int counter){
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i<20; i++){
            counter--;
            System.out.println("Counting down: " + counter);
        }
    }
}