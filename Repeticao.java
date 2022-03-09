package ProjetoMaster;

import java.util.Scanner;

public class Repeticao {
	
	void repeticao() {
		Instituicao ins = new Instituicao();
		
		int num;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Deseja fazer outra doação? ");
		System.out.println("[1] Sim");
		System.out.println("[2] Não");
		System.out.print("---> ");
		num = input.nextInt();
		
		switch (num) {
			
			case 1:
				while (num == 1) {
				ins.instituicao();
				System.out.println("Deseja fazer outra doação? ");
				System.out.println("[1] Sim");
				System.out.println("[2] Não");
				System.out.print("---> ");
				num = input.nextInt();
				}
			break;
			
			case 2: 
				System.out.println("Volte sempre");
			break;
		}
	
	}
}
