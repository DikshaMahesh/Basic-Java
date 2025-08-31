package java_practice;

import java.util.Arrays;
import java.util.Scanner;

public class Array3 {
	//WAP to copy one array into another array using scanner class using scanner class.

	public static void main(String[] args) {

		Scanner s1= new Scanner(System.in);
		System.out.println("Please enter the size of an array:-");
		int rollno[]=new int[s1.nextInt()];
		
		for(int i=0; i<=rollno.length-1;i++)
		{
			System.out.println("Please enter the value at index position:"+i);
			rollno[i]= s1.nextInt();
		}
		System.out.println("The input array is:-"+ Arrays.toString(rollno));
		s1.close();
		
		int rollno1[]= new int [rollno.length];
		for(int j=0;j<=rollno.length-1; j++) 
		{
			rollno1[j]=rollno[j];
		}
		
		System.out.println("This is your copied array:"+ Arrays.toString(rollno1));
		s1.close();
	}

}
