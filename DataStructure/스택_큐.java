package DataStructure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class 스택_큐 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        System.out.println(stack.pop());
        System.out.println(stack.peek());

        Queue<String> queue = new LinkedList<>();

        queue.add("First");
        queue.add("Second");
        System.out.println(queue.poll());
        System.out.println(queue.peek());
    }
}
