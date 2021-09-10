package dados;

public class Funcionario extends Pessoa {
	private String posto;
	private Float salario;
	
	public Funcionario(String nome, Date dataNascimento, Telefone telefone, String cpf, String posto, Float salario) {
		super(nome, dataNascimento, telefone, cpf);
		setPosto(posto);
		setSalario(salario);
	}
	
	public String getPosto() {
		return posto;
	}
	
	public void setPosto(String posto) {
		this.posto = posto;
	}
	
	
	public Float getSalario() {
		return salario;
	}
	
	public void setSalario(Float salario) {
		this.salario = salario;
	}
	
	public String toString() {	
		return "Nome do Funcion�rio: " + getNome() + ", Data de Nascimento: " + getDataNascimento().toString() + ", CPF: " + getCPF() + ", Posto: " + getPosto() + ", Salario: " + getSalario();
	}
}
