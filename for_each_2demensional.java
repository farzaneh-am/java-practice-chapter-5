package chapter5;

import java.io.IOException;

public class for_each_2demensional {
	public static void main(String[] args) throws IOException{
	int nums[][]=new int[3][5];
	int sum=0;
	for(int i=0;i<3;i++)
		for(int j=0;j<5;j++)
		{
			nums[i][j]=(i+1)*(j+1);
		}
	for(int x[]:nums)
	{
		for(int y:x)
		{
			
			System.out.print("  "+y);
			sum+=y;
		}
		System.out.println();
	}
	System.out.println();
	System.out.println("summation matrix is "+sum);	
	}
	
}
