class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1=s1.length();
        int n2=s2.length();
        if(n1>n2)
        return false;
        HashMap<Character, Integer> map1=new HashMap<>();
        HashMap<Character, Integer> map2=new HashMap<>();
        for(int i=0;i<n1;i++){
            char ch1=s1.charAt(i);
            char ch2=s2.charAt(i);

if(map1.containsKey(ch1))
map1.put(ch1,map1.get(ch1)+1);
else
map1.put(ch1,1);

if(map2.containsKey(ch2))
map2.put(ch2,map2.get(ch2)+1);
else
map2.put(ch2,1);
        }

        if(map1.equals(map2))
        return true;

for(int i=0;i<n2-n1;i++){
    char ch1=s2.charAt(i);
if( map2.containsKey(ch1) && map2.get(ch1)==1)
map2.remove(ch1);
else if(map2.containsKey(ch1) && map2.get(ch1)>1)
map2.put(ch1,map2.get(ch1)-1);

char ch2=s2.charAt(i+n1);
if(map2.containsKey(ch2))
map2.put(ch2,map2.get(ch2) +1);
else
map2.put(ch2,1);

if(map1.equals(map2))
return true;
}

return false;
        
    }
}
