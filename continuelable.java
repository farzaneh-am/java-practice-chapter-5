package chapter5;

public class continuelable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outer:for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++) {
				if(i<j)
				{
					System.out.println();
					continue outer;
	
				}
			System.out.print(" "+i*j);
		}
			}
			System.out.println();

	}

}
