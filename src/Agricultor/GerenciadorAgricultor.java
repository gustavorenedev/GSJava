package Agricultor;

import java.util.Scanner;

public class GerenciadorAgricultor {
	private Agricultor[] agricultores;
	private Scanner input;
	
	public GerenciadorAgricultor(int t) {
		agricultores = new Agricultor[t];
	}
	
	public void adicionarAgricultores() {
		for (int i = 0; i < agricultores.length; i++) {
			agricultores[i] = criarAgricultor();
		}
		
	}
	
	public Agricultor criarAgricultor() {
		System.out.println("*-* Criando Agricultor *-*");
		System.out.println("==========================");
		input = new Scanner(System.in);
		
		System.out.println("Nome: ");
		String nome = input.next();
		System.out.println("CPF: ");
		input.nextLine();
		String cpf = input.next();
		System.out.println("Insira o número que corresponde com sua região!\n" +
				"1 - Norte\n" +
				"2 - Nordeste\n" +
				"3 - Sul\n" +
				"4 - Sudeste\n" +
				"5 - Centro-Oeste\n");
		int regiao = input.nextInt();
		Agricultor agricultor = new Agricultor(nome, cpf, regiao);
	    System.out.println("Agricultor criado com sucesso!");
	    System.out.println("");
		return agricultor;
	}
	
	public void atualizarAgricultor() {
		System.out.println("*-* Atualizando Agricultor *-*");
		System.out.println("===========================");

		Scanner input = new Scanner(System.in);
	    
		System.out.println("Nome: ");
		String nome = input.next();
		System.out.println("CPF: ");
		String cpf = input.next();
		System.out.println("Insira o número que corresponde com sua região!\n" +
				"1 - Norte\n" +
				"2 - Nordeste\n" +
				"3 - Sul\n" +
				"4 - Sudeste\n" +
				"5 - Centro-Oeste\n");
		int regiao = input.nextInt();
	    
	    Agricultor novoAgricultor = new Agricultor(nome, cpf, regiao);
	    agricultores[0] = novoAgricultor;
	    System.out.println("Agricultor atualizado com sucesso!");
	    System.out.println(" ");
	}
	
	public void deletarAgricultor() {
	        Agricultor[] novoArray = new Agricultor[agricultores.length - 1];
	        System.arraycopy(agricultores, 1, novoArray, 0, novoArray.length);
	        agricultores = novoArray;

	        System.out.println("Agricultor excluído com sucesso!");
	        System.out.println("");
	
	}
	
	public Agricultor getAgricultor(int index) {
		return agricultores[index];
	}
	
	public void mostrarAgricultores() {
		System.out.println("Olá, " + getAgricultor(0).getNome() + " aqui estão seus dados: ");
		for (int i=0; i < agricultores.length; i++) {
			System.out.println(agricultores[i].toString());
		}
	}
}
