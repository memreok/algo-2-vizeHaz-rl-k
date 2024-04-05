package denemeler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class DenemeMain {

	public static void main(String[] args) throws FileNotFoundException{

		Scanner input = new Scanner(new File("C:\\Users\\mehmetemre\\OneDrive - Bartın Üniversitesi\\Belgeler\\deneme.txt"));
		Set<String> kelimeler = new TreeSet<String>();
		kelimeler = read(input);
		for (String kelime : kelimeler) {
			System.out.println(kelime);
		}
		
		System.out.println("---------------------------");
		
		ArrayList<Integer> liste1 = new ArrayList<Integer>();
		ArrayList<Integer> liste2 = new ArrayList<Integer>();
		Collections.addAll(liste1,1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
		Collections.addAll(liste2, 1, 3, 5, 7, 9, 0);
		System.out.println(kesisimBul(liste1, liste2));
		System.out.println("--------------");
		ArrayList<String> list = new ArrayList<String>();
		list.add("the");
		list.add("quick");
		list.add("start");
		list.add("end");
		System.out.println(list);
		for (int i = list.size() ; i >= 0; i-=1) {
			if(i != 0) {
				list.add(i,"*");
				
				System.out.println(list);
			}

		}
		System.out.println(list);
		
	}
	
	public static Set<String> read(Scanner in){
		Set<String> kelimeler = new TreeSet<String>();
		
		while (in.hasNext()) {
			kelimeler.add(in.nextLine());
			
		}
		return kelimeler;
	}

		public static ArrayList<Integer> kesisimBul(ArrayList<Integer> list1, ArrayList<Integer> list2){
			ArrayList<Integer> kesisim = new ArrayList<Integer>();
			for (int i = 0; i < list1.size(); i++) {
				if (list2.contains(list1.get(i))) {
					kesisim.add(list1.get(i));
				}
			}
			
			
			
			return kesisim;
		}
	
	
}
