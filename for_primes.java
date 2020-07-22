package chapter5;

import java.io.IOException;

public class for_primes {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int num,x,count=0;
System.out.println("Enter a number:");
		num=System.in.read();
		for(int i=1;i<=num;i++)
		{
			
		
			
			if((i%2)==0)
				count++;
		}
			if(count==2)
				System.out.println("number is primes");
			else
				System.out.println("no primes");
				
		}

	}


