package aula_6;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class CamadaFila {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		Queue<String> fila = new LinkedList<String>();
		int opcaoEscolhida = -1;
		String nomeCliente, clienteChamado ;

		System.out.println("***************************************\n" + "\t O que deseja fazer?\n\n"
				+ "\t1 - Adicionar Cliente\n\t2 - Listar Clientes" + "\n\t3 - Retirar Cliente \n\t0 - Sair\n"
				+ "\n***************************************\n");

		while (opcaoEscolhida != 0) {
			System.out.println("Digite uma opção: ");
			opcaoEscolhida = leia.nextInt();
			leia.nextLine();

			switch (opcaoEscolhida) {
			case 1:

				System.out.print("Digite o nome do cliente: ");
				nomeCliente = leia.nextLine();
				fila.add(nomeCliente);
				System.out.println("Cliente " + nomeCliente + " foi adicionado.\n");
				break;

			case 2:
				if (fila.isEmpty()) {
					System.out.println("A fila está vazia.");
				} else {
					System.out.println("Clientes na fila:\n");
					for (String cliente : fila) {
						System.out.println(cliente);
					}
				}
				break;

			case 3:
				if (fila.isEmpty()) {
					System.out.println("A fila está vazia.");
				} else {
					clienteChamado = fila.poll();
					System.out.println("Cliente chamado: " + clienteChamado);
				}

				break;

			case 0:
				System.out.println("Programa finalizado.");
				break;
			default:
				System.out.println("Opção inválida. Tente novamente.");
				break;
			}
		}
	}
}