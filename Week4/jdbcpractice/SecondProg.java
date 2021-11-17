package Week4.jdbcpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SecondProg {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","sky3102");
            while(true){
                System.out.println("enter choice: ");
                System.out.println("1. insert ");
                System.out.println("2. display ");
                System.out.println("3. exit ");
                int ch = Integer.parseInt(sc.nextLine());

                switch (ch) {
                    case 1:
                        System.out.print("enter roll: ");
                        int roll = Integer.parseInt(sc.nextLine());
                        System.out.print("enter name: ");
                        String name = sc.nextLine();
                        System.out.print("enter dob(yyyy-mm-dd): ");
                        String dob = sc.nextLine();

                        java.sql.Date sqdob = java.sql.Date.valueOf(dob);

                        PreparedStatement pstmt = conn.prepareStatement("insert into student(roll, name, dob) values(?,?,?)");
                        pstmt.setInt(1, roll);
                        pstmt.setString(2, name);
                        pstmt.setDate(3, sqdob);
                        pstmt.executeUpdate();
                        pstmt.close();
                        break;
                
                    case 2:
                        pstmt = conn.prepareStatement("select *from student");
                        ResultSet rs = pstmt.executeQuery();
                        while(rs.next()){
                            System.out.println(rs.getInt(3)+"\t"+rs.getString(1)+"\t"+rs.getDate(2));
                        }
                        pstmt.close();
                        break;

                    case 3:
                        conn.close();
                        System.exit(1);
                        break;
                    default:
                        break;
                }
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
