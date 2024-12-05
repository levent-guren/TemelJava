package tr.com.ornek;

import java.math.BigDecimal;
import java.math.BigInteger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //wrapper();
        bigOrnekleri();
    }

    private static void bigOrnekleri() {
        BigInteger sayi1 = new BigInteger("3254635785782579825695657623957247824678569854656438");
        BigInteger sayi2 = sayi1.multiply(sayi1);
        sayi2 = sayi2.pow(102400);
        System.out.println(sayi2.toString().length());

        BigDecimal para = new BigDecimal("32875623547857858235784696923746786576578523.435762357859875982569856956235762578657857857923659576237586238");
        para = para.pow(2);
        System.out.println(para);

    }

    private static void wrapper() {
        int x = 5;
        Integer y;
        String s;
        // elimizde int değeri var.
        y = Integer.valueOf(x);
        s = String.valueOf(x);
        // elimizde Integer var.
        x = y.intValue();
        s = y.toString();
        // elimizde String var.
        x = Integer.parseInt(s);
        y = Integer.valueOf(s);

        y = x;
        x = y;
        y = y + y;
        // y = y + y alttaki ile aynı işlemi yapar (autoboxing)
        // y = Integer.valueOf(y.intValue() + y.intValue());
    }
}