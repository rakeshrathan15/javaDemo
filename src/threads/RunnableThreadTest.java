package threads;

public class RunnableThreadTest {

    public static void main(String[] args) {
        Runnable numberCountRunnable= new NumberCountRunnableThread();

        Thread thread = new Thread(numberCountRunnable,"Runnable Thread");
        thread.start();
    }
}
