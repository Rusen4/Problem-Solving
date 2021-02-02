package cs300;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class SnowMonster {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String[] NE = scan.nextLine().split("\\s+");
		int n = Integer.parseInt(NE[0]);
		int hp = Integer.parseInt(NE[1]);
		int[] hero = new int[n];
		for(int i=0;i<n;i++) {
			hero[i] = scan.nextInt();
		}
		scan.close();
		int count=0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		boolean[] check = new boolean[100];
		for(int i=0;i<check.length;i++) {
			if(i % 2 ==0) {
				check[i] = true;
			}else {
				check[i] = false;
			}
		}
		for(int i=0; i<hero.length; i++) {
			for(int j=0; j<hero.length; j++) {
				if(i != j) {
					if(check[i]!=check[j]) {
						if((hero[i]+hero[j]==hp)&&((i+1) % 2 == 0)&&((j+1) % 2!=0)
							|| (hero[i]+hero[j]==hp)&&((i+1) % 2!=0)&&((j+1) % 2==0)) {
						count++;
						check[i] = true;
						check[j] = true;
						list.add(i);
						list.add(j);
						}
					}
				}
			}
		}
		Collections.sort(list);
		int[] tmp = new int[list.size()];
		for(int i=0; i<tmp.length ;i++) {
			tmp[i] = list.get(i) + 1;
		}
		System.out.println(count+"\n"+ tmp[tmp.length-1]);
		
	}
}
