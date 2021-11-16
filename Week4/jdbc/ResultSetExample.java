import java.sql.*;

public class ResultSetExample
{
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "sky3102");
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery("select * from student1");
            rs.last();
            rs.moveToInsertRow();
            rs.updateInt(1, 7);
            rs.updateString(2, "vivaswan");
            rs.updateFloat(3, 68);
            rs.insertRow();
            rs.first();
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3));
            }
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}