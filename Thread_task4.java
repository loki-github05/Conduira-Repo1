public class Thread_task4 implements Runnable{
    public void run(){
        System.out.println("Hello All");
    }
    public static void main(String[] args){
        Thread_task4 m1 = new Thread_task4();
        Thread t1 = new Thread(m1);
        Thread t2 = new Thread(m1);
        Thread t3 = new Thread(m1);
        Thread t4 = new Thread(m1);
        Thread t5 = new Thread(m1);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}