package cs300;
import java.util.Scanner;
public class FindingDory {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String in1 = scan.nextLine();
		String in2 = scan.nextLine();
		scan.close();
		String[] dory = in1.split("\\s+");
		String[] par = in2.split("\\s+");
		String ans = "";
		if(!(dory[dory.length-1].equals(par[par.length-1]))) {
			System.out.println("0");
			return;
		}
		for(int i=dory.length-1, j=par.length-1; i>=0&&j>=0; i--, j--) {
			if(dory[i].equals(par[j])) {
				ans = dory[i] + " " + ans;
			}
		}
		System.out.println(ans);
	}
}
