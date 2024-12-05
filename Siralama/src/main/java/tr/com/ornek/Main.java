package tr.com.ornek;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Etek[] etekler = {
                new Etek("Mango", 190),
                new Etek("Zara", 110),
                new Etek("LCW", 220)};
        // etekler =  new Etek[] {}; // için dolu array böyle de oluşturulabiliyor.
        sirala(etekler);
        for(int i = 0; i < etekler.length; i++) {
            System.out.println(etekler[i]);
        }

        Ruj[] rujlar = { new Ruj(30), new Ruj(300), new Ruj(200), new Ruj(220) };
        sirala(rujlar);
        for(int i = 0; i < rujlar.length; i++) {
            System.out.println(rujlar[i]);
        }

    }
    public static void sirala(Kiyaslanabilir[] objeler) {
        for (int i = 0; i < objeler.length-1; i++) {
            for (int j = i + 1; j < objeler.length; j++) {
                if (objeler[i].kiyasla(objeler[j]) < 0 ) {
                    // ikisini yer değiştir.
                    Kiyaslanabilir temp = objeler[j];
                    objeler[j] = objeler[i];
                    objeler[i] = temp;
                }
            }
        }
    }
}