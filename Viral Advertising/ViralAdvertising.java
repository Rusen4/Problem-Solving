package cs300;
import java.util.Scanner;
public class ViralAdvertising {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int day = scan.nextInt();
		scan.close();
		int likeTmp = 5/2;
		int people;
		int like = 0;
		for(int i=1;i<=day;i++) {
			people = 3*likeTmp;
			like += likeTmp;
			likeTmp = people/2;
		}
		System.out.print(like);
	}
}
