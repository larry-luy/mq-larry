public class FifthQn {

    //Write  a simple dreadlock program
    private static Object item1 = new Object();
    private static Object item2 = new Object();

    public static void main(String[] args){
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                synchronized (item1) {
                    System.out.println("Thread 1: Holding item 1...");
                    try {
                        Thread.sleep(100);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }

                    System.out.println("Thread 1: Waiting for item 2...");
                    synchronized (item2) {
                        System.out.println("Thread 1: Acquired item 2");
                    }
                }
            }
        });

        // Thread 2
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                synchronized (item2) {
                    System.out.println("Thread 2: Holding item 2...");
                    try {
                        Thread.sleep(100);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                    System.out.println("Thread 2: Waiting for item 1...");
                    synchronized (item1) {
                        System.out.println("Thread 2: Acquired item 1");
                    }
                }
            }
        });

        t1.start();
        t2.start();

    }
}
