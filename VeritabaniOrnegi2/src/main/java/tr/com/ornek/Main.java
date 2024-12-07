package tr.com.ornek;

public class Main {
    public static void main(String[] args) {
        Thread t1 =  new Thread() {
            @Override
            public void run() {
                Test1 t1 = new Test1();
                t1.test();
            }
        };
        Thread t2 =  new Thread() {
            @Override
            public void run() {
                Test2 t2 = new Test2();
                t2.test();
            }
        };
        t1.start();
        t2.start();
    }
}