/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reverseecho;
import java.net.*;
import java.io.*;
/**
 *
 * @author 13307
 */
public class ReverseEcho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
    ServerSocket sst=new ServerSocket(1998);
    Socket st=sst.accept();
    BufferedReader br=new BufferedReader(new InputStreamReader(st.getInputStream()));
    String msg;StringBuilder sb;
    PrintStream ps=new PrintStream(st.getOutputStream());
    do
    {
    msg=br.readLine();
    System.out.println("Send From Client: "+msg);
    sb=new StringBuilder(msg);
    sb.reverse();
    msg=sb.toString();
    ps.println(msg);
    
    }
    while(!msg.equals("dne"));
    
    }
    
}
class client
{
public static void main(String[] args) throws Exception
{
Socket st=new Socket("localhost",1998);
BufferedReader brc=new BufferedReader(new InputStreamReader(System.in));
BufferedReader br=new BufferedReader(new InputStreamReader(st.getInputStream()));
PrintStream ps=new PrintStream(st.getOutputStream());
String msg;
do
{   System.out.println("Please Enter.");
    msg=brc.readLine();
    ps.println(msg);
    msg=br.readLine();
    System.out.println("Sent Back From Server: "+msg);
}while(!msg.equals("dne"));
}

}
