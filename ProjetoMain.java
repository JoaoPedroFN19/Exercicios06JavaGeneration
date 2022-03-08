package ProjetoMaster;

import java.util.Scanner;

public class ProjetoMain {

	public static void main(String[] args) {
		
		Instituicao ins = new Instituicao();
		
		Scanner leia = new Scanner(System.in);
		
		int cep1; 
		int idade;
		String nome;
		String sobreNome;
		String cpf;
		String email;
		String telefone;
		
		System.out.println("-----------------------------");
		System.out.println("=       C     A     T       =");
		System.out.println("-----------------------------");
		System.out.print("Nome: ");
		nome = leia.next();
		System.out.print("Sobrenome: ");
		sobreNome = leia.next();
		System.out.println("-----------------------------");
		System.out.print("Idade: ");
		idade = leia.nextInt();
		System.out.println("-----------------------------");
		System.out.print("CPF ou RG: ");
		cpf = leia.next();
		System.out.println("-----------------------------");
		System.out.print("Email: ");
		email = leia.next();
		System.out.println("-----------------------------");
		System.out.print("Telefone: ");
		telefone = leia.next();
		System.out.println("-----------------------------");
		System.out.print("CEP: ");
		cep1 = leia.nextInt();
		System.out.println("-----------------------------");
		
		if (idade >= 18) { 
			ins.instituicao();
		}
		else {
			System.out.println("Menor de 18 anos não pode doar");
		}
		
		leia.close();
		
	}

}
