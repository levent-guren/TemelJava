package tr.com.ornek;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

// sadece değeri verilmemiş final değişkenler için constructor oluşturur.
@RequiredArgsConstructor

// Tüm değişkenler için constructor oluşturur.
@AllArgsConstructor

public class Rimel {
    private final String marka = null;
    private String renk;
}
