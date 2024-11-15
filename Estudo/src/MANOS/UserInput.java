package MANOS;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual seu nome? ");
		String nome = entrada.nextLine();
		System.out.println("qual sua idade? ");
		int idade = entrada.nextInt();
		entrada.nextLine();
		System.out.println("Qual sua comida favorita? ");
		String comida = entrada.nextLine();
		
		
		
		System.out.println("Olá "+ nome);
		System.out.println("Você tem "  + idade+ " anos de idade! ");
		System.out.println("Você gosta de "+ comida);
	}

}
