package ProjetoMaster;

import java.util.Scanner;

public class LuizaMel {
	
	void luizaMel () {
		FormaDePagamento form = new FormaDePagamento();
		
		Scanner leia = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Luiza Mell - instituto de ajuda aos animais");
		System.out.println("-------------------------------------------");
		System.out.println("Qual valor você quer doar: ");
		System.out.println("[1] [2] [3]");
		numero = leia.nextInt();
		
		switch (numero) {
		 
			case 1:
				System.out.println("");
				form.formaDePagamento();
			break;
			
			case 2:
				System.out.println("");
				form.formaDePagamento();
			break;
			
			case 3:
				System.out.println("");
				form.formaDePagamento();
			break;
		}
	}

}
