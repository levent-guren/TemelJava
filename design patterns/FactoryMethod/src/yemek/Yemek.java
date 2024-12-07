package yemek;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public abstract class Yemek {
	private List<String> icindekiler = new ArrayList<>();
	private String adi;
	private String tarif;

	public abstract void yemegiHazirla();

	public Yemek() {
		yemegiHazirla();
	}

	public String toString() {
		StringBuilder sonuc = new StringBuilder();
		sonuc.append("Yemeğimizin adı: ");
		sonuc.append(adi);
		sonuc.append("\n\nİçindekiler:\n");
		icindekiler.forEach(malzeme -> {
			sonuc.append(malzeme);
			sonuc.append('\n');
		});
		sonuc.append("\nTarif:\n");
		sonuc.append(tarif);
		return sonuc.toString();
	}
}
