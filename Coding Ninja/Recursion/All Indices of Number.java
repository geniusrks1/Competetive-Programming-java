import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
	
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
	arr[i]=s.nextInt();
	int x=s.nextInt();

	ArrayList<Integer> list= f(arr,0,x);


for(int i:list)
System.out.print(i+" ");

	}
	public static ArrayList<Integer> f(int arr[], int start, int x){


if(start==arr.length)
return new ArrayList<>();


	
			ArrayList<Integer> smallAns=f(arr, start+1,x);
			
			if(arr[start]==x)
			smallAns.add(0,start);
			

return smallAns;
	}

}
