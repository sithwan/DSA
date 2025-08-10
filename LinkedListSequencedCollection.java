/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Sahira
 */
import java.util.LinkedList;
import java.util.SequencedCollection;

public class LinkedListSequencedCollection {

  
    public static void main(String[] args) {
       SequencedCollection<String> names = new LinkedList<>();

        
        names.addFirst("sahiru");
        names.addLast("manuja");
        names.addLast("sandith");
        names.addFirst("sedun");
        names.addFirst("sahanma");
        System.out.println("all names: " + names);

       
        System.out.println("First name: " + names.getFirst());
        System.out.println("Last name: " + names.getLast());

        names.removeFirst();
        names.removeLast();
        System.out.println("After removing first & last: " + names);

        System.out.println("names in order:");
        for (String name: names) {
            System.out.println("- " + name);
        }

        System.out.println("names in reverse order:");
        for (String name: names.reversed()) {
            System.out.println("- " + name);
        }
    
    }
    
}
