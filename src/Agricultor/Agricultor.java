package Agricultor;

public class Agricultor {
	private String nome;
	private String cpf;
	private int regiao;
	
	public Agricultor(String nome, String cpf, int regiao) {
		this.nome = nome;
		this.cpf = cpf;
		this.regiao = regiao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getRegiao() {
		return regiao;
	}

	public void setRegiao(int regiao) {
		this.regiao = regiao;
	}
	
	public String getNomeRegiao(int regiao) {
	    switch (regiao) {
	        case 1:
	            return "Norte";
	        case 2:
	            return "Nordeste";
	        case 3:
	            return "Sul";
	        case 4:
	            return "Sudeste";
	        case 5:
	            return "Centro-Oeste";
	        default:
	            return "Região inválida";
	    }
	}
	
	public String toString() {
		return "Nome: " + this.getNome() 
		+ "\nCPF: " + this.getCpf() 
		+ "\nRegião: " + getNomeRegiao(getRegiao());
	}
}
