public class ThreadAnnonymousInnerClass {

    public static void main(String[] args) {


        Thread t=new Thread(){
            @Override
            public void run() {
                System.out.println("thread class using annonymous inner class");
            }
        };

        t.start();
    }
}
