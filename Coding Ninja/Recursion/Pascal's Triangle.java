import java.util.* ;
import java.io.*; 
import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static ArrayList<ArrayList<Long>> printPascal(int n) {

if(n==0)
	 return new ArrayList<>();

  ArrayList<ArrayList<Long>> smallAns=printPascal(n-1);
  ArrayList<Long> lrow=new ArrayList<>();



for(int i=0;i<n;i++){
	if(i==0|| i==n-1)
	lrow.add((long)1);
	else
	lrow.add(smallAns.get(n-2).get(i-1)+smallAns.get(n-2).get(i));
}
	  
smallAns.add(lrow);
return smallAns;
	    
	}
}
