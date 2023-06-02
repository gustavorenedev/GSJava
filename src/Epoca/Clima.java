package Epoca;

import Agricultor.Agricultor;

public class Clima {
	private Agricultor regiao;

	public Clima(Agricultor regiao) {
		this.regiao = regiao;
	}

	public Agricultor getRegiao() {
		return regiao;
	}

	public void setRegiao(Agricultor regiao) {
		this.regiao = regiao;
	}

	
}
