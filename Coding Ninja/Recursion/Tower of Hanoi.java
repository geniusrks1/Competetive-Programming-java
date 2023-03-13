import java.util.ArrayList;

public class Solution 
{
    public static ArrayList < ArrayList<Integer>> towerOfHanoi(int n) 
    {
    ArrayList<ArrayList<Integer>> list=new ArrayList<>();
    f(n,1,2,3,list);
    return list;
    }
    public static void f(int n, int source, int auxilary, int destination ,ArrayList<ArrayList<Integer>> list){
        if(n==0)
        return;

 f(n-1,source,destination,auxilary,list);

ArrayList<Integer> ans=new ArrayList<>();
ans.add(source);
ans.add(destination);
list.add(ans);

f(n-1,auxilary,source,destination,list);
    }
}
