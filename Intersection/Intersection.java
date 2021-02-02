package cs300;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Intersection {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int M = scan.nextInt();
		scan.nextLine();
		int[] x = new int[M];
		String inputs = scan.nextLine();
		for(int i=0;i<M;i++) {
			String[] tmp = inputs.split("\\s+");
			int parse = Integer.parseInt(tmp[i]);
			x[i] = parse;
		}
		int N = scan.nextInt();
		int[] y = new int[N];
		scan.nextLine();
		inputs = scan.nextLine();
		scan.close();
		for(int i=0;i<N;i++) {
			String[] tmp = inputs.split("\\s+");
			int parse = Integer.parseInt(tmp[i]);
			y[i] = parse;
		}
		ArrayList<Integer> output = new ArrayList<>();
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<y.length;j++) {
				if(x[i]==y[j]) {
					output.add(x[i]);
				}
			}
		}
		Collections.sort(output);
		for(int i=0;i<output.size();i++) {
			System.out.print(output.get(i)+" ");
		}
 	}
}
