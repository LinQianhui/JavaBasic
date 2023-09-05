/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package database;
import java.sql.*;
import java.util.*;
/**
 *
 * @author 13307
 */
public class Database {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
    Class.forName("org.sqlite.JDBC");
    Connection con=DriverManager.getConnection("jdbc:sqlite:C:\\SQLite\\univ.bd");
    Statement stm=con.createStatement();
    ResultSet rs=stm.executeQuery("select * from student");
    while(rs.next())
    {
    System.out.print(rs.getInt("roll")+"  ");
    System.out.print(rs.getString(2)+"  ");
    System.out.print(rs.getString(3)+"  ");
    System.out.println(rs.getInt("deptno"));
    
    }
    System.out.println("--------------------------");
    /**
    PreparedStatement pstm=con.prepareStatement("select * from student where city=?");
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a City");
    String city=sc.nextLine();
    pstm.setString(1, city);
    ResultSet rs2=pstm.executeQuery();
    while(rs2.next())
    {
    System.out.print(rs2.getInt("roll")+"  ");
    System.out.print(rs2.getString(2)+"  ");
    System.out.print(rs2.getString(3)+"  ");
    System.out.println(rs2.getInt("deptno"));
    
    }
     */
    stm.close();
    //pstm.close();
    /**
    PreparedStatement stm3=con.prepareStatement("insert into student values(?,?,?,?)");
    Scanner sc2=new Scanner(System.in);
    System.out.println("Enter students' roll number.");
    int roll2=sc2.nextInt();
    System.out.println("Enter students' name.");
    String namex=sc2.nextLine();
    String name2=sc2.nextLine();
    System.out.println("Enter students' city.");
    String city2=sc2.nextLine();
    System.out.println("Enter students' department.");
    int deptno2=sc2.nextInt();
    stm3.setInt(1, roll2);
    stm3.setString(2, name2);
    stm3.setString(3,city2);
    stm3.setInt(4, deptno2);
    stm3.executeUpdate();
    stm3.close();
    */
    Statement stm4=con.createStatement();
    stm4.executeUpdate("Drop table temp");
    stm4.close();
    
    con.close();
    
    
    }
    
}
