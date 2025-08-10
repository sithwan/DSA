/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Sahira
 */
import java.util.LinkedHashSet;
import java.util.SequencedSet;

public class LinkedHashSetSequencedSet {

     public LinkedHashSetSequencedSet(){
         SequencedSet<Integer>myset = new LinkedHashSet<>();
          myset.add(6);
          myset.add(3);
          myset.add(5);
          myset.add(5);
          myset.add(2);
          myset.remove(3);
         System.out.println(myset);
     }
    
    public static void main(String[] args) {
        new LinkedHashSetSequencedSet();
    }
    
}
