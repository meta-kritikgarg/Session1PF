import static org.junit.Assert.*;

import org.junit.Test;


public class CPUSchedulerTest {
	
	CPUScheduler cpus= new CPUScheduler();

	@Test
	public void testFCFS() {
		int[] job_ArrivalTime= {1,5,9,25};
		int[] job_size = {12,7,2,5};
		
		
		int[] job_waitTime= {0,8,11,0};
		int[] job_statTime= {1,13,20,25};
		int[] job_finishTime={12,19,21,29};
		
		
		int[][] output = cpus.FCFS(job_ArrivalTime, job_size);
		
		assertArrayEquals(job_waitTime, output[2]);	
		assertArrayEquals(job_statTime, output[3]);	
		assertArrayEquals(job_finishTime, output[4]);	
		
		
		
	}

}
