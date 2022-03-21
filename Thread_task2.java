public class Thread_task2 implements Runnable{
    public void run(){
        //
    }
    public static void main(String[] args){
        Thread_task2 r1 = new Thread_task2();
        Thread t1 = new Thread(r1);
        System.out.println(t1.getName());
    }
}