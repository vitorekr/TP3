package dados;

public abstract class Produto {
	private String nome;
	private String descricao;
	private Double valorCompra;
	private Date dataValidade;
	private String tipo;
	private String sabores;
	private Double peso;
	private Float porcentagemCacau;
	
	public Produto(String nome, String descricao, Double valorCompra, Date dataValidade, String tipo, String sabores, Double peso, Float porcentagemCacau) {
		setNome(nome);
		setDescricao(descricao);
		setValorCompra(valorCompra);
		setDataValidade(dataValidade);
		setTipo(tipo);
		setSabores(sabores);
		setPeso(peso);
		setPorcentagemCacau(porcentagemCacau);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Double getValorCompra() {
		return valorCompra;
	}
	
	public void setValorCompra(Double valorCompra) {
		this.valorCompra = valorCompra;
	}
	
	public Date getDataValidade() {
		return dataValidade;
	}
	
	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getSabores() {
		return sabores;
	}
	
	public void setSabores(String sabores) {
		this.sabores = sabores;
	}
	
	public Double getPeso() {
		return peso;
	}
	
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	
	public Float getPorcentagemCacau() {
		return porcentagemCacau;
	}
	
	public void setPorcentagemCacau(Float porcentagemCacau) {
		this.porcentagemCacau = porcentagemCacau;
	}
}
