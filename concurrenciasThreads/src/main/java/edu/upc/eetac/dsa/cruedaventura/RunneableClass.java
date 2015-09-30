package edu.upc.eetac.dsa.cruedaventura;

public class RunneableClass implements Runnable
{
    long lastExecution = 0;
    int counter = 0;
    private boolean name;

    public void run()
    {
        for (int i = 0; i < 10; i++) {
            long currentExecution = System.currentTimeMillis();
            long elapsed = (lastExecution == 0) ? 0 : currentExecution - lastExecution;
            lastExecution = currentExecution;
            System.out.println(Thread.currentThread().getName()+ "elapsed =" + elapsed + "ms. ["+ (++counter)+ "]");
            long sleep = (long) (Math.random() * 2000);
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e)
            {e.printStackTrace();}
        }

    }

}
