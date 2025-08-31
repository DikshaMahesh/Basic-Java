package java_practice;

public class ThisCallingStatemet1 {
	
	ThisCallingStatemet1()
	{
		this("Diksha");
	System.out.println(1);
	}
	ThisCallingStatemet1(int a)
	{
		
		System.out.println(2);
	}


	ThisCallingStatemet1(String a)
	{
		this(100);
		System.out.println(3);
		
	}
	public static void main(String[] args) {
		new ThisCallingStatemet1();
		
		
	
		
			
		

	}

}
