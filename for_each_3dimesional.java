package chapter5;

public class for_each_3dimesional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[][][]=new int [2][4][3];
		int sum=0;
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<4;j++)
			{
				for(int k=0;k<3;k++)
				{
					nums[i][j][k]=(i+1)*(j+2)*(k+1);
				}
					
			}
		}
		for(int x[][]:nums)
		{
			for(int y[]:x)
			{
				for(int z:y) 
				{
					System.out.println("value is"+z);
					sum+=z;
				}
			}
		}
		System.out.println();
		System.out.println("summation is:"+sum);

	}

}
