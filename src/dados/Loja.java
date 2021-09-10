package dados;

public class Loja {
	private Integer estoqueProdutos;
	private Integer quantidadeFuncionarios;
	private Integer quantidadeClientes;
	
	public Loja(Integer estoqueProdutos, Integer quantidadeFuncionarios, Integer quantidadeClientes) {
		setEstoqueProdutos(estoqueProdutos);
		setQuantidadeFuncionarios(quantidadeFuncionarios);
		setQuantidadeClientes(quantidadeClientes);
	}
	
	public Integer getEstoqueProdutos() {
		return estoqueProdutos;
	}
	
	public void setEstoqueProdutos(Integer estoqueProdutos) {
		this.estoqueProdutos = estoqueProdutos;
	}
	
	public Integer getQuantidadeFuncionarios() {
		return quantidadeFuncionarios;
	}
	
	public void setQuantidadeFuncionarios(Integer quantidadeFuncionarios) {
		this.quantidadeFuncionarios = quantidadeFuncionarios;
	}
	
	public Integer getQuantidadeClientes() {
		return quantidadeClientes;
	}
	
	public void setQuantidadeClientes(Integer quantidadeClientes) {
		this.quantidadeClientes = quantidadeClientes;
	}
	
	public String toString() {
		return "Quantidade de Produtos em estoque: " + getEstoqueProdutos() + ", Quantidade de Funcionários:" 
	+ getQuantidadeFuncionarios() + ", Quantidade de Clientes: " + getQuantidadeClientes();
	}
}
