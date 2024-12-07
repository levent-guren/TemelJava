package tr.com.ornek;

public class Duck implements Bird {
    @Override
    public void makeVoice() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
