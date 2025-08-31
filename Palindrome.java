package java_practice;

public class Palindrome {

	public static void main(String[] args) {
		String input= "radar";
		String Output="";
		
		for (int i=input.length()-1;i>=0;i--)
		{
			char a= input.charAt(i);
			Output= Output+a;
		}
		System.out.println("The output is:"+Output);
		
	
	if(input.equals(Output))
	{
	System.out.println("The string is palindrome");	
	}
	else
	{
		System.out.println("The string is not Palindrome");
	}

}
}
