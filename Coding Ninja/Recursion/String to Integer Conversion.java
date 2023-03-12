public class solution {

	public static int convertStringToInt(String input){
		if(input.length()==0)
		return 0;
	
return convertStringToInt(input.substring(0,input.length()-1))  *10 + input.charAt(input.length()-1)-'0';

	}
}
