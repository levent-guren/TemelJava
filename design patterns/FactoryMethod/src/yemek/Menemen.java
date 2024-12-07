package yemek;

public class Menemen extends Yemek {

	@Override
	public void yemegiHazirla() {
		setAdi("Menemen");
		getIcindekiler().add("yumurta");
		getIcindekiler().add("biber");
		getIcindekiler().add("domates");
		getIcindekiler().add("sogan");
		getIcindekiler().add("tuz");
		setTarif(
				"Tavaya yag konur. Sogan, biber ve domates sirasiyla kavrulur. Icine yumurtalar kirilir.\nIstenilen kivama kadar pisirilir.");

	}

}
