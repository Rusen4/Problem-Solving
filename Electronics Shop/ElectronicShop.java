package cs300;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class ElectronicShop {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String[] line1 = scan.nextLine().split("\\s+");
		int budget = Integer.parseInt(line1[0]);
		int n = Integer.parseInt(line1[1]);// n denoting amount of keyboard
		int m = Integer.parseInt(line1[2]);// m denoting amount of usb 
		int[] keyboard = new int[n];
		int[] drive = new int[m];
		String inputs = scan.nextLine();
		for(int i=0;i<keyboard.length;i++) {
			String[] split = inputs.split("\\s+");
			int parse = Integer.parseInt(split[i]);
			keyboard[i] = parse;
		}
		inputs = scan.nextLine();
		scan.close();
		for(int i=0;i<drive.length;i++) {
			String[] split = inputs.split("\\s+");
			int parse = Integer.parseInt(split[i]);
			drive[i] = parse;
		}
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<keyboard.length;i++) {
			int cost = 0;
			for(int j=0;j<drive.length;j++) {
				cost = keyboard[i] + drive[j];
				if(cost <= budget) {
					list.add(cost);
				}
			}
		}
		Collections.sort(list);
		if(list.size()==0) {
			System.out.println("-1");
		}else {
			System.out.println(list.get(list.size()-1));
		}
	}
}
