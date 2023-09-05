/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package copyfile;
import java.io.*;
/**
 *
 * @author 13307
 */
public class Copyfile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    try
    {FileOutputStream fos=new FileOutputStream("C:/Users/13307/MyJava/source1.txt");
    String str="JAVA TEST FILE";
    byte b[]=str.getBytes();
    fos.write(b);
    
    FileInputStream fis=new FileInputStream("C:/Users/13307/MyJava/source1.txt");
    
    FileOutputStream fos2=new FileOutputStream("C:/Users/13307/MyJava/source2.txt");
    byte b2[]=new byte[fis.available()];
    int x;
    while((x=fis.read())!=-1)
    {
        if(x>=65&&x<=92)
    fos2.write(x+32);
        else
            fos2.write(x);
    }
    fos2.close();
    fos.close();
    
    FileInputStream fis2=new FileInputStream("C:/Users/13307/MyJava/source2.txt");
    SequenceInputStream sis = new SequenceInputStream(fis,fis2) ;
    FileOutputStream fos3=new FileOutputStream("C:/Users/13307/MyJava/destination.txt");
    int y;
    while((y=sis.read())!=-1)
    {
    fos3.write(y);}
    fis.close();
    fos3.close();
    fis2.close();
    sis.close();
    }
    
    catch(Exception e){System.out.println(e);}
    }
    }
    
    

