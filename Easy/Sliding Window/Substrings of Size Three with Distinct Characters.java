class Solution {
    public int countGoodSubstrings(String s) {
        int n=s.length();
        if(n<3)
        return 0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<3;i++){
            char ch= s.charAt(i);
            if(map.containsKey(ch))
             map.put(ch,map.get(ch)+1);
             else
             map.put(ch,1);
        }
        int count=0;
        if(map.size()==3)
         count++;

         if(n==3)
         return count;

for(int i=0;i<n-3;i++){
    char ch1=s.charAt(i);
    if(map.get(ch1)==1)
        map.remove(ch1);
    else 
         map.put(ch1,map.get(ch1)-1);   
  
char ch2=s.charAt(i+3);
if(map.containsKey(ch2)){
    map.put(ch2,map.get(ch2)+1);
}
else if(!map.containsKey(ch2) && map.size()==2){
    map.put(ch2,1);
    count++;
}
 else 
   map.put(ch2,1);
}


return count;
    }
}
