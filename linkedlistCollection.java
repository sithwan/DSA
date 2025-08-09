/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Sahira
 */
   import java.util.LinkedList;
public class linkedlistCollection {

   
    public static void main(String[] args) {

        LinkedList<String> fruits = new LinkedList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("rabutan");
        fruits.add("mangus");

 System.out.println(" LinkedList: " + fruits);

    
        fruits.addFirst("Pineapple");
        fruits.addLast("Grapes");

 System.out.println("After adding first and last: " + fruits);

     
        fruits.remove("Banana");          
        fruits.remove(2);                 
        fruits.removeFirst();             
        fruits.removeLast();              

 System.out.println("After removals: " + fruits);

        
        String first = fruits.getFirst();
        String last = fruits.getLast();
        String second = fruits.get(1);

 System.out.println("First: " + first);
 System.out.println("Second: " + second);
 System.out.println("Last: " + last);

      
 System.out.println("Size of list: " + fruits.size());

        
 

        
 System.out.println("All fruits in list:");
        for (String fruit : fruits) {
            System.out.println("- " + fruit);
        }

        
        fruits.clear();
        System.out.println("After clearing: " + fruits);
    }
}


    
    

