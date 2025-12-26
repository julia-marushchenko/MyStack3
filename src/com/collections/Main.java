/**
 * Java program with Stack realization.
 */

package com.collections;


import java.util.Arrays;

/**
 * Main class.
 */
class MyStack {

    // Defining my stack 100 places
    int arr [] = new int [12];
    int index = 0;

    public void push(int x) {
        // insert x into stack
        arr[index++] = x;
    }

    public void pop() {
        // remove top element from stack
        arr[index--] = 0;
    }

    public int peek() {
        // return top of stack
        return arr[index-1];
    }

    public int getSize() {
        // return current size of stack
        return index;
    }

    public boolean isEmpty() {
        // check whether stack is empty
        if (index == 0)
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }
}


public class Main {
    public static void main(String[] args) {

        // Creating stack
        MyStack myStack = new MyStack();

        // Checking if myStack is empty
        System.out.println(myStack.isEmpty());

        // Adding elements to myStack
        myStack.push(12);
        myStack.push(88);
        myStack.push(99);
        myStack.push(101);

        // Printing size of myStack to console
        System.out.println(myStack.getSize());

        // Printing myStack to console
        System.out.println(myStack);

        // Showing last element of myStack
        System.out.println("Last element: " + myStack.peek());

        // Printing myStack to console
        System.out.println(myStack);

        // Adding new element element:
        myStack.push(53);

        // Printing myStack to console
        System.out.println(myStack);
    }
}