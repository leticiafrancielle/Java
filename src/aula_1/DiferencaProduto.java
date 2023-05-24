package aula_1;

import java.util.Scanner;

public class DiferencaProduto {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float numero1, numero2, numero3, numero4, calculoDiferenca;
		
		System.out.println("Digite os números: ");
		numero1 = leia.nextFloat();
		numero2 = leia.nextFloat();
		numero3 = leia.nextFloat();
		numero4 = leia.nextFloat();
		
		calculoDiferenca = (numero1 * numero2) - (numero3 * numero4);

		System.out.println("A diferença do cálculo é: " + calculoDiferenca);
	}
}