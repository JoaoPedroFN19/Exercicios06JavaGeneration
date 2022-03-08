package ProjetoMaster;

import java.util.Scanner;

public class Instituicao {
	
	void instituicao() {
		LuizaMel lui = new LuizaMel();
		Medicos med = new Medicos();
		Acnur acn = new Acnur();
		
		int num1;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Para qual instituição você quer doar");
		System.out.println("[1] [2] [3]");
		num1 = entrada.nextInt();
		
		switch (num1) {
			case 1:
				lui.luizaMel();
			break;
			
			case 2:
				med.medicos();
			break;
			
			case 3:
				acn.acnur();
			break;
		}
		
	}

}
