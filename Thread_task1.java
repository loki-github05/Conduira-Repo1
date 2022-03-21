public class Thread_task1 extends Thread{
    public void run(){
        //
    }
    public static void main(String[] args){
        Thread_task1 t1 = new Thread_task1();
        t1.start();
        System.out.println(t1.getName());
    }
}