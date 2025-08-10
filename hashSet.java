/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Sahira
 */
import java.util.HashSet;
import java.util.Set;

public class hashSet {

    public hashSet(){
        Set<Integer>myset = new HashSet();
        myset.add(3);
        myset.add(5);
        myset.add(6);
        myset.add(3);
        myset.add(2);
        myset.remove(6);
        System.out.println(myset);
        
    }
    public static void main(String[] args) {
        new hashSet();
    }
    
}
