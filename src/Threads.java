public class Threads {
    public static void main(final String[] args)
    {
        final Thread derivedThread = new CountingThread();
        derivedThread.start();
        final Thread threadWithRunnable =
                new Thread(new DatePrinter());
        threadWithRunnable.start();
    }
}
