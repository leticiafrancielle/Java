package aula_5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CollectionSet2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numeroDigitado;

		Set<Integer> setNumbers = new HashSet<Integer>();

		setNumbers.add(5);
		setNumbers.add(4);
		setNumbers.add(3);
		setNumbers.add(2);
		setNumbers.add(1);
		setNumbers.add(0);
		setNumbers.add(6);
		setNumbers.add(7);
		setNumbers.add(8);
		setNumbers.add(9);

		System.out.println("Digite o número que deseja encontrar:");
		numeroDigitado = leia.nextInt();

		if (setNumbers.contains(numeroDigitado)) {
			System.out.println("O número " + numeroDigitado + " foi encontrado!");
		} else {
			System.out.println("O número " + numeroDigitado + " NÃO foi encontrado!");
		}
		leia.close();
	}
}