package chapter5;
//for -each- break
public class for_each {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {1,2,3,4,5,6,7,8,9,10};
		int sum=0;
		for(int x:nums)
		{
			System.out.println("value is: "+x);
			sum+=x;
			if(x==5)
				break;
		}
		System.out.println("summation of first 5 elements: "+sum);

	}

}
