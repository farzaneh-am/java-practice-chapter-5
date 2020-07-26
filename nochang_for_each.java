package chapter5;

public class nochang_for_each {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num[] ={1,2,3,4,5,6,7,8,9,10};
for(int x:num)
{
	System.out.print(x);
	x=x*10;//why?????(farzaneh is confused)
}

	System.out.println();

	for(int x:num)
	
		System.out.print(x);
		
	}
}
