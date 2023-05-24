package aula_1;

import java.util.Scanner;

public class CalculoSalario {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float salario;
		float abono;
		float novoSalario;
				
		System.out.println("Digite o salário: ");
		salario = leia.nextFloat();
				
		System.out.println("Digite o abono: ");
		abono = leia.nextFloat();
				
		novoSalario = salario + abono;
		
		System.out.println("O novo salario é: " + novoSalario);
	}

}