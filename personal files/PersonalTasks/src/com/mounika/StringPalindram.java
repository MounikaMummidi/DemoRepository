package com.mounika;

import java.util.Scanner;

public class StringPalindram {

	public static void main(String[] args){
		
		/* variable declaration*/
		
		String user_data="";
		int j=0;
		Scanner inputreader=null;
		
		/*reading input from user*/
		
		inputreader=new Scanner(System.in);
		
		System.out.println("Enter String");
		user_data=inputreader.nextLine();
		
		/*string length is calculated and assigned to variable j*/
		j=(user_data.length())-1;
		
		/* for loop to compare first and last character of the given string*/
		for(int i=0;i<=j/2;i++)
		{
			if(user_data.charAt(i)!=user_data.charAt(j))
			{
				System.out.println(user_data+" is not palindrom");
				System.exit(0);/* if condition is true loop continues*/
			}
			j--;
		} 
		System.out.println(user_data+" is palindrom");
		inputreader.close();
	}
}
