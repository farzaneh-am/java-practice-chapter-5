package chapter5;

public class breakloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<100;i++)
		{
			if(i==10)
				break;
			System.out.println("i is:"+i);
		}
		System.out.println("loop is complete.");

	}

}
