public class Thread_task3 extends Thread{
    public void run(){
        System.out.println("Hello All");
    }
    public static void main(String[] args){
        Thread_task3 t1 = new Thread_task3();
        Thread_task3 t2 = new Thread_task3();
        Thread_task3 t3 = new Thread_task3();
        Thread_task3 t4 = new Thread_task3();
        Thread_task3 t5 = new Thread_task3();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}