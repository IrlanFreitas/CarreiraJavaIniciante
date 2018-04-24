package br.com.empresa.banco.excecao;

public class SaldoInsuficienteException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private double saldoAtual;
	
	public SaldoInsuficienteException(double saldoAtual){
		super("Saldo insuficiente: "+ saldoAtual);
		this.saldoAtual = saldoAtual;
		
	}

	public double getSaldoAtual() {
		return saldoAtual;
	}

	public void setSaldoAtual(double saldoAtual) {
		this.saldoAtual = saldoAtual;
	}
	
	
}
