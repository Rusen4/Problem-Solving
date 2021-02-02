package cs300;
import java.util.Scanner;
import java.util.ArrayList;
public class Key {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String[] inputs = scan.nextLine().split("\\s+");
		scan.close();
		int start = Integer.parseInt(inputs[0]);
		int end = Integer.parseInt(inputs[1]);
		ArrayList<Integer> listInput = new ArrayList<>();
		for(int i=start; i<=end; i++) {
			listInput.add(i);
		}
		ArrayList<Integer> listPrime = new ArrayList<>();
		for(int i=0; i<listInput.size(); i++) {
			if(isPrime(listInput.get(i))==false) {
				listPrime.add(listInput.get(i));
			}
		}
		if(listPrime.get(0)==1) {
			listPrime.remove(0);
		}
		System.out.printf("%d\n", listPrime.get(1)*listPrime.get(listPrime.size()-1));
		System.out.println(listPrime.size());
	}
	public static boolean isPrime(int n) {
		boolean isPrime = false;
		for(int i=2; i<=n/2; i++) {
			if(n % i ==0) {
				isPrime = true;
				break;
			}
		}
		return isPrime;
	}
}
