package tr.com.ornek;

public class Chicken implements Bird {
    @Override
    public void makeVoice() {
        System.out.println("Cluck");
    }

    @Override
    public void fly() {
        // Bu metodu interface'te olduğu için yazmak zorunda kalıyoruz.
        // Zorunda kalındığı için metod yazmak doğru değildir.(Liskov)
        // Çözüm bu metodun interface'ini ayrı yazmaktır.
        System.out.println("I can't fly. :(");
    }
}
