import java.util.*;

public class Solution {
    static ArrayList<ArrayList<Integer>> FindAllSubsets(int n, ArrayList<Integer> arr) {
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        Subsets(arr,0,n,new ArrayList<>(), ans);
        return ans;
    }
        public static void Subsets(ArrayList<Integer> arr, int index,int n,ArrayList<Integer> temp,  ArrayList< ArrayList<Integer>> ans){
// Base Condition
if (index == n) {
if(temp.size()>0)
 ans.add(temp);
return;
}

ArrayList<Integer> temp1=new ArrayList<>(temp); // make copy
temp1.add(arr.get(index)); // include ith element into copy list

Subsets(arr,index+1,n,temp,ans); // Not Including Value which is at Index
Subsets(arr,index+1,n,temp1,ans); // Including Value which is at Index
    }

}
