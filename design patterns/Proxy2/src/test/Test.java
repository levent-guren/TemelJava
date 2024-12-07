package test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import bean.IPersonel;
import db.Database;

public class Test {
	public static void main(String[] args) {
		List<IPersonel> personeller = getBolumPersonelleri(3);
		personeller.forEach(System.out::println);
		personeller.get(0).setMaas(new BigDecimal("12000"));
		personeller.get(0).setAdi("Lalezar");
	}

	private static List<IPersonel> getBolumPersonelleri(int bolumNo) {
		Database db = new Database();
		List<IPersonel> sonuc = new ArrayList<>();
		for (int i = 1; i < 10; i++) {
			sonuc.add(db.getPersonel(i));
		}
		return sonuc;
	}
}
