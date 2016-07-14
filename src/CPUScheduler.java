//Assignment4

public class CPUScheduler {
	
	public int[][] sort2DArray(int[][] input,int column) {
		
	
		
		
		return input;
	}

	
	// int [][]FCFS( int arrival_time [], int job_size[] ) 
	
	public int[][] FCFS(int arrival_time[], int job_size[]) {
		
		/*
		 * output[0][]= Job No
		 * output[1][]= Job Arrival Time
		 * output[2][]= Job Wait time
		 * output[3][]= Job Start At
		 * output[4][]= Job finished at
		 */
		int noOfjobs=job_size.length;
		int output[][] = new int[5][job_size.length];
		
		output[0][0]=1;
		output[1][0]=1;
		output[2][0]=0;
		output[3][0]=1;
		output[4][0]=job_size[0];
		
		for(int i=1;i<noOfjobs;i++)
		{
			output[0][i]=i+1;
			
			output[1][i]=arrival_time[i];
			
			/*Wait_time=0; 
			 * if(1+LastJobFinishTime- ArrivalTime+1>0)
			 * waitTime=
			 */
			output[2][i]=0;
			if(1+(output[4][i-1]-output[1][i])>0)
				output[2][i]=1+(output[4][i-1]-output[1][i]);
			
			System.out.print(output[2][i]);
			/*
			 * Job Started= arrival_time+wait_time
			 */
			output[3][i]=output[1][i]+output[2][i];
			
			System.out.print(output[3][i]);
			
			/*
			 * Job Finished = LastJobFinishTime+ JobSize
			 */
			output[4][i]= (output[3][i]+job_size[i])-1;
			
		}
		
		

		
		return output;
	}
	
}
