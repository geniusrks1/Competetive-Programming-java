
class Solution {
int n;
List<List<Integer>> ans = new ArrayList<>();

 public List<List<Integer>> permute(int[] nums) {
        n = nums.length;
        List<Integer> arr = new ArrayList<>();
        for(int i =0;i<n;i++){
            arr.add(nums[i]);
        }

        f(0,arr);
        return ans;
    }



    public void f(int index,List<Integer>arr){
        if(index==n){
            ans.add(arr);
            return ;
        }
        for(int i =index;i<n;i++){
            Collections.swap(arr,i,index);
            List<Integer> temp=new ArrayList<>(arr);
            f(index+1,temp);
        }
    }
   
}
