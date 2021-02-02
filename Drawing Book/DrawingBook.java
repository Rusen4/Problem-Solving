package cs300;
import java.util.Scanner;
public class DrawingBook {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		//n is number of pages in the book
		int n = scan.nextInt();
		//p is the page that teacher wants to turn to
		int p = scan.nextInt();
		System.out.print(turns(n,p));
		scan.close();
	}
	public static int turns(int pages,int toPage) {
		int totalPagesTurn = pages/2;
		int fromLeftSide = toPage/2;
		int fromRightSide = totalPagesTurn - fromLeftSide;
		int minTurns = Math.min(fromLeftSide, fromRightSide);
		return minTurns;
	}
}
