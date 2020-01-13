package project4;

import br.com.gft.intefaces.Imposto;

public class VideoGame extends Produto implements Imposto{
	
//atributos	
	private String marca;
	private String modelo;
	private boolean isUsado;
	
//getters e setters
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public boolean getUsado() {
		return isUsado;
	}
	public void setUsuario(boolean isUsado) {
		this.isUsado = isUsado;
	}
	
//constructor
	public VideoGame() {
		super();
		
	}
	public VideoGame(String nome, double preco, int qtd, String marca, String modelo, boolean isUsado) {
		super(nome, preco, qtd);
		 this.marca = marca;
		 this.modelo = modelo;
		 this.isUsado = isUsado;
	}
	
//metodo interface	
	

	
	@Override

		public double calculaImposto() {
			if(this.isUsado == false) {
				
				System.out.println("Imposto : "+this.getNome()+"  é R$: "+this.preco *0.45);
				return this.preco * 0.45 ;
			}else {
			
				System.out.println("Imposto: "+ this.getNome() +" usado é de R$: "+  this.preco * 0.25 );
				return this.preco * 0.25;
			}
				
		}
		
	}
	


