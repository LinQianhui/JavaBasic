/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package animation;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author 13307
 */
class MyFrame extends Frame implements Runnable
{
    int x,y,tx,ty;
    public MyFrame()
    {
        super("BOUNCING");
        x=100;y=120;tx=ty=1;
    Thread th=new Thread(this);
    th.start();
    }
    @Override
    public void paint(Graphics g)
    {
    g.setColor(Color.PINK);
    g.fillOval(x, y, 50, 50);
    }

    @Override
    public void run() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    while(true)
    {
    x=x+tx;
    y=y+ty;
    if(x<=0||x>=450)
        tx=tx*-1;
    if(y<=30||y>=400)
        ty=ty*-1;
    repaint();
    try{Thread.sleep(6);}catch(Exception e){}
    }
    }
}

public class Animation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    MyFrame mf=new MyFrame();
    mf.setSize(500, 450);
    mf.setVisible(true);
    }
    
}
