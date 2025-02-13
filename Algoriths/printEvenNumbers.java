package com.Algorithms.Algoriths;


 class PrintSequenceRunnable implements Runnable{

    public int PRINT_NUMBERS_UPTO=20;
    static int  number=2;
    int remainder;
    static Object lock=new Object();

    PrintSequenceRunnable(int remainder)
    {
        this.remainder=remainder;
    }

    @Override
    public void run() {
        while (number < PRINT_NUMBERS_UPTO-2) {
            synchronized (lock) {
            	//System.out.println((number % 3 != remainder)+" : "+Thread.currentThread().getName());
                while (number % 2 != 0) { // wait for numbers other than remainder
                    try {
                    	//System.out.println("inside method : "+Thread.currentThread().getName()+" number : "+number+" remainder : "+remainder);
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
               // System.out.println("below : "+Thread.currentThread().getName()+" number : "+number+" remainder : "+remainder);

                System.out.println(Thread.currentThread().getName() + " " + number);
                number+=2;
                lock.notifyAll();
            }
        }
    }
}
public class printEvenNumbers {

	public static void main(String[] args) {
		
        PrintSequenceRunnable runnable1=new PrintSequenceRunnable(1);
        PrintSequenceRunnable runnable2=new PrintSequenceRunnable(2);
        PrintSequenceRunnable runnable3=new PrintSequenceRunnable(3);
        PrintSequenceRunnable runnable4=new PrintSequenceRunnable(0);

 
        Thread t1=new Thread(runnable1,"T1");
        Thread t2=new Thread(runnable2,"T2");
        Thread t3=new Thread(runnable3,"T3");
        Thread t4=new Thread(runnable4,"T4");
 
        t1.start();
        t2.start();
     //   t3.start();   
      //  t4.start();

	}

}
