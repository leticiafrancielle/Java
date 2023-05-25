package aula_2;

import java.util.Scanner;

public class VerificaImparPar {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
	
		int numero;
		
		System.out.println("Digite um número: ");
    	numero = leia.nextInt();
    	leia.close();
    	
    	if (numero %2 == 0 && numero > 0) {
    		System.out.println("O número " + numero + " é par e positivo!");
    		
    	}else if (numero %2 != 0 && numero < 0) {
    		System.out.println("O número " + numero + " é ímpar e negativo!");
    		
    	}else if (numero %2 == 0 && numero < 0) {
    		System.out.println("O número " + numero + " é par e negativo!");
    		
    	}else {
    		System.out.println("O número " + numero + " é ímpar e positivo!");
    	}

	}

}
