public class CountingThread extends Thread {
    public void run() {
        Counter counter = new Counter();
        while (counter.currentValue() < 50 &&
                !Thread.currentThread().isInterrupted()) {
            System.out.println(counter.currentValue());
            counter.increment();
            SleepUtils.safeSleep(1000);
        }
    }
}
