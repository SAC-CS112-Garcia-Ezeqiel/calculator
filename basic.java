package calc;

import java.util.Scanner;


public class basic {
	public static void main(String[] args){
	Scanner zeke = new Scanner(System.in);
	double fnum;
	double snum;
	double answer;
	System.out.println("Enter first number ");
	fnum = zeke.nextDouble();
	System.out.println("Enter second number ");
	snum = zeke.nextDouble();
	answer = fnum * snum;
	System.out.println(answer);
	}

}
