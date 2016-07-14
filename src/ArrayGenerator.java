//Assignment 6


public class ArrayGenerator {
	

	public int[] join(int a[], int asize, int b[], int bsize, int c[]) {
		
		int[] output = new int[asize+bsize];
		
		int pointerA=0;
		int pointerB=0;
		
		for(int i=0; i<output.length;i++)
		{
			if(a[pointerA]>=b[pointerB])
			{
				output[i]=b[pointerB];
				pointerB++;
				if(pointerB==bsize-1)
				{	i++;
					output[i]=b[pointerB];
					for (int j = pointerA; j < asize; j++) {
						output[i+1]=a[j];
						i++;
					}
				}		
				
			}
			else
			{
				
				output[i]=a[pointerA];
				pointerA++;
				if(pointerA==asize-1)
				{
					i++;
					output[i]=a[pointerA];
					for (int j = pointerB; j < bsize; j++) {
						output[i+1]=b[j];
						i++;
						
					}
					
				}
				
			}
		}
		
		return output;
	}

}
