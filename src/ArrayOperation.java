//Assignment 2
public class ArrayOperation {

	public int[] removeDuplicate(int input[]) {
		
		
		for (int current = 0; current < input.length; current++) {
			
			for (int travel = current+1; travel < input.length; travel++) {
				
				if(input[current]==input[travel])
				{
					input=removeElement(input, travel);
					travel--;
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
	
	/**Method to remove index element from input[] */
	
	public int[] removeElement(int[] input,int index)
	{
		
		for(int shiftCounter=index;shiftCounter<input.length-1;shiftCounter++)
		{
			input[shiftCounter]=input[shiftCounter+1];
			
		}
		
		int[] output= new int[input.length-1];
		
		for (int i = 0; i < output.length; i++) {
			 output[i]=input[i];
			System.out.println(output[i]);
		}
		
		return output;
		
	}
	
}
