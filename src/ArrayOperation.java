import java.util.Scanner;

//Assignment 2
public class ArrayOperation {
	
	
	public static void main(String arg[]) {
		ArrayOperation arrayop = new ArrayOperation();
		int[] a;
		a=arrayop.getIntArrayfromUser(" Array");
		
		int[] c ;
		c=arrayop.removeDuplicate(a);
		
		System.out.println("Final Output");
		for (int i : c) {
			System.out.println(i);
		}
		
		return;
	}
	

	/**
	 * Method to remove duplicate elements from array
	 * @param input int[] array
	 * @return int[] output array
	 */
	public int[] removeDuplicate(int input[]) {
		
		
		for (int current = 0; current < input.length; current++) {	
			for (int i = current+1; i < input.length; i++) {
				if(input[current]==input[i])
				{
					input=removeElement(input, i);
					i--;
				}
			}
		}
		//Creating final output 
		int[] output = new int[input.length];
		for (int i = 0; i < output.length; i++) {
			output[i]=input[i];
		}
		return output;
	}
	

	/**
	 * Method to remove an element from input int array
	 * @param input int[] array
	 * @param index int index of element to remove
	 * @return int[] array of int
	 */
	public int[] removeElement(int[] input,int index)
	{		
		for(int shiftCounter=index;shiftCounter<input.length-1;shiftCounter++)
		{
			input[shiftCounter]=input[shiftCounter+1];
		}
		
		int[] output= new int[input.length-1];
		
		for (int i = 0; i < output.length; i++) {
			 output[i]=input[i];
			//System.out.println(output[i]);
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

		return array;
	}
	
}
