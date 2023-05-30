package aula_5;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionList2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numeroDigitado;

		ArrayList<Integer> numbers = new ArrayList<>();

		numbers.add(9);
		numbers.add(8);
		numbers.add(7);
		numbers.add(6);
		numbers.add(5);
		numbers.add(4);
		numbers.add(3);
		numbers.add(2);
		numbers.add(1);
		numbers.add(0);

		System.out.println("Digite o número que deseja encontrar:");
		numeroDigitado = leia.nextInt();

		Integer indice = numbers.indexOf(numeroDigitado);

		if (indice >= 0) {
			System.out.println("O número " + numeroDigitado + " está na posição " + indice);
		} else {
			System.out.println("O número " + numeroDigitado + " não foi encontrado!");
		}
		leia.close();
	}
}