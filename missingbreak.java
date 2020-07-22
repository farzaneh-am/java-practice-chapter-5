package chapter5;

public class missingbreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month=9;
		String reson;
		switch(month) {
		case 1:
		case 2:
		case 3:
			reson="spring";
			break;
		case 4:
		case 5:
		case 6:
			reson="summer";
			break;
		case 7:
		case 8:
		case 9:
			reson="autumn";
			break;
		case 10:
		case 11:
		case 12:
			reson="winter";
			break;
		default:
			reson="not valid";
		}
			System.out.println("reson is "+reson);
		}
		

	}


