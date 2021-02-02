package cs300;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class NetPayment {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		String[] input = new String[size];
		scan.nextLine();
		for(int i=0 ; i<size ;i++) {
			input[i] = scan.nextLine();
		}
		ArrayList<String> free = new ArrayList<String>();
		ArrayList<String> paid = new ArrayList<String>();
		for(int i=0;i<input.length;i++) {
			String[] data = input[i].split("\\s+");
			String name = data[0];
			long amount = Long.valueOf(data[1]);
			if(amount < 1024) {
				String add = name+" Free";
				free.add(add);
			}else {
				paid.add(input[i]);
			}
		}
		scan.close();
		ArrayList<String> output = new ArrayList<String>();
		ArrayList<Integer> price = new ArrayList<Integer>();
		for(int i=0;i<paid.size();i++) {
			String[] data = paid.get(i).split("\\s+");
			String name = data[0];
			int tmpPrice = 0;
			long amount = Long.valueOf(data[1]);
			if(amount<=1024*1024) {
				tmpPrice = 100;
			}else if(amount > 1024*1024 && amount<=1024*1024*4) {
				tmpPrice = 200;
			}else if(amount > 1024*1024*4 && amount<=1024*1024*10) {
				tmpPrice = 300;
			}else if(amount > 1024*1024*10) {
				tmpPrice = 400;
			}
			price.add(tmpPrice);
			output.add(name+" "+String.valueOf(tmpPrice));
		}
		Collections.sort(free);
		for(int i=0;i<free.size();i++) {
			System.out.println(free.get(i));
		}
		Collections.sort(output); // sort name by alphabet
		Collections.sort(price); // sort price by ascending
		for(int i=0;i<price.size();i++) {
			for(int j=0;j<output.size();j++) {
				String[] data = output.get(j).split("\\s+");
				int tmpPrice = Integer.valueOf(data[1]);
				if(price.get(i) == tmpPrice) {
					System.out.println(output.get(j));
					output.remove(j);
				}
			}
		}
	}
}
