package cs300;
import java.util.Scanner;
public class Histogram {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		scan.close();
		int[] list = new int[10];
		for(int i=0; i<20; i++) {
			int tmp = scan.nextInt();
			switch(tmp) {
			case 0 : list[0]++; break;
			case 1 : list[1]++; break;
			case 2 : list[2]++; break;
			case 3 : list[3]++; break;
			case 4 : list[4]++; break;
			case 5 : list[5]++; break;
			case 6 : list[6]++; break;
			case 7 : list[7]++; break;
			case 8 : list[8]++; break;
			case 9 : list[9]++; break;
			} 
		}
		for(int i=0; i<list.length; i++) {
			System.out.println(list[i]);
		}
		
	}
}
