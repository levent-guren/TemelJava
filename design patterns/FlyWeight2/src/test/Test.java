package test;

import beans.Personel;
import dao.PersonelDAO;
import db.Database;

public class Test {
	private static Database database;

	public static void main(String[] args) {
		PersonelDAO dao = getPersonelDao();

		Personel personel = dao.getPersonel(11);
		System.out.println(personel);
		Personel personel2 = dao.getPersonel(11);
		System.out.println(personel2);
		Personel yeniPersonel = new Personel(22, "Lale");
		dao.personelKaydet(yeniPersonel);
		System.out.println(dao.getPersonel(12));
		System.out.println(dao.getPersonel(11));
		System.out.println(dao.getPersonel(22));
		personel.setAdi("Naci");
		dao.personelKaydet(personel);
		System.out.println(dao.getPersonel(11));
		database.veritabaniIcerigiYaz();
	}

	private static PersonelDAO getPersonelDao() {
		//@formatter:off
		database = new Database(
				new Personel(12, "Levent"),
				new Personel(18, "Ahmet"),
				new Personel(22, "Ayse"),
				new Personel(5, "Kazim"),
				new Personel(11, "Veli"),
				new Personel(19, "Mahmut"),
				new Personel(23, "Acelya")
		); 
		//@formatter:on
		PersonelDAO dao = new PersonelDAO(database);
		return dao;
	}
}
