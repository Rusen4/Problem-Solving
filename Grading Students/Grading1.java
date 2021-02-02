package cs300;
import java.util.Scanner;
import java.util.ArrayList;
public class Grading1 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String>input = new ArrayList<>();
		String s = "";
		do {
			s  = scan.nextLine();
			if(!s.equals("-99")) {
				input.add(s);
			}
		}while(!s.equals("-99"));
		scan.close();
		int[] list = new int[input.size()];
		for(int i=0;i<list.length;i++) {
			list[i] = Integer.parseInt(input.get(i));
		}
		int count = 0;
		for(int i=0;i<list.length;i++) {
			if(list[i]>=38&&list[i]%5>=3&&list[i]<=100) {
				list[i] = list[i] + (5-(list[i]%5));
				count++;
			}else if(list[i]<0||list[i]>100){
				list[i] = -1;
			}
		}
		for(int i=0;i<list.length;i++) {
			System.out.println(list[i]);
		}
		System.out.println(count);
	}
}
