package com.basicjava;
import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		//Printf("");
		//Scanf("%d", )
		//cout<<"";
		//cin>>variable
		//System.out.println("" +var);
		//Scanner() -> taking the input from the user
		Scanner read = new Scanner(System.in);
		System.out.println("Enter two numbers");
		//nextDouble() reads the next double from the keyboard
		
		double first = read.nextDouble();
		double second= read.nextDouble();
		System.out.println("Enter an operator(+,-,*,/):");
		char operator = read.next().charAt(0);
		double result;
		
		//switch case for all the operations.
		switch(operator)
		{
		case '+':
			result=first+second;
			break;
		case '-':
			result=first-second;
			break;
		case '*':
			result=first*second;
			break;
		case '/':
			result=first/second;
			break;
		default:
			System.out.println("Error, operator is not correct");
			return;
		}
		//print the result of operaations
		System.out.printf("%.1f %c %.1f=%.1f",first,operator,second,result);
	}

}
