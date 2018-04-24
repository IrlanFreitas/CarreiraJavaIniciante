package br.com.empresa.banco.conta;

public class Diretor extends Funcionario implements Autenticavel{

	@Override
	public boolean autentica(int senha) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double getBonus() {
		return this.salario * 0.4;
	}

}
