import java.util.*;
import java.io.*;
public class NumberGuessingGame{
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
		System.out.println("This is a number guessing game");
		int goal = (int) ((int) 100*Math.random()+1);
		int cont = 1;
		for(int i =0;i<9 && cont==1;i++) {
			System.out.print("Please enter your guess: ");
			int userInput = readInt();
			if (userInput==goal) {
				System.out.println("Conguadulation you won");
				System.out.println("If you want to play again please enter 1");
				cont = readInt();
				if(cont ==1) {
					i =-1;
				}
				else break;
			}
			else if(userInput < goal) {
				System.out.println(userInput+ " is too low ");
			}
			else System.out.println(userInput+" is too high");
			if(i==8 && userInput!= goal) {
				System.out.println("You have run out of attempts. The number is "+ goal);
			}
		}
		System.out.println("Thank you for playing!");
	}

	static String next () throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}
	static int readInt () throws IOException {
		return Integer.parseInt(next());
	}
}
