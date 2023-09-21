package org.data.structure;

public class TestArray {

	public static void main(String[] args) {
		double myList[] = {1.7,1.9,4.6,7.9};
		//print all the array elements
		for(int i=0; i<myList.length; i++)
		{
			System.out.println(myList[i] + " ");
		}
       // sum of all the elements of the array
		double total= 0;
		for(int i=0; i<myList.length; i++)
		{
			total +=myList[i];
		}
		System.out.println("Sum is "+total);
		// Find largest element
		double max= myList[0];
		for(int i=0; i<myList.length; i++)
		{
			if(myList[i]>max) max= myList[i];
			
		}
		System.out.println("Largest Number is "+max);
		
		
		
		
		
		
		
	}
	

}
