package cs300;
import java.util.Scanner;
public class CatsAndMouse {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		String[] input = new String[n];
		for(int i=0;i<n;i++) {
			input[i] = scan.nextLine();
		}
		scan.close();
		for(int i=0;i<n;i++) {
			String[] tmp = input[i].split("\\s+");
			int x = Integer.parseInt(tmp[0]);
			int y = Integer.parseInt(tmp[1]);
			int z = Integer.parseInt(tmp[2]);
			if((Math.abs(x-z))<(Math.abs(y-z))) {
				System.out.println("Cat A");
			}else if((Math.abs(x-z))>(Math.abs(y-z))) {
				System.out.println("Cat B");
			}else {
				System.out.println("Mouse C");
			}
		}
	}
}
