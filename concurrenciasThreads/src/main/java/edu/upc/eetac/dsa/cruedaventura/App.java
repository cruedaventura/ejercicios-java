package edu.upc.eetac.dsa.cruedaventura;

/**
 * Hello world!
 */
public class App
{
    public static void main(String[] args) throws InterruptedException
    {
        ThreadClass threadClass = new ThreadClass("thread class");
        Thread thread = new Thread(new RunneableClass(), "runneable class");
        threadClass.start();
        thread.start();

        threadClass.join();
        thread.join();

        System.out.println("Se acabó");


    }
}
