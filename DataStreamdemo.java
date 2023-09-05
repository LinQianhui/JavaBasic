/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datastreamdemo;
import java.io.*;
class Student
{
int rollnumber;
String name;
float avg;
String dep;
}
/**
 *
 * @author 13307
 */
public class DataStreamdemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
        // TODO code application logic here
    FileOutputStream fos=new FileOutputStream("C:\\Users\\13307\\MyJava\\student2.txt");
    DataOutputStream dos=new DataOutputStream(fos);
    Student s=new Student();
    s.avg=89.6f;
    s.dep="CSE";
    s.name="Lin";
    s.rollnumber=21;
   dos.writeInt(s.rollnumber);
   dos.writeUTF(s.name);
   dos.writeUTF(s.dep);
   dos.writeFloat(s.avg);
   dos.flush();
   dos.close();
   fos.close();
    FileInputStream fis=new FileInputStream("C:\\Users\\13307\\MyJava\\student2.txt");
    DataInputStream dis=new DataInputStream(fis);
    Student s2=new Student();
    s2.rollnumber=dis.readInt();
    s2.name=dis.readUTF();
    s2.dep=dis.readUTF();
    s2.avg=dis.readFloat();
    System.out.println(" RollNumber "+s2.rollnumber);
    System.out.println(" Name "+s2.name);
    System.out.println(" Department "+s2.dep);
    System.out.println(" Average "+s2.avg);
    fis.close();
    dis.close();
    }
    
}
