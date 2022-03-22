import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Thread_task implements Runnable{
    
    @Override
    public void run(){
        for(int i = 1;i <= 10; i++){
            System.out.println(Thread.currentThread().getName() + "The number is " + i);
        }
    }
}

public class Thread_task5
{
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(5);
		Runnable Processor1 = new Thread_task();
		executor.execute(Processor1);
		Runnable Processor2 = new Thread_task();
		executor.execute(Processor2);
		
		executor.shutdown();
		
	}
}