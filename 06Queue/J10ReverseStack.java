import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class J10ReverseStack {
  
        public static void main(String[] args)
        {
            Queue<Integer> queue = new LinkedList<>();
            Stack<Integer> stack = new Stack<>();
    
            queue.offer(10);
            queue.offer(20);
            queue.offer(30);
            queue.offer(40);
            queue.offer(50);
            queue.offer(60);
            queue.offer(70);
            queue.offer(80);
            queue.offer(90);
            queue.offer(100);
    
            System.out.println("Queue Before Reversal : " + queue);
    
            // Reverse the queue using a stack
            while(!queue.isEmpty())
            {
                stack.push(queue.poll());
            }
    
            while(!stack.isEmpty())
            {
                queue.offer(stack.pop());
            }
    
            System.out.println("Queue After Reversal : " + queue);
        }
    }

    

