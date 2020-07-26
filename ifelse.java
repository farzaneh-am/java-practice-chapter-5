package chapter5;

public class ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month=4;
		String reson;
		if(month==1||month==2||month==3) 
		reson="Spring";
		
		else if(month==4||month==5||month==6) 
			reson="Summer";
		else if(month==7||month==8||month==9)
			reson="Autumn";
		else if(month==10||month==11||month==12)
			reson="Winter";
		else
			reson="not valid";
		System.out.println("mordad is in the "+reson);
		
		}

	}


