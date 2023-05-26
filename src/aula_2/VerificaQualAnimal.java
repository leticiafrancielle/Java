package aula_2;

import java.util.Scanner;
import java.text.Normalizer;


public class VerificaQualAnimal {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String caracteristica1, caracteristica2, caracteristica3;
		
		System.out.println("Digite a primeira característica: \n(Vertebrado/Invertebrado)");
		caracteristica1 = leia.next();
		
		System.out.println("\nDigite a segunda característica:\n(Ave/Mamífero/Inseto/Anelídeo)");
		caracteristica2 = leia.next();
		
		System.out.println("\nDigite a terceira característica:\n(Carnívoro/Onívoro/Herbívoro/Hematófago)");
		caracteristica3= leia.next();
		
		
		if (caracteristica1.equalsIgnoreCase("vertebrado") && caracteristica2.equalsIgnoreCase("ave") && caracteristica3.equalsIgnoreCase("carnivoro")){
			System.out.println("Animal escolhido: Águia");
		} else if(caracteristica1.equalsIgnoreCase ("Vertebrado") && caracteristica2.equalsIgnoreCase("Ave") && caracteristica3.equalsIgnoreCase("Onivoro")){
			System.out.println("Animal escolhido: Pomba");
		}else if(caracteristica1.equalsIgnoreCase ("Vertebrado") && caracteristica2.equalsIgnoreCase("Mamifero") && caracteristica3.equalsIgnoreCase("Onivoro")){
			System.out.println("Animal escolhido: Homem");
			
		}else if(caracteristica1.equalsIgnoreCase ("Vertebrado") && caracteristica2.equalsIgnoreCase("Mamifero") && caracteristica3.equalsIgnoreCase("Onivoro")){
			System.out.println("Animal escolhido: Homem");
		}
               

        leia.close();
	}
}
