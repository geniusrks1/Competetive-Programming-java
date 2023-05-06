public class solution {

	public static void printKeypad(int input){
	printKeypad(input,"");
		
	}
    public static void printKeypad(int n, String s){
        // base case
        if(n==0){
            System.out.println(s);
            return;
        }
        
   String id=f(n%10);
        
        for(int i=0;i<id.length();i++){
           printKeypad(n/10,id.charAt(i)+s);
        }  
    } 


public static String f(int n){

     String id=""; switch(n){
        case 0: id="";break;
        case 1: id=""; break;
        case 2: id= "abc"; break;
        case 3: id="def";break;
        case 4: id="ghi"; break;      
        case 5: id="jkl";break;
        case 6: id="mno"; break;
        case 7: id="pqrs";break;
        case 8: id="tuv";break;
        case 9: id="wxyz";break;   
        }

return id;

}
}
