/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Sahira
 */
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueQueue {

   
    public static void main(String[] args) {
       Queue<Integer>pqueue = new PriorityQueue<>();
       
         pqueue.add(20);
         pqueue.add(30);
         pqueue.add(40);
         pqueue.add(10);
         pqueue.add(50);
         pqueue.add(20);
         
        System.out.println(pqueue);
        
      int size = pqueue.size();
      for(int i = 0;i<size;i++)
         System.out.println(pqueue.poll());

    }
    
}
