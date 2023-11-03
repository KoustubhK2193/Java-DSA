import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    StringBuilder S = new StringBuilder("abcd");
        Stack<Character> a = new Stack<>();
        for (int i=0;i<S.length();i++){
            a.push(S.charAt(i));
        }
        StringBuilder ans = new StringBuilder();
        while(!a.isEmpty()){
            // char s = a.pop();
            ans.append(a.pop());
        }
        System.out.println(ans);
        
	}
}
