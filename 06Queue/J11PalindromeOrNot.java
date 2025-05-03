import java.util.LinkedList;
import java.util.Queue;
public class J11PalindromeOrNot {
	public static void main(String[] args)
	{
		Queue<Character> queue = new LinkedList<>();

		// Adding elements to the queue
		queue.add('r');
		queue.add('a');
		queue.add('d');
		queue.add('a');
		queue.add('r');

		// Checking if the queue is palindrome
		boolean isPalindrome = true;

		Queue<Character> reverseQueue = new LinkedList<>(queue);
		while (!queue.isEmpty())
		{
			char c1 = queue.remove();
			char c2 = reverseQueue.remove();
			if (c1 != c2)
			{
				isPalindrome = false;
				break;
			}
		}

		if (isPalindrome)
		{
			System.out.println("The Queue is a Palindrome");
		}
		else
		{
			System.out.println("The Queue is not a Palindrome");
		}
	}
}

    
