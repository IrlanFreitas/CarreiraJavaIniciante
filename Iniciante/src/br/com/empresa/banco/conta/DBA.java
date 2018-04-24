package br.com.empresa.banco.conta;

public class DBA extends Funcionario{

	@Override
	public double getBonus() {
		return super.salario * 0.20;
	}

}
