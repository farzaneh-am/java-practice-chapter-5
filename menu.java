package chapter5;

import java.io.IOException;

public class menu {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		char choice;
		do {
			System.out.println("help on: ");
			System.out.println("   1 if: ");
			System.out.println("   2 switch: ");
			System.out.println("   3 while: ");
			System.out.println("   4 do-while: ");
			System.out.println("   5 for\n: ");
			System.out.println("choice one:");
			choice=(char) System.in.read();
		}while(choice<'1'||choice>'5');
		switch(choice) {
		case '1':
			System.out.println("the if:\n");
			System.out.println("if  (condition) statement;");
			System.out.println("else statement;");
		break;
		case '2':
			System.out.println("the switch:\n");
			System.out.println("switch  (experessin) {");
			System.out.println("case constant:");
			System.out.println("   statement sequance");
			System.out.println("break;");
			System.out.println("//...");
			System.out.println("}");
		break;
		case '3':
			System.out.println("the while:\n");
			System.out.println("while  (condition) statement;");
		break;
		case '4':
			System.out.println("the do-while:\n");
			System.out.println("do {");
			System.out.println("statement;");
			System.out.println("}while(condition);");
		break;
		case '5':
			System.out.println("the for:\n");
			System.out.println("for(init;condition;iteration)");
			System.out.println("statement;");
			
		break;
		}

	}

}
