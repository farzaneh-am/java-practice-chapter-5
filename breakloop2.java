package chapter5;

public class breakloop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		while(i<100) {
			if(i==10)
				break;
			System.out.println("i is:"+i);
		i++;
	
		}
		System.out.println("loop is complete");

	}

}
