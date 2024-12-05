package tr.com.ornek;

public class Main {

    public static void main(String[] args) {
        Etek[] etekler = {
                new Etek("Mango", 190),
                new Etek("Zara", 110),
                new Etek("LCW", 220)};

        // etekler =  new Etek[] {}; // için dolu array böyle de oluşturulabiliyor.
        sirala(etekler,
            (o1,  o2) -> {
                Etek e1 = (Etek) o1;
                Etek e2 = (Etek) o2;
                int sonuc = 0;
                if (e1.getFiyat() > e2.getFiyat()) {
                    sonuc = 1;
                } else if (e1.getFiyat() < e2.getFiyat()) {
                    sonuc = -1;
                }
                return sonuc;
            }
        );
        for(int i = 0; i < etekler.length; i++) {
            System.out.println(etekler[i]);
        }
        sirala(etekler, new Kiyasla() {
                    @Override
                    public int kiyasla(Object o1, Object o2) {
                        Etek e1 = (Etek) o1;
                        Etek e2 = (Etek) o2;
                        int sonuc = 0;
                        if (e1.getFiyat() > e2.getFiyat()) {
                            sonuc = -1;
                        } else if (e1.getFiyat() < e2.getFiyat()) {
                            sonuc = 1;
                        }
                        return sonuc;
                    }


                }
        );
        for(int i = 0; i < etekler.length; i++) {
            System.out.println(etekler[i]);
        }

        Ruj[] rujlar = { new Ruj(30), new Ruj(300), new Ruj(200), new Ruj(220) };
        sirala(rujlar, new RujKiyasla());
        for(int i = 0; i < rujlar.length; i++) {
            System.out.println(rujlar[i]);
        }

    }
    public static void sirala(Object[] objeler,Kiyasla kiyaslaMerci ) {
        for (int i = 0; i < objeler.length-1; i++) {
            for (int j = i + 1; j < objeler.length; j++) {
                if (kiyaslaMerci.kiyasla(objeler[i],objeler[j]) > 0 ) {
                    // ikisini yer değiştir.
                    Object temp = objeler[j];
                    objeler[j] = objeler[i];
                    objeler[i] = temp;
                }
            }
        }
    }
}