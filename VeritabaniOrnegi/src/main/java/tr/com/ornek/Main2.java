package tr.com.ornek;

import java.sql.*;

public class Main2 {

    public static void main(String[] args) {
        String url = "jdbc:oracle:thin:@192.168.209.130:1521/orclpdb1";
        String username = "hr";
        String password = "oracle_4U";
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = DriverManager.getConnection(url, username, password);
            stmt = conn.prepareStatement("select * from employees");
            rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt(1);
                String adi = rs.getString(2);
                String soyadi = rs.getString(3);
                System.out.println(id + ": " + adi + ", " + soyadi);
            }
            System.out.println("Bağlandı");
        } catch (SQLException e) {
            System.out.println("Connection alınamadı");
            e.printStackTrace();
        } finally {
            close(rs, stmt, conn);
        }
    }

    public static void close(ResultSet rs, PreparedStatement stmt, Connection conn) {
        try {
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(stmt, conn);
        }
    }

    public static void close(PreparedStatement stmt, Connection conn) {
        try {
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(conn);
        }
    }
    public static void close(Connection conn) {
        try {
            conn.close();
            if (conn.isClosed()) {
                System.out.println("Connection kapalı");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}