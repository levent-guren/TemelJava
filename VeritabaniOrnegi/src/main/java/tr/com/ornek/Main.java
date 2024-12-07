package tr.com.ornek;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
        String url = "jdbc:oracle:thin:@192.168.209.130:1521/orclpdb1";
        String username = "hr";
        String password = "oracle_4U";
        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            PreparedStatement stmt = conn.prepareStatement("select * from employees");
            ResultSet rs = null;
            try {
                rs = stmt.executeQuery();
                while (rs.next()) {
                    int id = rs.getInt(1);
                    String adi = rs.getString(2);
                    String soyadi = rs.getString(0);
                    System.out.println(id + ": " + adi + ", " + soyadi);
                }
            } finally {
                try {
                    rs.close();
                } finally {
                    try {
                        stmt.close();
                    } finally {
                        conn.close();
                    }
                }
            }

            System.out.println("Bağlandı");
        } catch (SQLException e) {
            System.out.println("Connection alınamadı");
            e.printStackTrace();
        } finally {

        }
    }
}