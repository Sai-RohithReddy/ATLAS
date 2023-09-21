package org.data.structure;

public class Calculator {
	//default
//	int add()
//	{ int a=10, b=20,c=a+b;
//	System.out.println(c);
//		return c;
//		
//	}
	int add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
		return c;
	}

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.add(20,40);
			}
	

}
