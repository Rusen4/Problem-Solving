package cs300;
import java.util.Scanner;
public class ShortestSeekTimeFirst {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int start = scan.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		int diff = Integer.MAX_VALUE;
		int min = 0;
		int begin = 0;
		for(int i=0; i<arr.length; i++) {
			if(Math.abs(start-arr[i])<diff) {
				diff = Math.abs(start-arr[i]);
				begin = i;
			}
		}
		min += diff;
		int itr=0,j=0;
		int check;
		while(itr < arr.length-1) {
			check = Integer.MAX_VALUE;
			j = begin;
			int beginTmp = 0;
			for(int i=0; i<arr.length; i++) {
				if(arr[i]!=-1 && begin != i) {
					if(Math.abs(arr[begin]-arr[i])<check) {
						check = Math.abs(arr[begin]-arr[i]);
						beginTmp = i;
					}
				}
			}
			begin = beginTmp;
			arr[j] = -1;
			min += check;
			itr++;
		}
		System.out.println(min);
		scan.close();
	}
}
