package tr.com.ornek;

public class Main2 {
    public static void main(String[] args) {
        String[][] isimler = new String[3][];
        isimler[2] = new String[4];
        isimler[1] = isimler[0];
        isimler[0] = isimler[2];
        isimler[0][1] = "Ayşe";
        isimler[2][2] = isimler[0][0];
        isimler[1] = isimler[0];
        System.out.println(isimler[1][1]);
        System.out.println(isimler[2][2]);
    }
}
