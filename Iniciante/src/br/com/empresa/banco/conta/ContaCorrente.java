package br.com.empresa.banco.conta;

public class ContaCorrente extends Conta implements Tributavel{
	
	public ContaCorrente(){};
	
    public ContaCorrente(double saldo) {
		super(saldo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void atualiza(double taxa) {
        this.saldo += this.saldo * taxa * 2;
    }

	@Override
	public double calculaTributos() {
		return this.getSaldo() * 0.01;
	}

	
}
