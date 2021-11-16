package Week4.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class MySqlQuery {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","sky3102");

            Statement stmt = conn.createStatement();

            int cnt,roll;
            String name;
            float per;

            ResultSet rs;

            while(true)
            {
                System.out.println();
                System.out.println("Enter your choice: ");
                System.out.println("1. insert values");
                System.out.println("2. display");
                System.out.println("3. delete record");
                System.out.println("4. update record");
                System.out.println("5. exit");
                int ch = Integer.parseInt(sc.nextLine());

                switch (ch) 
                {
                    case 1:
                        //insert values
                        System.out.println();
                        
                        System.out.print("enter student roll: ");
                        roll = Integer.parseInt(sc.nextLine());
                        System.out.print("enter student name: ");
                        name = sc.nextLine();
                        System.out.print("enter student percentage: ");
                        per = Float.parseFloat(sc.nextLine());

                        cnt = stmt.executeUpdate("insert into student1(roll,name,percentage) values("+roll+",'"+name+"',"+per+")");

                        if(cnt == 1)
                        System.out.println("inserted");
                        else
                        System.out.println("couldn't insert");
                        break;

                    case 2:
                        // display
                        System.out.println();

                        rs = stmt.executeQuery("select * from student1");
                        while(rs.next())
                        {
                            System.out.println(rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getFloat(3));
                        }
                        break;

                    case 3:
                        // delete
                        System.out.println();

                        System.out.print("enter rollno.");
                        roll = Integer.parseInt(sc.nextLine());
                        cnt = stmt.executeUpdate("delete from student1 where roll = "+roll);

                        if(cnt==1)
                        System.out.println("deleted");
                        else
                        System.out.println("couldn't delete");
                        break;

                    case 4:
                        // update
                        System.out.println();

                        System.out.println("Old record: ");
                        rs = stmt.executeQuery("select * from student1");
                        while(rs.next())
                        {
                            System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3));
                        }
                        System.out.println();
                        System.out.print("enter rollno: ");
                        roll = Integer.parseInt(sc.nextLine());
                        System.out.print("enter new name: ");
                        name = sc.nextLine();
                        System.out.print("enter new percentage: ");
                        per = Float.parseFloat(sc.nextLine());

                        cnt = stmt.executeUpdate("update student1 set name = '"+name+"', percentage = "+per+" where roll = "+roll);
                        System.out.println();
                        if(cnt==1)
                        System.out.println("updated");
                        else
                        System.out.println("couldn't update");
                        break;

                    case 5:
                        // exit
                        System.out.println();
                        conn.close();
                        System.exit(1);
                    
                    default:
                        break;
                }
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
