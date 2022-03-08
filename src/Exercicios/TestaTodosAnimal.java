package Exercicios;

public class TestaTodosAnimal {

	public static void main(String[] args) {
		
		Cachorro cac1 = new Cachorro();
		Cavalo cav1 = new Cavalo();
		Preguica pre1 = new Preguica();
		
		cac1.setNome("Doguinho");
		cac1.setIdade(4);
		
		System.out.println("Nome: " + cac1.getNome());
		System.out.println("Idade: " + cac1.getIdade());
		cac1.somEmitido();
		cac1.correndo();
		
		System.out.println();
		
		cav1.setNome("Pegasus");
		cav1.setIdade(12);
		
		System.out.println("Nome: " + cav1.getNome());
		System.out.println("Idade: " + cav1.getIdade());
		cav1.correndo();
		cav1.somEmitido();
		
		System.out.println();
		
		pre1.setNome("Brad-Pitt");
		pre1.setIdade(20);
		
		System.out.println("Nome: " + pre1.getNome());
		System.out.println("Idade: " + pre1.getIdade());
		pre1.somEmitido();
		pre1.subir();
		
		
		
	}

}
