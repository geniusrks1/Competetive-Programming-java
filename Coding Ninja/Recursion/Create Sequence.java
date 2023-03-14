import java.util.ArrayList;
import java.util.*;
public class Solution{
    public static ArrayList<Long> createSequence(long n){
     ArrayList<Long> ans=new ArrayList<>();
     helper(0,n,ans);
     Collections.sort(ans);
     ans.remove(0);
     return ans;
    
    }
    public static void helper(long start,long n ,ArrayList<Long> ans){
        if(start<=n)
        ans.add(start);


long x=10*start+2;
long y=10*start+5;
if(x<=n)
helper(x, n, ans);
if(y<=n)
helper(y, n, ans);

    }
}
