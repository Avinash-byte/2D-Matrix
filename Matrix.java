package JavaHandsOn;

import java.util.Scanner;

public class Matrix {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Enter the value of n in n:n matrix:");
		int n=sc.nextInt();
		int arr[][]=new int[n][n];
		System.out.println("Enter elements of n:n matrix:");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
			arr[i][j]=sc.nextInt();	
			}
		}
		
		System.out.println("Given input matrix is:");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
			System.out.print(arr[i][j]+" ");	
			}
			System.out.println();
		}
		
		System.out.println();
		while(true)
		{
			System.out.println("Press 1 to swap diagonals");
			System.out.println("Press 2 to display largest element of each row");
			System.out.println("Press 3 to display sum of elements of each row and show largest sum among them");
			System.out.println("Press 4 to exit");
			System.out.println();
			System.out.println("Enter an Option:");
			int in=sc.nextInt();
			switch(in)
			{
			case 1:
				swapdiagonals(arr);
				System.out.println();
				break;
			case 2:
				sortElementInEachRow(arr);
				displayLargestElementInEachRow(arr);
				System.out.println();
				break;
			case 3:
				int a[]=getSumForEachRow(arr);
				toSortSumOfEachRow(a);
				for(int i=0;i<a.length;i++)
				{
					System.out.println("sum in "+(i+1)+" row: "+a[i]);
				}
				System.out.println("Largest sum among them: "+a[0]);
				System.out.println();
				break;
			case 4:
				System.exit(0);
				break;
			default:
				System.out.println("Please press valid option");
				break;
			}
		}

	}


	private static void toSortSumOfEachRow(int[] a) {
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
	}


	private static int[] getSumForEachRow(int[][] arr) {
		int oneDArray[]=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			
			int sum=0;
			for(int j=0;j<arr.length;j++)
			{
				sum=sum+arr[i][j];
			}
			oneDArray[i]=sum;
		}
		return oneDArray;
	}


	private static void displayLargestElementInEachRow(int[][] arr) {
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			
			System.out.println("Largest Elements in "+(i+1)+" Row is:"+arr[i][j]);
		}
		
	}


	private static void sortElementInEachRow(int[][] arr) {
		for(int i=0;i<arr.length;i++)
		{
			int temp=0;
			for(int j=0;j<arr.length;j++)
			{
				for(int k=j+1;k<arr.length;k++)
				{
					if(arr[i][j]<arr[i][k])
					{
						int temp2=arr[i][j];
						arr[i][j]=arr[i][k];
						arr[i][k]=temp2;
					}
				}
				
			}
			
		}
			
	}


	private static void swapdiagonals(int[][] arr) {
		System.out.println("After swapping the diagonals, matrix is:");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=arr.length-1;j>=0;j--)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
