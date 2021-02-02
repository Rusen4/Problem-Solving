package cs300;
import java.util.Scanner;
public class SavePrisoner {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		// t denoting the number of test cases
		int t = scan.nextInt();
		scan.nextLine();
		String[] line = new String[t];
		for(int i=0; i<t ;i++) {
			line[i] = scan.nextLine();
		}
		String[] output = new String[t];
		for(int i=0; i<output.length; i++) {
			String[] split = line[i].split("\\s+");
			// n is number of prisoners
			int n = Integer.parseInt(split[0]);
			// m is number of sweets
			int m = Integer.parseInt(split[1]);
			// s is the chair number to start passing out treats at
			int s = Integer.parseInt(split[2]);
			int r = m % n;
			if((r + s -1)%n == 0) {
				output[i] = "" + n;
			}else {
				int warn = (r+s-1)%n;
					output[i] = ""+warn;
			}
		}
		for(int i=0; i<output.length; i++) {
			System.out.println(output[i]);
		}
		scan.close();
	}
}
