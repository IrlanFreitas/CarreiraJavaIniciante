package br.com.empresa.banco.conta;

public class Gerente extends Funcionario implements Autenticavel{

	@Override
	public double getBonus(){
		return super.getSalario() * 0.3;
	}
	
	public void cobrar(){
		System.out.println("Está pronto?");
	}

	@Override
	public boolean autentica(int senha) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
