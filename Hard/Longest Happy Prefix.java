class Solution {
    public String longestPrefix(String s) {
        int n=s.length();
        int lps[]=new int[n];
        lps[0]=0;
        int i=1;
        int j=0;
        while(i<n){
          if(s.charAt(i)==s.charAt(j))
              lps[i++]=++j;
              else if( j>0)
                  j=lps[j-1]; 
                  else
                  lps[i++]=0;
              }
        
        return s.substring(0,lps[n-1]);
    }
}
