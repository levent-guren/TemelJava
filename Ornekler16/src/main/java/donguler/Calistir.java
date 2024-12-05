package donguler;

public class Calistir {
    public static void main(String[] args) {
        int b = 4;
        b++;
        ++b;
        b+=1;
        b*=3; // b = b * 3;

        for (int i = 0; i < 4; i++) {
            System.out.println(i);
        }
        int c = 0;
        while(c<5) {
            System.out.println(c++);
        }
        c = 0;
        do {
            System.out.println(c++);
        } while (c<5);
        String deger = "a";
        switch (deger) {
            case "a":
                System.out.println("bir");
                break;
            case "b":
                System.out.println("iki");
                break;
            default:
                System.out.println("merhaba");
        }
        if (1==2) {
            // 1 == 2 ifadesi doğru ise buradaki kodlar çalıştırılır.
        } else {

        }

        /*
        !=
        <>
        ikisi de eşit değil anlamına geliyor.
         */
        int a = -3;
        b = 4;
        if (a>1 && b<10) {
            // & ve | işaretleri tek olarak kullanıldıklarında iki tarafa da bakıyor.Sonucu öyle belirliyor.
            // Çift kullanıldığında sol taraf tek başına sonucu belirliyor ise sağ tarafa bakmıyor.
            System.out.println("a>1 ve b<10");
        }
    }
}
