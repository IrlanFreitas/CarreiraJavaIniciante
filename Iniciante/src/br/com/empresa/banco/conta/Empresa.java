package br.com.empresa.banco.conta;
import java.util.Arrays;

public class Empresa {
	
	private String cnpj;
	private String nome;
	private String endereco;
	private Funcionario[] funcionarios;
	
	public Empresa (){}
	
	public Empresa (int numeroFuncionarios){
		
		funcionarios = new Funcionario[numeroFuncionarios];
		
	}
	
	public void adicionar(Funcionario f){
		for (int i = 0; i < funcionarios.length; i++) {
			if (funcionarios[i] == null) {
				funcionarios[i] = f;
				System.out.println("Adicionado com sucesso!");
				break;
			}
		}
	}
	
	public void mostraEmpregados(){
		for (Funcionario funcionario : funcionarios) {
			System.out.println("------------");
			//System.out.println(funcionario.getNome());
			System.out.println(funcionario.getSalario());
			System.out.println(funcionario.getNumeroIdentificador());
			System.out.println("------------");
		}
	}
	
	public boolean contem(Funcionario f){
		for (Funcionario funcionario : funcionarios) {
			if (funcionario.equals(f)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empresa other = (Empresa) obj;
		if (cnpj == null) {
			if (other.cnpj != null)
				return false;
		} else if (!cnpj.equals(other.cnpj))
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (!Arrays.equals(funcionarios, other.funcionarios))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
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

	public Funcionario getFuncionarios(int posicao) {
		return funcionarios[posicao];
	}

	public void setFuncionarios(Funcionario[] funcionarios) {
		this.funcionarios = funcionarios;
	}
	
	
	
	
}
