import java.util.*;
public class Main
{
	public static void main(String[] args) {
        Stack<Integer> a = new Stack<>();
        a.push(1);
        a.push(2);
        a.push(3);
        while(!a.isEmpty())
        {
            System.out.println(a.peek());
            a.pop();
        }
	}
}
