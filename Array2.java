package java_practice;

import java.util.Arrays;
import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter the size of an  Array");
		 int rollno[]=new int [s1.nextInt()];
		
		for(int i=0; i<=rollno.length-1; i++) 
		{
			System.out.println("Please enter the number"+i);
			rollno[i]=s1.nextInt();
		}
		System.out.println(Arrays.toString(rollno));
		s1.close();
	}

}
