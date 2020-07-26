package chapter5;

public class breakloop4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outer:for(int i=0;i<3;i++) {
		
			System.out.print("pass "+i+" : ");
		for(int j=0;j<100;j++){
			if(j==10) break outer;
			System.out.print(j +" ");
		}
		System.out.println("this will not print");
		
	}
	System.out.println("  loop cpmplete.");

}
}
