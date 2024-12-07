package tr.com.ornek.db;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDB {
    String url = "jdbc:oracle:thin:@192.168.209.130:1521/orclpdb1";
    String username = "hr";
    String password = "oracle_4U";
    // ThreadLocal değişkeni içindeki değeri thread bazında saklar.
    private static ThreadLocal<Connection> threadLocalConnection = new ThreadLocal<>();

    protected Connection getConnection() {
        if (threadLocalConnection.get()==null) {
            try {
                threadLocalConnection.set(DriverManager.getConnection(url, username, password));
            } catch (SQLException e) {
                System.out.println("Connection alınamadı:" + e.getMessage());
            }
        }
        return threadLocalConnection.get();
    }
}
