/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package data.structures;

/**
 *
 * @author Sahira
 */
public class arraystack {
    int[] stack = new int[5];  // fixed size
    int top = -1;

    // Push method
    void push(int value) {
        if (top == 4) {
            System.out.println("Stack is full!");
        } else {
            top++;
            stack[top] = value;
            System.out.println("Pushed: " + value);
        }
    }

    // Pop method
    int pop() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return -1;
        } else {
            int value = stack[top];
            top--;
            System.out.println("Popped: " + value);
            return value;
        }
    }

    // Show stack
    void show() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        arraystack s = new arraystack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.show();
        s.pop();
        s.show();
    }
}
 
    

