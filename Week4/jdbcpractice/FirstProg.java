package Week4.jdbcpractice;

import java.sql.*;
import java.util.Scanner;

public class FirstProg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try 
        {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","sky3102");
            PreparedStatement pstmt;
            while(true){
                System.out.println("enter your choice: ");
                System.out.println("1. insert into employee table");
                System.out.println("2. insert into emp_attendence table");
                System.out.println("3. display ");
                System.out.println("4. exit ");
                int ch = Integer.parseInt(sc.nextLine());

                switch (ch) {
                    case 1:
                        System.out.println("enter employee details: ");
                        System.out.print("enter id: ");
                        int id = Integer.parseInt(sc.nextLine());
                        System.out.print("enter name: ");
                        String name = sc.nextLine();
                        
                        pstmt = conn.prepareStatement("insert into employee(emp_id,name) values(?,?)");
                        
                        pstmt.setInt(1, id);
                        pstmt.setString(2, name);
                        int cnt = pstmt.executeUpdate();
                        if(cnt==1) System.out.println("inserted successufully.");
                        else System.out.println("failed.");
                        pstmt.close();
                        break;

                    case 2:
                        System.out.println("enter emp_attendence details: ");
                        System.out.print("enter id: ");
                        id = Integer.parseInt(sc.nextLine());
                        System.out.print("enter present count: ");
                        int p_count = Integer.parseInt(sc.nextLine());
                        System.out.print("enter absent count: ");
                        int a_count = Integer.parseInt(sc.nextLine());

                        pstmt = conn.prepareStatement("insert into emp_attendence(emp_id,p_count,a_count) values(?,?,?)");

                        pstmt.setInt(1, id);
                        pstmt.setInt(2, p_count);
                        pstmt.setInt(3, a_count);
                        cnt = pstmt.executeUpdate();
                        if(cnt==1) System.out.println("inserted successufully.");
                        else System.out.println("failed.");
                        pstmt.close();
                        break;

                    case 3:
                        pstmt = conn.prepareStatement("select * from employee inner join emp_attendence on employee.emp_id=emp_attendence.emp_id");
                        ResultSet rs = pstmt.executeQuery();
                        ResultSetMetaData rst = rs.getMetaData();
                        System.out.println("emp_id\t"+"name\t\t"+"p_count "+"a_count");
                        while(rs.next())
                        {
                            System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(4)+"\t"+rs.getInt(5));
                        }
                        pstmt.close();
                        break;
                
                    case 4:
                        conn.close();
                        System.exit(1);
                        break;

                    default:
                        break;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }    
}
