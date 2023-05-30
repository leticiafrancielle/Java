package aula_5;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class CollectionList {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		ArrayList<String> colors = new ArrayList<>();
		String color;

		for (int i = 0; i < 5; i++) {
			System.out.println("Digite a " + (i + 1) + "º cor: ");
			color = leia.next();
			colors.add(color);
		}
		
		System.out.println("\nCores adicionadas: ");
		for (String cor : colors) {
			System.out.println(cor);
		}

		Collections.sort(colors);
		
		System.out.println("\nCores ordenadas: ");
		for (String cor : colors) {
			System.out.println(cor);
		}
		
		leia.close();
	}
}