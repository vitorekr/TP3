package dados;

public class Date {
	private Integer dia;
	private Integer mes;
	private Integer ano;
	
	public Date(Integer dia, Integer mes, Integer ano) {
		setDia(dia);
		setMes(mes);
		setAno(ano);
	}
	
	public Integer getDia() {
		return dia;
	}
	
	public void setDia(Integer dia) {
		this.dia = dia;
	}
	
	public Integer getMes() {
		return mes;
	}
	
	public void setMes(Integer mes) {
		this.mes = mes;
	}
	
	public Integer getAno() {
		return ano;
	}
	
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	
	public String toString() {	
		return getDia() + "/" + getMes() + "/" + getAno();
	}
}
