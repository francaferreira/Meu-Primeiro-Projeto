package projeto;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		try (/*
				 * 1)program que peça o nome, idade e cidade de nascimento do usuário
				 * 2)imprima a frase abaixo trocando as tag's<nome><cidade><idade>
				 */
		Scanner in = new Scanner(System.in)) {
			System.out.print("qual é o seu Nome: ");
			String nome = in.nextLine();
			System.out.print("Qual é sua idade : ");
			int idade = in.nextInt();
			System.out.print("Qual é sua cidade: ");
			String cidade = in.next();
			 
			System.out.println("olá. Meu nome é " + nome + ", sou natural de " + cidade + ", tenho " + idade + " anos, e estou aprendendo a programar." );
		}

	}

}
