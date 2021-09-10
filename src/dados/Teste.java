package dados;

public class Teste {
	static Cliente a1;
	static Cliente a2;
	static Trufa c;
	static ChocolateSortido cs;
	static Funcionario p;
	static Telefone t;
	static Telefone t2;
	static Date d1;
	static Date d2;
	static Date dataValidade1;
	static Date dataValidade2;
	static Venda venda1;
	static Loja loja;
	
	public static void main(String[] args) {
		
		loja = new Loja(2000, 20, 1456);
		
		t = new Telefone(061, 555555);
		d1 = new Date(17, 11, 1999);
		
		t2 = new Telefone(061, 6666666);
		d2 = new Date(07, 04, 2002);
		
		a1 = new Cliente("Vitor", d1, t, "0321312312", "SQN 1008");
		
		p = new Funcionario("Maria", d2, t2, "0321312312", "Vendedor(a)", (float) 5500);
		
		dataValidade1 = new Date(02, 07, 2024);
		dataValidade2 = new Date(07, 12, 2022);
		c = new Trufa("Trufinha", "Trufa pequena", 0.33, dataValidade1, "Pequena", "Chocolate e Limão", 30.00, (float) 20, "Limão", "Limão, cacau...", "Sem colesterol");
		cs = new ChocolateSortido("MiniSortido", "Recheio extra", 0.45, dataValidade2, "Médio", "Maracujá e cacau", (double) 50, (float) 12, 200);
		
		venda1 = new Venda(a1, p, c, 10, (float) 50, "Débito");
		
		System.out.println(loja.toString());
		System.out.println(a1.toString());
		System.out.println(p.toString());
		System.out.println(c.toString());
		System.out.println(cs.toString());
		System.out.println(venda1.toString());
	}

}
