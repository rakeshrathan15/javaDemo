package threads;

public class ThreadDemoTest {
    public static void main(String[] args) {
        Thread thread1=Thread.currentThread();
        Thread.currentThread().setName("Rakesh");

       String threadName= Thread.currentThread().getName();
        System.out.println(threadName);
        System.out.println(thread1.getName());

        Thread countThread1 = new NumberCountThread();
        countThread1.setName("countThread -1 ");
        countThread1.setPriority(1);
        countThread1.start();

        Thread countThread2 = new NumberCountThread();
        countThread2.setName("countThread -3 ");
        countThread2.setPriority(5);
        countThread2.start();

        Thread countThread3 = new NumberCountThread();
        countThread3.setName("countThread -2");
        countThread3.setPriority(10);
        countThread3.start();


    }
}
