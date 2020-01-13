package project4;

import br.com.gft.intefaces.Imposto;

public class Livro extends Produto implements Imposto {
	
//atributos	
	private String autor;
	private String tema;
	private int qtdPag;
	
//getters e setters	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
	public int getQtdPag() {
		return qtdPag;
	}
	public void setQtdPag(int qtdPag) {
		this.qtdPag = qtdPag;
	}
	
	
//constructor	
	public Livro() {
		
	}
	public Livro(String nome, double preco, int qtd, String autor,String tema,int qtdPag) {
		super(nome, preco, qtd);
		this.autor = autor;
		this.tema = tema;
		this.qtdPag= qtdPag;
		
	}
	
//metodo interface
	
	 private double valorImp;
	@Override
	public  double calculaImposto() {
		if(this.tema == "educativo") {
			System.out.println("Livro educativo não tem imposto: " + this.getNome());
			return 0.00;
		}else {
			valorImp = this.preco * 0.1;
			System.out.println("Imposto: "+ this.getNome() +"é de R$ "+ valorImp );
		 return valorImp;
		}
			
	}
	
	
	
}