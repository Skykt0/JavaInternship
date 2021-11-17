package Week4.jdbcpractice;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ThirdProg {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","sky3102");
            PreparedStatement stmt = conn.prepareStatement("insert into imgtable values(?,?)");
            stmt.setString(1, "java");
            
            FileInputStream fin = new FileInputStream("g:/java.png");
            stmt.setBinaryStream(2, fin);
            int cnt = stmt.executeUpdate();
            if(cnt == 1) System.out.println("successfully");
            else System.out.println("failed");
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
