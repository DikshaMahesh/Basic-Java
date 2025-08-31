package java_practice;

public class ReverseString {

	public static void main(String[] args) {
		String input="Diksha";
		String output="";
		
		for(int i=input.length()-1; i>=0; i--) 
		{
			char a=input.charAt(i);
			output=	output+ a;
			
		}
		
System.out.println("The output is:"+ output);
	}

}
