package cs300;
import java.util.Scanner;
public class DesignerPDFViewer {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String heightIn = scan.nextLine();
		int[] h = new int[26];
		for(int i=0; i<26; i++) {
			String[] split = heightIn.split(" ");
			int parse = Integer.parseInt(split[i]);
			h[i] = parse;
		}
		String word = scan.nextLine();
		int high = 0;
		for(int i=0; i<word.length(); i++) {
			int ascii = word.charAt(i);
			int tmp = h[ascii-97];
			if(tmp>high) {
				high = tmp;
			}
		}
		System.out.print(high*word.length());
		scan.close();
	}
}
