package br.com.empresa.banco.conta;

public class Cliente implements Autenticavel{

	private String nome, endereco;
	//...

	@Override
	public boolean autentica(int senha) {
		// TODO Implementar regras de autenticacao
		return false;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
}
