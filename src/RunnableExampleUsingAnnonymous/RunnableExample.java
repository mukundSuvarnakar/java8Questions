package RunnableExampleUsingAnnonymous;

public class RunnableExample {
    public static void main(String[] args) {


        Runnable r=new Runnable() {
            @Override
            public void run() {
                System.out.println("runnable interface example");
            }
        };
        Thread t=new Thread(r);
        t.start();
    }
}
