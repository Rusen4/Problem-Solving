package cs300;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class SetOperations {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> listInput = new ArrayList<>();
		int input;
		do {
			input = scan.nextInt();
			listInput.add(input);
		}while(input!=101&&input!=102&&input!=103);
		scan.close();
		int choice = listInput.get(listInput.size()-1);
		ArrayList<Integer> listA = new ArrayList<>();
		for(int i=0;i<listInput.size();i++) {
			if(listInput.get(i)==-1) {
				listInput.remove(i);
				break;
			}else {
				listA.add(listInput.get(i));
			}
		}
		ArrayList<Integer> listB = new ArrayList<>();
		for(int i=listA.size();i<listInput.size();i++) {
			if(listInput.get(i)==-1) {
				listInput.remove(i);
				break;
			}else {
				listB.add(listInput.get(i));
			}
		}
		Collections.sort(listA);
		Collections.sort(listB);
		if(choice==101) {
			for(int i=0; i<listB.size();i++) {
				listA.add(listB.get(i));
			}
			Collections.sort(listA);
			for(int i=0;i<listA.size();i++) {
				if(i==listA.size()-1) {
					System.out.println(listA.get(i));
					
				}else {
					if(listA.get(i)==listA.get(i+1)) {
						continue;
					}else {
						System.out.println(listA.get(i));
					}
				}
			}
		}else if(choice==102) {
			ArrayList<Integer> intersect = new ArrayList<>();
			for(int i=0;i<listA.size();i++) {
				for(int j=0;j<listB.size();j++) {
					if(listA.get(i)==listB.get(j)) {
						intersect.add(listA.get(i));
					}
				}
			}
			Collections.sort(intersect);
			if(intersect.size()==0) {
				System.out.print("0");
			}
			for(int i=0;i<intersect.size();i++) {
				if(i==intersect.size()-1) {
					System.out.println(intersect.get(i));
					
				}else {
					if(intersect.get(i)==intersect.get(i+1)) {
						continue;
					}else {
						System.out.println(intersect.get(i));
					}
				}
			}
		}else if(choice==103) {
			ArrayList<Integer> diff = new ArrayList<>();
			for(int i=0; i<listA.size(); i++) {
				for(int j=0; j<listB.size(); j++) {
					if(listA.get(i)!=listB.get(j)) {
						diff.add(listA.get(i));
					}
				}
			}
			for(int i=0;i<diff.size();i++) {
				if(i==diff.size()-1) {
					System.out.println(diff.get(i));
				}else {
					if(diff.get(i)==diff.get(i+1)) {
						continue;
					}else {
						System.out.println(diff.get(i));
					}
				}
			}
		}
	}
}
