package com.search;

public class LinearExample {
	public static void main(String[] args) {
		int a[]= {5,3,6,1,4,2,1};
		String name[] = {"Somu","Nandini","Shailesh","Sachin"};
		String help="Sachin";
		
		int srch=1;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==srch)
			{
				System.out.println("Item is present at " +i+" index position");
			}
		}
	}

}
