/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multireverseecho;
import java.io.*;
import java.net.*;
/**
 *
 * @author 13307
 */
/**
class Server extends Thread
{
Socket st;
public Server(Socket st)
{
this.st=st;
}
@Override
public void run()
{
try
{
BufferedReader br=new BufferedReader(new InputStreamReader(st.getInputStream()));
PrintStream ps=new PrintStream(st.getOutputStream());
String msg;
StringBuilder sb;
do
{
msg=br.readLine();
System.out.println("Recieve From Client: "+msg);
sb=new StringBuilder(msg);
sb.reverse();
msg=sb.toString();
ps.println(msg);
System.out.println("Sending "+'"'+msg+'"'+" to Client......");

}while(!msg.equals("dne"));
}
catch(Exception e){}
}
}
* */ 
class Client
{
public static void main(String[] args) throws Exception
{
Socket st=new Socket("localhost",1998);
BufferedReader brc=new BufferedReader(new InputStreamReader(System.in));
BufferedReader br=new BufferedReader(new InputStreamReader(st.getInputStream()));
PrintStream ps=new PrintStream(st.getOutputStream());
String msg; 
do
{msg=brc.readLine();
ps.println(msg);
msg=br.readLine();
System.out.println("Sent From Server: "+msg);
}while(!msg.equals("dne"));

}
}
       


public class MultiReverseEcho extends Thread{
    Socket st;
    public MultiReverseEcho(Socket st)
    {
    this.st=st;
    }
    public void run()
{
try
{
BufferedReader br=new BufferedReader(new InputStreamReader(st.getInputStream()));
PrintStream ps=new PrintStream(st.getOutputStream());
String msg;
StringBuilder sb;
do
{
msg=br.readLine();
System.out.println("Recieve From Client: "+msg);
sb=new StringBuilder(msg);
sb.reverse();
msg=sb.toString();
ps.println(msg);
System.out.println("Sending "+'"'+msg+'"'+" to Client......");

}while(!msg.equals("dne"));
}
catch(Exception e){}
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
        // TODO code application logic here
    ServerSocket sst=new ServerSocket(1998);
    do
    {Socket st=sst.accept();
    System.out.println("Client Connected");
    MultiReverseEcho mre=new MultiReverseEcho(st);
    mre.start();
    }while(true);
    
    
    }
    
}
