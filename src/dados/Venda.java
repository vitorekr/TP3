package dados;

public class Venda {
	private Cliente cliente;
	private Funcionario funcionario;
	private Produto produto;
	private Integer quantidadeVendidos;
	private Float valorTotal;
	private String formaPagamento;
	
	public Venda(Cliente cliente, Funcionario funcionario, Produto produto, Integer quantidadeVendidos, Float valorTotal, String formaPagamento) {
		setCliente(cliente);
		setFuncionario(funcionario);
		setProduto(produto);
		setQuantidadeVendidos(quantidadeVendidos);
		setValorTotal(valorTotal);
		setFormaPagamento(formaPagamento);
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Funcionario getFuncionario() {
		return funcionario;
	}
	
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	public Produto getProduto() {
		return produto;
	}
	
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public Integer getQuantidadeVendidos() {
		return quantidadeVendidos;
	}
	
	public void setQuantidadeVendidos(Integer quantidadeVendidos) {
		this.quantidadeVendidos = quantidadeVendidos;
	}
	
	public Float getValorTotal() {
		return valorTotal;
	}
	
	public void setValorTotal(Float valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	public String getFormaPagamento() {
		return formaPagamento;
	}
	
	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	
	public String toString() {
		return "Nome do Cliente: " + cliente.getNome() + ", Nome do Funcionário: " + funcionario.getNome() + ", Nome do Produto: " + getProduto().getNome() + ", Valor da Venda: " + getValorTotal();
	}
}
