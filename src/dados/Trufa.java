package dados;

public class Trufa extends Produto{
	private String recheio;
	private String ingredientes;
	private String classificacao;
	
	public Trufa(String nome, String descricao, Double valorCompra, Date dataValidade, String tipo, String sabores, Double peso, Float porcentagemCacau, String recheio, String ingredientes, String classificacao) {
		super(nome, descricao, valorCompra, dataValidade, tipo, sabores, peso, porcentagemCacau);
		setRecheio(recheio);
		setIngredientes(ingredientes);
		setClassificacao(classificacao);
	}
	
	public String getRecheio() {
		return recheio;
	}
	
	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}
	
	public String getIngredientes() {
		return ingredientes;
	}
	
	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}
	
	public String getClassificacao() {
		return classificacao;
	}
	
	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}
	
	public String toString() {	
		return "Nome da Trufa: " + getNome() + ", Descrição: " + getDescricao() + ", Valor de Compra: " + getValorCompra() + ", Data de Validade: " + getDataValidade() + ", Tipo: " + getTipo() + ", Sabores: " + getSabores() + ", Peso: " + getPeso() + ", Porcentagem de Cacau: " + getPorcentagemCacau() + ", Recheio: " + getRecheio() + ", Ingredientes: " + getIngredientes() + ", Classificação: " + getClassificacao();
	}
}
