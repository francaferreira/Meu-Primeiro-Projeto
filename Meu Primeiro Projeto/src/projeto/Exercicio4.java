package projeto;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
	/*
	 * 1) Criar login.
	 * 2) Criar senha.
	 * 3) Armazenar a variável.
	 * 4) Verificar se o login e senha estão corretos.	
	 */
		Scanner teclado = new Scanner(System.in);
		System.out.print("login> ");
		String login = teclado.nextLine();
		System.out.print("senha> ");
		String senha = teclado.nextLine();
		// login == "Jefferson".
		// Estamos comparando uma instância (objeto) com uma string.
		if (login.equals("Jefferson") && senha.equals("123456789-09")) {
			System.out.printf("Usuário %s logado com sucesso.", login);
		} else {
			System.out.println("Login ou senha inválidos!");
	}
		teclado.close();
	}

}
