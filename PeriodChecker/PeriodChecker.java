package cs300;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class PeriodChecker {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String[] NM = scan.nextLine().split("\\s+");
		// n is amount of employee
		int n = Integer.parseInt(NM[0]);
		int round = Integer.parseInt(NM[1]);
		String[] inputPeriod = new String[round];
		for(int i=0; i<inputPeriod.length; i++) {
			inputPeriod[i] = scan.nextLine();
		}
		String[] output = new String[n];
		for(int i=0; i<output.length; i++) {
			ArrayList<Integer> periodCheck = new ArrayList<>();
			int[] list = new int[round];
			for(int j=0; j<inputPeriod.length; j++) {
				String[] split = inputPeriod[j].split("\\s+");
				int parse = Integer.parseInt(split[i]);
				list[j] = parse;
			}
			for(int c=0; c<list.length; c++) {
				int diff;
				if(c!=list.length-1) {
					diff = list[c+1] - list[c];
					periodCheck.add(diff);
				}
			}
			Collections.sort(periodCheck);
			if(periodCheck.get(0)==periodCheck.get(periodCheck.size()-1)) {
				output[i] = "1" + " " + periodCheck.get(periodCheck.size()-1);
			}else {
				output[i] = "0" + " " + periodCheck.get(periodCheck.size()-1);
			}
		}
		for(int i=0; i<output.length; i++) {
			System.out.println(output[i]);
		}
		scan.close();
 	}
}
