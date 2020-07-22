package chapter5;

import java.io.IOException;

public class search_foreach {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int num[]= {1,7,2,9,4,3,8,10,5,6};
		boolean found=false;
		int val=4;
		for(int x:num) {
			if(x==val)
			{
				found=true;
				break;
			}	
		}
			if(found)
				System.out.print("value found");
		

	}

}
