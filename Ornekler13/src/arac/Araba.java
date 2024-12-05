package arac;

public class Araba {
    int hiz;
    // sub sınıfınta (extend eden) da aynı fonksiyon varsa
    // (aynı isimde ve aynı parametrelerde)
    // her zaman sub sınıftaki fonksiyon çalıştırılır.
    // Super sınıftaki (bu sınıf) fonksiyon sadece sub sınıftan
    // super.getHiz() yazılarak çağırılabilir.
    public int getHiz() {
        return hiz;
    }
}
