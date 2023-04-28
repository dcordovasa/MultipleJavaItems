package examples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorExample_Exec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Collections are ArrayList, HashSet
		ArrayList<String> food = new ArrayList<>();
		food.add("Tacos");
		food.add("Panbazos");
		food.add("Enchiladas");
		food.add("Mole");
		
		Iterator<String> it = food.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println();
		
		//Con HashSet
		HashSet<Integer> numbers = new HashSet<>();
		numbers.add(232);
		numbers.add(1);
		numbers.add(32);
		numbers.add(51);
		numbers.add(22);
		numbers.add(9567);
		numbers.add(5);
		numbers.add(777);
		numbers.add(-22);
		numbers.add(0);
		
		Iterator<Integer> it2 = numbers.iterator();
		
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
	}

}
