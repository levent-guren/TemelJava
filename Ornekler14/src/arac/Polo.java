package arac;

public class Polo extends Araba{
    // Araba sınıfında default constructor olmadığından
    // bu sınıfa hiç constructor yazmas isek yazıldığı varsayılarn constructor
    // super sıfındaki default constructor'ı çağırırır. Bu da hataya sebep olur.
    // Buraya bir constructor yazarak super sınıfındaki int alan constructor'ı çağırması
    // saplanarak hata önlenir.
    public Polo(int hiz) {
        super(hiz);
    }
}
