package tr.com.audi;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Audi {
    private int yil;
    private String model;
    public String toString() {
        // 3 adetten fazla String toplaması yapıyorsan StringBuilder sınıfı ile
        // yapmalıyız.
        StringBuilder builder = new StringBuilder();
        builder.append("Audi yil:");
        builder.append(yil);
        builder.append(", model:");
        builder.append(model);
        return builder.toString();
    }
}
