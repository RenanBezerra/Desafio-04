package project4;

import java.util.ArrayList;
import java.util.List;

public class Loja  {
	
//atributos	
	private String nome;
	private String cnpj;
	private List<Livro> livros;
	private List<VideoGame> videoGame;
	 
//arrays	

	
//getters e setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public List<Livro> getLivros() {
		return livros;
	}
	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}
	public List<VideoGame> getVideoGame() {
		return videoGame;
	}
	public void setVideoGame(List<VideoGame> videoGame) {
		this.videoGame = videoGame;
	}
	
	
//constructor
	public Loja() {
		
	}
	
	
	public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGame) {
	super();
	this.nome = nome;
	this.cnpj = cnpj;
	this.livros = livros;
	this.videoGame = videoGame;
}
//metodos 

	

	
	public void listaLivros() {
			System.out.println("-------------------------------------------------------------------");
			if(getLivros().size() == 0) {
				
				System.out.println("lista vazia");
				
			}else {
				System.out.println("A loja Americanas possui estes livros para venda:");
				for (Livro indice : livros) {

				System.out.println("Titulo: "+indice.getNome()+", Preço: "+indice.getPreco()+", Quantidade: " +indice.getQtd()+ " em estoque.");
				}
			}
			
		}
	
	public void listaVideoGames() {
		System.out.println("-------------------------------------------------------------------");
		if(getVideoGame().size() == 0) {
			
			System.out.println("lista vazia");
			
		}else {
			System.out.println("A loja Americanas possui estes video-games para venda:");
			for (VideoGame indice : videoGame) {

			System.out.println("Video-game: "+indice.getModelo()+", Preço: "+indice.getPreco()+", Quantidade: " +indice.getQtd()+ " em estoque.");
			}
		}
		
	}

	
	public int patriL,patriV,res;
	public void calculaPatrimonio() {
		System.out.println("-------------------------------------------------------------------");
	//livros	
		if(getLivros().size() == 0) {
			
		}else {
			for (Livro indice : livros) {
				patriL += indice.getPreco()*indice.getQtd();
			}
		}
		System.out.println("livros patrimonio "+ patriL);
	
		
	//video game	
		if(getVideoGame().size() == 0) {
			
			
		}else {
			for (VideoGame game : videoGame) {
				patriV += game.getPreco()*game.getQtd();
			}
		}
		System.out.println("video game patrimonio "+ patriV);
		res = patriV + patriL;
	System.out.println("O patrimonio da lojas americanas é de "+ res);
		
	}
}
