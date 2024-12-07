package calistir;

import db.ConnectionManager;
import db.ConnectionManager2;
import db.ConnectionManager3;

public class Calistir {
	public static void main(String[] args) {
		ConnectionManager cm1 = ConnectionManager.getInstance();
		ConnectionManager cm2 = ConnectionManager.getInstance();
		if (cm1 == cm2) {
			System.out.println("ConnectionManager için iki referans da eşittir.");
		}
		cm1.getConnection();

		ConnectionManager2 cm3 = ConnectionManager2.getInstance();
		ConnectionManager2 cm4 = ConnectionManager2.getInstance();
		if (cm3 == cm4) {
			System.out.println("ConnectionManager2 için iki referans da eşittir.");
		}
		cm4.getConnection();

		ConnectionManager3 cm5 = ConnectionManager3.INSTANCE;
		ConnectionManager3 cm6 = ConnectionManager3.INSTANCE;
		if (cm5 == cm6) {
			System.out.println("ConnectionManager3 için iki referans da eşittir.");
		}
		cm5.getConnection();
	}
}
