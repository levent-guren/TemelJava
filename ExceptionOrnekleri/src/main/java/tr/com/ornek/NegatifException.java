package tr.com.ornek;

import lombok.Data;
import lombok.experimental.StandardException;

@Data
@StandardException // throwable sınıfındaki 4 constructor'ı çağıran
// aynı parametreler ile çağıran 4 constructor ekler.
public class NegatifException extends RuntimeException {
    private String adi;

    public NegatifException(String message, String adi) {
        super(message);
        this.adi = adi;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }
}
