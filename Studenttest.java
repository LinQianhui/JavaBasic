/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studenttest;
class student
{
    int id;
    String name;
    String course;
    int m1,m2,m3;
    
    public int total ()
    {
    return m1+m2+m3;
    }
    public double average ()
    {
    return total()/3f;
    }
    
    public void grade ()
    {
    if (average()>=60)
        System.out.println("PASS");
    else
       System.out.println("FAIL"); 
    }
    public String toString ()
    {
        return "ID:" +id+"\n"+"NAME: "+name+"\n";
    }
      
    
}

/**
 *
 * @author 13307
 */
public class Studenttest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    student s1=new student();
    s1.id=66;
    s1.name="June";
    s1.m1=98;
    s1.m2=86;
    s1.m3=90;
    s1.course="Math";
    System.out.printf("The %s average score of student %s (id:%s) is %.3f\n", s1.course,s1.name,s1.id,s1.average());
    s1.grade();
    System.out.println(s1.toString());
    }
    
}
