
public class CheckArraySequence {
	
	public int checkSequence(int[] input) {
		boolean ascending = true;
		boolean descending = true;
		
		for(int i=1; i<input.length;i++)
		{
			if(input[i]>input[i-1])
			{
				descending=false;
			}
			if(input[i]<input[i-1])
			{
				ascending=false;
			}
			
		}
		int output = 0;
		if(descending==false&&ascending==false)
			output=0;
		if(ascending)
			output=1;
		if(descending)
			output=2;
		
		return output;
		
	}

}
