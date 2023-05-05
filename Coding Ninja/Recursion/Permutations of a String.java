
import java.util.*;

public class Solution {
	public static ArrayList<String> generatePermutations(String str) {


  char array[] = str.toCharArray();
    Arrays.sort(array);
    str = new String(array);

	ArrayList<String> ans = new ArrayList<>();
        Permutations(str,0,ans);
		return ans;	
	}


public static void Permutations(String str, int index,ArrayList<String> ans){
// Base condition
if(index == str.length()){
ans.add(str);
return;
}
// recursive calls 
int n = str.length();
for(int i=index;i<n;i++){
str = swap(str,i,index);
Permutations(str,index+1,ans);

}
}


public static String swap(String a, int i, int j){
char temp;
char[] charArray = a.toCharArray();
temp = charArray[i] ;
charArray[i] = charArray[j];
charArray[j] = temp;
return String.valueOf(charArray);
}

}
