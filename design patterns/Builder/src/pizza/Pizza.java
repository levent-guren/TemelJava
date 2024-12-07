package pizza;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

// UML diyagramındaki Product olarak görünen sınıf
@Data
public class Pizza {
	private List<String> icindekiler = new ArrayList<>();
	private int pisirmeSuresi;
	private String adi;
}
