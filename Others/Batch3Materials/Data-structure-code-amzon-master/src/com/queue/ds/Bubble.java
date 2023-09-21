package com.queue.ds;

public class Bubble {
	//function to print array elements
	static void print(int a[])
	{
		int n = a.length;
		
		//int i;
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]+ "");
		}
	}
	//function to implment bubble sort
	static void bubbleSort(int a[]) 
	{
		int n = a.length;
		int i,j,temp;
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[j]<a[i])
				{// for swapping 
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}

	//driver method
	
	public static void main(String[] args) {
		int a[] = {35, 10, 31, 11, 26};
		Bubble b1 = new Bubble();
		System.out.println("Before Sorting...");
		b1.print(a);
		b1.bubbleSort(a);
		System.out.println();
		System.out.println("After Sorting...");
		b1.print(a);
	}
}
