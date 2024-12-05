package tr.com.ornek;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Gezegen gezegen = Gezegen.MERKUR;
        if (gezegen == Gezegen.MERKUR) {
            System.out.println(gezegen.getCap());
            System.out.println(gezegen);
            System.out.println(gezegen.name());
            System.out.println(gezegen.ordinal());
            System.out.println(Gezegen.DUNYA.ordinal());
        }
    }
}