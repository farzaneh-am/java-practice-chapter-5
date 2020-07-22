package chapter5;

public class break_goto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean t=true;
first:{
	second:{
			third:{
			System.out.println("Befor the break.");
			if(t)
				break second;
			System.out.print("this won't execute");
			
		}
		System.out.print("this won't execute");
		}
		System.out.print("this if after second block.");
	}
		}
}
