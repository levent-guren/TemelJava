package tr.com.ornek;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor // Bean sınıflarında default constructor
// kural gereği mutlaka olmalıdır.
public class Kisi {
    private String adi;
    private Cinsiyet cinsiyet;
    private int yas;
}
