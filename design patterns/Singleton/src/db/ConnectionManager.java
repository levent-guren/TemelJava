package db;

public class ConnectionManager {
	// Lazy lading.
	private static ConnectionManager instance;

	private ConnectionManager() {
		// reflection api ile çağırmayı engellemek için
		if (instance != null) {
			throw new RuntimeException("Can not create second instance for singletons.");
		}
	}

	public static ConnectionManager getInstance() {
		if (instance == null) {
			synchronized ("") {
				if (instance == null) {
					instance = new ConnectionManager();
				}
			}
		}
		return instance;
	}

	public void getConnection() {
		System.out.println("GetConnection çağırıldı");
	}

}
