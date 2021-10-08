package com.company.labwork;

import java.util.Stack;

public class _Generics {
    public static void main(String[] args) {
        NewStack<Integer> intStack = new NewStack<>();
        intStack.push(2);
        intStack.push(23);
        intStack.push(4);
        intStack.push(26);
        intStack.push(73);
        intStack.push(84);


    }
}

class NewStack <T> implements Comparable<T>{

   Stack<T> stack = new Stack<>();

   public void push(T item){
       stack.push(item);
   }

   public T top(){
       return stack.peek();
   }

   public void pop(){
       stack.pop();
   }

   public int size(){
       return stack.size();
   }

    @Override
    public int compareTo(T o) {
        return 0;
    }
}
