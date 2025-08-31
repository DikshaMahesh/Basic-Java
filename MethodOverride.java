package java_practice;

class Precondition
{
	void login() {
		
		System.out.println("Login with mobile no");
	}
	
}

public class MethodOverride extends Precondition
{
	
	void login() {
		super.login();
		System.out.println("Login with email id");
	}

	public static void main(String[] args) {
		
		MethodOverride m= new MethodOverride();
		m.login();

	}

}
