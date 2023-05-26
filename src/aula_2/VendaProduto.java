package aula_2;

import java.util.Scanner;

//EXERCÍCIOS LAÇOS CONDICIONAIS SWITCH CASE

public class VendaProduto {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int codigoProduto, quantidadeProduto;
		String nomeProduto;
		float precoProduto = 0, valorTotal;
		
		System.out.println("Digite o código do produto: ");
		codigoProduto = leia.nextInt();
		
		System.out.println("Digite a quantidade que deseja: ");
		quantidadeProduto = leia.nextInt();

		switch (codigoProduto) {
		
		case 1: nomeProduto = "Cachorro quente";
				precoProduto = 10;
				System.out.println("Produto: " + nomeProduto );
				valorTotal = precoProduto * quantidadeProduto;
				System.out.println("Valor: " + valorTotal );
				break;
				
		case 2: nomeProduto = "X Salada";
				precoProduto = 15;
				System.out.println("Produto: " + nomeProduto );
				valorTotal = precoProduto * quantidadeProduto;
				System.out.println("Valor: " + valorTotal );
				break;
				
		case 3: nomeProduto = "X-Bacon";
				precoProduto = 18;
				System.out.println("Produto: " + nomeProduto );
				valorTotal = precoProduto * quantidadeProduto;
				System.out.println("Valor: " + valorTotal );
				break;
				
		case 4:	nomeProduto = "Bauru";
				precoProduto = 12;
				System.out.println("Produto: " + nomeProduto );
				valorTotal = precoProduto * quantidadeProduto;
				System.out.println("Valor: " + valorTotal );
				break;
				
		case 5: nomeProduto = "Refrigerante";
				precoProduto = 8;
				System.out.println("Produto: " + nomeProduto );
				valorTotal = precoProduto * quantidadeProduto;
				System.out.println("Valor: " + valorTotal );
				break;
				
		case 6: nomeProduto = "Suco de laranja";
				precoProduto = 13;
				System.out.println("Produto: " + nomeProduto );
				valorTotal = precoProduto * quantidadeProduto;
				System.out.println("Valor: " + valorTotal );
				break;
				
		default:
			System.out.println("Opção invalida...");
			break;
		}
	}
}
