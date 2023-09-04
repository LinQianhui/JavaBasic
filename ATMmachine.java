/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atmmachine;
class ATM
{
synchronized public void checkbalance (String name)
{
System.out.println(name+" checked balance");
try{Thread.sleep(500);}catch(Exception e){}
System.out.println("BALANCE");
}
synchronized public void withdraw (String name,int i)
{
System.out.println(name+" withdrawing "+i);
try{Thread.sleep(500);}catch(Exception e){}
System.out.println("WITHDRAWED");
}
        
}
class customer extends Thread
{
    int amount;
    String name;
    ATM atm;
public customer (ATM atm,String name,int amount)
    {
        this.atm=atm;
        this.name=name;
        this.amount=amount;
    }  
public void useatm ()
    {
        atm.checkbalance(name);
        atm.withdraw(name, amount);
    }
    @Override
    public void run()
{useatm();}
}

/**
 *
 * @author 13307
 */
public class ATMmachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    ATM atm=new ATM();
        customer c1=new customer (atm,"June",10000);
        customer c2=new customer (atm,"Lynn",60000);
        c1.start();
        
        c2.start();
    }
    
}
