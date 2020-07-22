package chapter5;

import java.io.IOException;

public class findprimes_example_book {
	public static void main(String[] args) throws IOException{
	boolean isprime;
	int num=14;
	if(num<2)
		isprime=false;
	else 
		isprime=true;
	for(int i=2;i<=num/i;i++) {
	
		if (num % i == 0) {
			isprime=false;
		break;
		}

	}
if(isprime)
	System.out.println("prime");
else
	System.out.println("not prime");
}
	
}
