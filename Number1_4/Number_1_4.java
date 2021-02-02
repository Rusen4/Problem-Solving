package cs300;
import java.util.Scanner;
public class Number_1_4 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();
		int count = 0;
		while(input.equals("1")==false&&input.equals("4")==false) {
			int sum = 0;
			for(int i=0; i<input.length();i++) {
				int parse = Integer.parseInt(String.valueOf(input.charAt(i)));
				sum += Math.pow(parse, 2);
			}
			input = String.valueOf(sum);
			count++;
		}
		System.out.println(input);
		System.out.println(count);
	}
}
