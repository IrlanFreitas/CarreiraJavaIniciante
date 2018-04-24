package br.com.empresa.banco.conta;

public class Desenvolvedor extends Funcionario {
	
	@Override
	public double getBonus(){
		return super.salario * 0.25;
	}
	
}
