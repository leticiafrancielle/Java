package aula_5;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionSet {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		Set<Integer> setNumbers = new HashSet<Integer>();

		Integer number = Integer.valueOf(10);

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o " + (i + 1) + "º número: ");
			number = leia.nextInt();
			setNumbers.add(number);
		}

		System.out.println("Lista numbers: ");

		Iterator<Integer> isetNumbers = setNumbers.iterator();
		while (isetNumbers.hasNext()) {
			System.out.println(isetNumbers.next());
		}

		leia.close();
	}
}