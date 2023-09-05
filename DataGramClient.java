/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datagramclient;
import java.net.*;
import java.io.*;
/**
 *
 * @author 13307
 */
public class DataGramClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
        // TODO code application logic here
    DatagramSocket dgs=new DatagramSocket(2001);
    String msg="Harry Potter";
    DatagramPacket dgp=new DatagramPacket(msg.getBytes(),msg.length(),InetAddress.getByName("localhost"),2000);
    dgs.send(dgp);
    byte b[]=new byte[1024];
    dgp=new DatagramPacket(b,1024);
    dgs.receive(dgp);
    msg=new String(dgp.getData());
    System.out.println("From Server: "+msg);
    dgs.close();
    }
    
}
class Server
{
public static void main(String[] args)throws Exception
{
DatagramSocket dgs=new DatagramSocket(2000);
byte b[]=new byte[1024];
DatagramPacket dgp=new DatagramPacket(b,1024);
dgs.receive(dgp);
String msg=new String(dgp.getData()).trim();
System.out.println("From Client: "+msg);
msg=msg.concat("Welcome to Hogwarts!");
dgp=new DatagramPacket(msg.getBytes(),msg.length(),InetAddress.getByName("localhost"),2001);
dgs.send(dgp);
dgs.close();
}


}
