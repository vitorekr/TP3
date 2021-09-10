package dados;

public class ChocolateSortido extends Produto{
	private Integer quantidade;
	
	public ChocolateSortido(String nome, String descricao, Double valorCompra, Date dataValidade, String tipo, String sabores, Double peso,Float porcentagemCacau,  Integer quantidade) {
		super(nome, descricao, valorCompra, dataValidade, tipo, sabores, peso, porcentagemCacau);
		setQuantidade(quantidade);
	}
	
	public Integer getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	public String toString() {	
		return "Nome da Trufa: " + getNome() + ", Descrição: " + getDescricao() + ", Valor de Compra: " + getValorCompra() + ", Data de Validade: " + getDataValidade() + ", Tipo: " + getTipo() + ", Sabores: " + getSabores() + ", Peso: " + getPeso() + ", Porcentagem de Cacau: " + getPorcentagemCacau() + ", Quantidade: " + getQuantidade();
	}
}
