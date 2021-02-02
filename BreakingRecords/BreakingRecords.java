package cs300;
import java.util.Scanner;
public class BreakingRecords {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] score = new int[size];
		scan.nextLine();
		String[] scoreInputs = scan.nextLine().split("\\s+");
		scan.close();
		for(int i=0;i<size;i++) {
			int scoreInput = Integer.valueOf(scoreInputs[i]);
			score[i] = scoreInput;
		}
		int countHigh=0,countLow=0;
		int high = score[0] , low = score[0];
		for(int i=1;i<score.length;i++) {
			if(i==1) {
				if(score[i]<high) {
					low = score[i];
					countLow++;
				}else if(score[i]>high) {
					high = score[i];
					countHigh++;
				}
			}else {
				if(score[i]>high) {
					high = score[i];
					countHigh++;
				}else if(score[i]<low) {
					low = score[i];
					countLow++;
				}
			}
		}
		System.out.print(countHigh + " " + countLow);
	}
}
