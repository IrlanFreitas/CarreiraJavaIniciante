package br.com.empresa.banco.conta;

import java.util.Date;

/**
 * @author N0rk
 *
 */
public abstract class Funcionario {
	
	protected String nome;
	protected String departamento;
	protected Date dataEntrada;
	protected String rg;
	protected long cpf;
	protected double salario;
	protected int numeroIdentificador;
	protected static int identificador = 1;
	protected int cargo;

	public Funcionario(){
		numeroIdentificador = identificador;
		identificador ++;
	}
	
	public abstract double getBonus();
	
	public void recebeAumento(double valor){
		this.salario += valor;
	}
	
	public double getGanhoAnual(){
		return salario * 12;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		if (cpf != other.cpf)
			return false;
		if (dataEntrada == null) {
			if (other.dataEntrada != null)
				return false;
		} else if (!dataEntrada.equals(other.dataEntrada))
			return false;
		if (departamento == null) {
			if (other.departamento != null)
				return false;
		} else if (!departamento.equals(other.departamento))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (rg == null) {
			if (other.rg != null)
				return false;
		} else if (!rg.equals(other.rg))
			return false;
		if (Double.doubleToLongBits(salario) != Double.doubleToLongBits(other.salario))
			return false;
		return true;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public static int getIdentificador() {
		return Funcionario.identificador;
	}

	public static void setIdentificador(int identificador) {
		Funcionario.identificador = identificador;
	}


	public int getNumeroIdentificador() {
		return numeroIdentificador;
	}


	public void setNumeroIdentificador(int numeroIdentificador) {
		this.numeroIdentificador = numeroIdentificador;
	}

	public int getCargo() {
		return cargo;
	}

	public void setCargo(int cargo) {
		this.cargo = cargo;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", departamento=" + departamento + ", dataEntrada=" + dataEntrada + ", rg="
				+ rg + ", cpf=" + cpf + ", salario=" + salario + ", numeroIdentificador=" + numeroIdentificador
				+ ", cargo=" + cargo + this.getBonus() + "]";
	}

	public Date getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	
}
