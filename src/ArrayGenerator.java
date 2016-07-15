import java.io.BufferedReader;
import java.util.Scanner;

//Assignment 6

public class ArrayGenerator {

	
	public static void main(String arg[]) {
		ArrayGenerator arraygen = new ArrayGenerator();
		int[] a;
		a=arraygen.getIntArrayfromUser("Sorted Array A");
		
		int[] b;
		b=arraygen.getIntArrayfromUser("Sorted Array B");
			
		int[] c = new int[a.length+b.length];
		c=arraygen.joint(a, a.length, b, b.length);
		
		for (int i : c) {
			System.out.println(i);
		}
		return;
	}
	
	
	/**
	 * Returns sorted join array
	 * @param a int[] sorted array a
	 * @param asize int size of array a
	 * @param b int[] sorted array b
	 * @param bsize int size of array b
	 * @return sorted join array
	 */
	public int[] joint(int a[], int asize, int b[], int bsize) {
		
		int[] output = new int[asize+bsize];
		
		int ptrA=0;
		int ptrB=0;
		
		for(int i=0; i<output.length;i++)
		{
			if(a[ptrA]>=b[ptrB])
			{
				//Insert small or equal element into output array
				output[i]=b[ptrB];
				ptrB++;
				//No more element in array B
				if(ptrB==bsize-1)
				{	i++;
					output[i]=b[ptrB];
					//for Moving all the elements of array A into output array
					for (int j = ptrA; j < asize; j++) 
					{
						output[i+1]=a[j];
						i++;
					}
				}			
			}
			else
			{
				//Insert small element into output array
				output[i]=a[ptrA];
				ptrA++;
				if(ptrA==asize-1)
				{
					i++;
					output[i]=a[ptrA];
					//for Moving all the elements of array B into output array 
					for (int j = ptrB; j < bsize; j++) 
					{
						output[i+1]=b[j];
						i++;	
					}
				}
			}
		}
		
		return output;
	}
	
	
	/**
	 * Method to read array data from standard input
	 * @param arrayName String Name of array for message
	 * @return int[] array of integer
	 */
	public int[] getIntArrayfromUser(String arrayName) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter number of elements for "+arrayName);
		int number=s.nextInt();
		int[] array= new int[number];
		
		System.out.println("Enter elements for "+arrayName);
		//For reading Array
		for(int i=0;i<number;i++)
		{
			array[i]=s.nextInt();
		}
		
		System.out.println("Successfully done");
		return array;
	}
	
}

