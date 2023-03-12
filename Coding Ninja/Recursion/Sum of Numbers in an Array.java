public class Solution {

	public static int sum(int input[]) {
	

	return f(input, input.length);	
	}
	public static int f(int input[], int n){

if(n==0)
return 0;

		return input[n-1]+f(input,n-1);
	}
}
