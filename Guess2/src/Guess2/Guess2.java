package Guess2;
import java.util.Scanner;
import java.util.Random;

import static java.lang.System.out;
import static java.lang.System.in;

public class Guess2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		out.println("enter an int from 1 to 10");
		int n = new Scanner(in).nextInt();
		
		int r = new Random().nextInt(10)+1;
		if (r==n) {
			out.println("you win" + "that was a very good guess");
			out.println("Random number was " + r);
			out.println("Congratulations");
			
		}
		out.println("you loose the random number was :	" + r );
	
	}

}
