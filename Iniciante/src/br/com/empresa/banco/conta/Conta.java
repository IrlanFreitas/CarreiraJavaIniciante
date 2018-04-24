package br.com.empresa.banco.conta;

import br.com.empresa.banco.excecao.ValorInvalidoException;

public abstract class Conta  implements Comparable<Conta>{
	
	protected int numero;
	protected String nome;
	protected double saldo;
	
	public Conta(){
	};
	
	public Conta(double saldo){
		this.saldo = saldo;
	}
	
	public synchronized void deposita(double valor) throws ValorInvalidoException{
		if (valor <= 0) {
			throw new ValorInvalidoException(valor);
		} else {
			this.saldo += valor;
		}
	}
	
	public void saca(double valor) throws Exception{
		if (saldo >= valor) {
			this.saldo -= valor;
		}else{
			//throw new SaldoInsuficienteException(saldo);
			throw new RuntimeException();
		}
	}
	
	public double getSaldo(){
		return this.saldo;
	}
	
 	public abstract void atualiza(double taxa);

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	@Override
	public String toString() {
		return "Conta com saldo: "+ this.saldo;
	}
	
	
/*	public int compareTo(Conta outra) {
		
		char nomeEsse = this.nome.charAt(0);
		int nomeEsseNum = nomeEsse;
		char nomeOutro = outra.nome.charAt(0);
		int nomeOutroNum = nomeOutro;
		
		//Isso quer dizer que vem antes
		if (nomeEsseNum < nomeOutroNum) return -1;
		
		//Isso quer dizer que vem depois
		if (nomeEsseNum < nomeOutroNum) return 1;
		
		//Caso nenhum dos dois, quer dizer que é o mesmo elemento
		return 0;
	}
*/	
	
	 @Override
     public int compareTo(Conta outra) {
         return this.nome.compareTo(outra.nome);
     }

/*	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numero;
		return result;
	}*/

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (numero != other.numero)
			return false;
		return true;
	}
	
	/*
	public int compareTo(Conta outra){
		
		return this.getNumero() - outra.getNumero();
	}*/


}
