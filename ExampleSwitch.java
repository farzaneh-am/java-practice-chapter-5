package chapter5;

public class ExampleSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<6;i++)
		{
			switch (i)
			{
			case 0:
				System.out.println("i is zero.");
				break;
			case 1:
				System.out.println("i is one.");
				break;
			case 2:
				System.out.println("i is two.");
				break;
			case 3:
				System.out.println("i is three.");
				break;
			default:
					System.out.println("i greater than three.");
					break;
			}
		}

	}

}
