//Assignment 1
public class BaseConversion {

	
	
	public int convertBinaryToOctal(int n) {
		
		int octalValue=0;
		int digits[]=new int[12];

		
		//To separate digits of n 
		for(int noOfDigits=0;n>0;noOfDigits++)
		{
			digits[noOfDigits] = n%10;
			n=n/10;
		}

		
		//Creating set of three three
		int unitValue=1;
		for(int counter=0;counter<digits.length;counter=counter+3)
		{	
			//Converting a set of three into decimal
			int tmp=digits[counter]+digits[counter+1]*2+digits[counter+2]*4;
			octalValue=octalValue+tmp*unitValue;
			unitValue=unitValue*10;
		}
		
		return octalValue;
	}
	
}
