/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linkedhashmapdemo;
import java.util.*;
/**
 *
 * @author 13307
 */
public class LinkedHashMapDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    LinkedHashMap <Integer,String> lhm=new LinkedHashMap<>(2,0.5f,true)
    {
    @Override
    protected boolean removeEldestEntry(Map.Entry e)
    {
    return size()>4;
    }
    };
    lhm.put(1, "a");
    lhm.put(2, "b");
    lhm.put(5, "e");
    lhm.put(3, "c");
    lhm.put(4, "d");
    lhm.get(5);
    lhm.get(2);
    
    lhm.forEach((k,v)->System.out.println(k+", "+v));
    
    
    }
    
}
