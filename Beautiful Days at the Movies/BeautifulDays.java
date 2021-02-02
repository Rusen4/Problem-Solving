package cs300;
import java.util.Scanner;
public class BeautifulDays {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String[] inputs = scan.nextLine().split("\\s+");
		scan.close();
		int start = Integer.parseInt(inputs[0]);
		int end = Integer.parseInt(inputs[1]);
		int divisor = Integer.parseInt(inputs[2]);
		int count = 0;
		for(int i=start; i<=end ;i++) {
			if((Math.abs(i-reverse(i))) % divisor==0) {
				count++;
			}
		}
		System.out.print(count);
	}
	public static int reverse(int n) {
		int reverse = 0;
		while(n!=0) {
			reverse = reverse * 10;
			reverse = reverse + n % 10;
			n /= 10;
		}
		return reverse;
	}
}
