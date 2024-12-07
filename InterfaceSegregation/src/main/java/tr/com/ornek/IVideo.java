package tr.com.ornek;

public interface IVideo {
    public void getTime();
    // Tüm videolarda getTime() ve playAdvert() bulunmayabiliyor.
    // Bu iki fonksiyon birbiri ile ilişkili olmadığından
    // farklı interface'lere yazılmaları gerekiyor.
    public void playAdvert();
}
