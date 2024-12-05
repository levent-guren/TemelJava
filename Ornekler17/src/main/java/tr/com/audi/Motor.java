package tr.com.audi;

public class Motor {
    static  {
        // static bloğu sınıf ilk defa kullanıldığında hafızaya yüklendiğinde çalıştırılıyor.
        // sınıfa birden fazla static bloğu yazılabilmesine rağmen tavsiye edilmiyor.
        System.out.println("5");
    }
    private int hacim;
    public Motor() {
        System.out.println("1");
    }

    public void setHacim(int hacim) {
        this.hacim = hacim;
        System.out.println("3");
    }
}
