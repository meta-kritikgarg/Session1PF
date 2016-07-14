
//Assignment 3
public class SequenceFinder {
	
	//method name : int[] longestSequence(int input[])

	public int[] longestSequence(int input[]) {
		

		int startIndex= 0;
		int lastIndex= 0;
		int maxSequence=0;
		
		int tmpLastIndex= 0;
		int tmpStartIndex=0;
		
		for(int current=startIndex+1;current<input.length;current++ )
		{
			
		
			if(input[current]>input[current-1])
			{
				tmpLastIndex=current;
			}
			else
			{
				tmpStartIndex=current;
				tmpLastIndex=current;
			}
			
			if(1+tmpLastIndex-tmpStartIndex>maxSequence)
			{
				startIndex= tmpStartIndex;
				lastIndex= tmpLastIndex;
				maxSequence=tmpLastIndex-tmpStartIndex+1;
				
			}
		
		}
		System.out.println(maxSequence+" "+startIndex+" "+lastIndex);
		int[] output= new int[maxSequence];
		for (int i = startIndex; i <= lastIndex; i++) {
			output[i-startIndex] = input[i];
			
		}
		return output;
	}

}
