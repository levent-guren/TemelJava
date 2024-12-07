package yemek;

public class Kisir extends Yemek {

	@Override
	public void yemegiHazirla() {
		setAdi("Kisir");
		getIcindekiler().add("bulgur");
		getIcindekiler().add("biber");
		getIcindekiler().add("domates");
		getIcindekiler().add("sogan");
		getIcindekiler().add("tuz");
		getIcindekiler().add("maydanoz");
		setTarif("Bulgur islatilir. Diger malzemeler ile karistirilir.");
	}

}
