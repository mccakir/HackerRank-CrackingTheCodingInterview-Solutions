import java.util.*;

public class Solution {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<Integer>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
              queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
              queue.dequeue();
            } else if (operation == 3) { // print/peek
              System.out.println(queue.peek());
            }
        }
        scan.close();
    }
}

class MyQueue<T> {
    Stack <T> firstStack = new Stack<T>();
    Stack <T> secondStack = new Stack<T>();
    
    public void enqueue (T item) {
        firstStack.push(item);
    }
    
    public T dequeue (){
        if(secondStack.empty()){
            while(!firstStack.empty()){
            	secondStack.push(firstStack.pop());
            }
        }
        return secondStack.pop();
    }
    
    public T peek(){
    	if(secondStack.empty()){
            while(!firstStack.empty()){
            	secondStack.push(firstStack.pop());
            }
        }   
        return secondStack.peek();
    }
}
