import java.util.ArrayList;
import java.util.*;
public class Solution {

	public static ArrayList<Integer> kLargest(int n, int[] input, int k) {
	
	PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());

for(int ele:input)
pq.add(ele);

ArrayList<Integer> list =new ArrayList<>();

while(k-->0)
list.add(pq.poll());
return list;

	}
}
