/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reflectdemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

class My
{
private int a;
protected int b;
public int c;
int d;
public My(){}
public My(int x,int y){}
public void display(String s1,String s2){}
public int show(int x,int y){return 0;}
}
/**
 *
 * @author 13307
 */
public class ReflectDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Class c=My.class;
    My m=new My();
    Class c2=m.getClass();
    System.out.println(c2.getName());
    Field field []=c.getDeclaredFields();
    Method meth[]=c.getMethods();
    for (Field f:field)
    {System.out.println(f);}
    for (Method md:meth)
    {System.out.println(md);}
    Parameter pame[]=meth[0].getParameters();
    for (Parameter pm:pame)
    {System.out.println(pm);}
    }
    
}
