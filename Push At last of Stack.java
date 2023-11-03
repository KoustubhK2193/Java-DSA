import java.util.*;
public class Main
{
    public static void PushLast(Stack<Integer> a,int Element){
        Integer A = a.peek();
        a.pop();
        if(!a.isEmpty()){
            PushLast(a,Element);
        }
        else{
            a.push(Element);
        }
        a.push(A);
        return;
        
        
    }
	public static void main(String[] args) {
        Stack<Integer> a = new Stack<>();
        a.push(1);
        a.push(2);
        a.push(3);
        PushLast(a,65);
        while(!a.isEmpty())
        {
            System.out.println(a.peek());
            a.pop();
        }
        
	}
}
