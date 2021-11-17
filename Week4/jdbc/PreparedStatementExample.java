package Week4.jdbc;

import java.sql.*;
import java.util.Scanner;

public class PreparedStatementExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try
        {
            System.out.print("enter roll: ");
            int roll = Integer.parseInt(sc.nextLine());
            System.out.print("enter name: ");;
            String name = sc.nextLine();
            System.out.print("enter percentage: ");
            float per = Float.parseFloat(sc.nextLine());

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","sky3102");
            PreparedStatement pstmt = conn.prepareStatement("insert into student2 values(?,?,?)");
            
            pstmt.setInt(1, roll);
            pstmt.setString(2, name);
            pstmt.setFloat(3, per);

            int cnt = pstmt.executeUpdate();
            if(cnt == 1)
            System.out.println("inserted successfully");
            else
            System.out.println("failed");

            pstmt = conn.prepareStatement("select * from student2");
            ResultSet rs = pstmt.executeQuery();
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3));
            }
            conn.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
