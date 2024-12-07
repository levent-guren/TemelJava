package tr.com.ornek;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
// @Retention annotation'ı tanımlanıp içine;
// SOURCE yazıldığında kullanıldığı yeerdeki annotation compile olmuyor.
// sadece source code'da kalıyor. Açıklama gibi davranıyor.
// CLASS yazıldığında derleniyor.
// RUNTIME yazıldığında ise yazılan annotation ve verilen değerler çalışırken
// sorgulanabiliyor.

public @interface B {
    public String value();
}
