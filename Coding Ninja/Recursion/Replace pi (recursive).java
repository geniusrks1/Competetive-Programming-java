public class solution {

	// Return the changed string
	public static String replace(String input){
           if(input.length()<=1)
		   return input;
		   if(input.charAt(0)=='p' && input.charAt(1)=='i')
		   return 3.14+replace(input.substring(2));
		   else
		   return input.charAt(0)+replace(input.substring(1));


	}
}
