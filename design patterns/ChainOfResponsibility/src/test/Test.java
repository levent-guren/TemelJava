package test;

import mail.Mail;
import mail.MailSpamKontrolu;

public class Test {
	public static void main(String[] args) {
		MailSpamKontrolu spamKontrolu = new MailSpamKontrolu();
		Mail mail1 = new Mail();
		mail1.setGonderen("asiye.duman@gmail.com");
		mail1.setAlici("asiye.duman@gmail.com");
		mail1.setBaslik("Merhaba");
		mail1.setMesaj("Guzellik urunlerimizden deneyiniz.");

		Mail mail2 = new Mail();
		mail2.setGonderen("asiye.duman@hotmail.com");
		mail2.setAlici("mustafa.keser@gmail.com");
		mail2.setBaslik("Selam");
		mail2.setMesaj("Sizinle tanismak istiyorum.");

		Mail mail3 = new Mail();
		mail3.setGonderen("levent@infopark.com.tr");
		mail3.setAlici("onder.koksal@tnb.org.tr");
		mail3.setBaslik("Sinav");
		mail3.setMesaj("sinav sorulari ektedir. Koay gelsin :)");

		Mail mail4 = new Mail();
		mail4.setGonderen("levent@infopark.com.tr");
		mail4.setAlici("onder.koksal@tnb.org.tr");
		mail4.setBaslik("BURAYA BAKIN!!!!");
		mail4.setMesaj("sinav sorulari ektedir. Koay gelsin :)");

		spamKontrolu.setMail(mail1);
		System.out.println("ilk mail spam kontrol sonucu: " + spamKontrolu.spamKontrolu());

		spamKontrolu.setMail(mail2);
		System.out.println("ikinci mail spam kontrol sonucu: " + spamKontrolu.spamKontrolu());

		spamKontrolu.setMail(mail3);
		System.out.println("ucuncu mail spam kontrol sonucu: " + spamKontrolu.spamKontrolu());

		spamKontrolu.setMail(mail4);
		System.out.println("dort mail spam kontrol sonucu: " + spamKontrolu.spamKontrolu());
	}
}
