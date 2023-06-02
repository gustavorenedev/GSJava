package Menu;

import Agricultor.GerenciadorAgricultor;

public class TesteMenu {

	public static void main(String[] args) {
		GerenciadorAgricultor gc = new GerenciadorAgricultor(1);
		Menu menu = new Menu(gc);
		
		menu.exibirMenuInicial();
		gc.adicionarAgricultores();
		gc.mostrarAgricultores();
	}

}
