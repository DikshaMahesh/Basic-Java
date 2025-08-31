package java_practice;

import java.util.Arrays;
import java.util.Scanner;

public class Array1 {
	
	//WAP to accept the values of array using scanner class.

	public static void main(String[] args) {
		int rollno[]=new int [5];
		Scanner s1= new Scanner(System.in);
		
		for(int i =0; i<=rollno.length-1;i++)
		{
			rollno[i]= s1.nextInt();
		}
		System.out.println(Arrays.toString(rollno));
		s1.close();
	}

}
