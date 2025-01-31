package threads;

class DemoThread extends Thread {
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("Thread running: " + i);
            try {
                Thread.sleep(500); // Sleep for 500ms
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        DemoThread t1 = new DemoThread();
        t1.start();
        t1.join();  // Main thread waits for t1 to finish
        System.out.println("Main thread execution completed.");
    }
}
