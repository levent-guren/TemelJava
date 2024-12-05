package tr.com.audi;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("basladi.");
        Motor motor = new Motor();
        motor.setHacim(2000);
        Motor motor2 = new Motor();
        System.out.println("bitti.");
    }
}