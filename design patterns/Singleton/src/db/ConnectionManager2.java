package db;

public class ConnectionManager2 {
	// eager loading.
	private static ConnectionManager2 instance = new ConnectionManager2();

	private ConnectionManager2() {
		// reflection api ile çağırmayı engellemek için
		if (instance != null) {
			throw new RuntimeException("Can not create second instance for singletons.");
		}
	}

	public static ConnectionManager2 getInstance() {
		return instance;
	}

	public void getConnection() {
		System.out.println("GetConnection çağırıldı");
	}
}
