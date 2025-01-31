package threads;

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }
    
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();  // Starts the thread
    }
}


//A thread in Java is a lightweight subprocess that allows concurrent execution of tasks within a program. Java provides built-in support for multithreading through the java.lang.Thread class and the java.lang.Runnable interfac