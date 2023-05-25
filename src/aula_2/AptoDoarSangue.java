package aula_2;

import java.util.Scanner;

public class AptoDoarSangue {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int idade;
		boolean primeiraDoacao;
		
		System.out.println("Digite seu nome: ");
		nome = leia.next();
		
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		
		System.out.println("É a sua primeira doação?\nResponda com true(verdadeiro) ou false(false)"); 
		primeiraDoacao = leia.nextBoolean();
		
		if (idade >= 18 && idade <= 69) {
            if (idade >= 60 && idade <= 69) {
                if (primeiraDoacao) {
                    System.out.println("O doador " + nome + " não está apto para doar sangue!");
                } else {
                    System.out.println("O doador " + nome + " está apto para doar sangue!");
                }
              } else {
                System.out.println("O doador " + nome + " está apto para doar sangue!");
            }
        } else {
            System.out.println("O doador " + nome + " não está apto para doar sangue!");
        }
	}
}