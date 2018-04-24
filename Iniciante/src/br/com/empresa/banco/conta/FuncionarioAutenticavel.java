package br.com.empresa.banco.conta;

public abstract class FuncionarioAutenticavel extends Funcionario{
	
	private int senha;
	
	public boolean autentica(int senha){
		
		return this.senha == senha;
	}
	
}
