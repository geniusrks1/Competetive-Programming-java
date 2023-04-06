import java.util.*;
public class Solution {

	public static ArrayList<Integer> primeNumbersTillN(int n){ 
	  boolean arr[]=new boolean[n+1];
	  ArrayList<Integer> list=new ArrayList<>();
   for(int i=2;i*i<=n;i++){
    if(!arr[i]){
        for(int j=i*i;j<=n;j+=i)
        arr[j]=true;
    }
}


for(int i=2;i<=n;i++){
	if(!arr[i])
	list.add(i);
}
return list;
	}
}
