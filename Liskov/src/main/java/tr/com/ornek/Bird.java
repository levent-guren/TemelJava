package tr.com.ornek;

public interface Bird {
    public void makeVoice();
    // Bütün kuşlar uçmaz. Bu yüzden burada fly()
    // metodu yazmak Liskov prensibine aykırı oluyor.
    public void fly();
}
