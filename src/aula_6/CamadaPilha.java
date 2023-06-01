package aula_6;

import java.util.Scanner;
import java.util.Stack;

public class CamadaPilha {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Stack<String> pilha = new Stack<String>();

		int opcaoEscolhida = -1;
		String nomeLivro, livroRemovido;

		System.out.println("***************************************\n" + "\t O que deseja fazer?\n\n"
				+ "\t1 - Adicionar livro na pilha\n\t2 - Listar todos os livros"
				+ "\n\t3 - Retirar livro da pilha \n\t0 - Sair\n" + "\n***************************************\n");

		while (opcaoEscolhida != 0) {

			System.out.println("Digite uma opção: ");
			opcaoEscolhida = leia.nextInt();
			leia.nextLine();

			switch (opcaoEscolhida) {

			case 1:
				System.out.print("Digite o nome do livro: ");
				nomeLivro = leia.nextLine();
				pilha.push(nomeLivro);
				System.out.println("Livro " + nomeLivro + " adicionado na pilha.");
				break;

			case 2:
				if (pilha.isEmpty()) {
					System.out.println("A pilha está vazia.");
				} else {
					System.out.println("Livros na pilha:");
					for (String livro : pilha) {
						System.out.println(livro);
					}
				}
				break;

			case 3:
				if (pilha.isEmpty()) {
					System.out.println("A pilha está vazia.");
				} else {
					livroRemovido = pilha.pop();
					System.out.println("Livro retirado: " + livroRemovido);
				}

				break;
			case 0:
				System.out.println("Programa finalizado.");
				break;
			default:
				System.out.println("Opção inválida. Digite novamente.");
				break;
			}
		}
	}
}