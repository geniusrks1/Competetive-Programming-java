import java.util.ArrayList;
import java.util.Stack;
import java.util.*;
public class solution {
	public static ArrayList<Integer> nextGreaterElement(ArrayList<Integer> input) {
		Stack<Integer> st=new Stack<>();
		int n=input.size();
		ArrayList<Integer> list=new ArrayList<>(Collections.nCopies(n, -1));
	
		for(int i=n-1;i>=0;i--){

       while(!st.isEmpty() && st.peek()<=input.get(i))
                  st.pop();

	      if(!st.isEmpty())
		 list.set(i,st.peek());

		 st.push(input.get(i));
		}		
    
return list;
	}
}
