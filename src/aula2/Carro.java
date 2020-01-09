package aula2;

public class Carro extends Veiculo{
	
	
	//atributos
	
	private String marca;
	private int portas;
	private int ano;
	
	// metodos getters e setters
	 	
	public String getmarca() {
		return marca;
	}
	public void setmarca(String marca) {
		this.marca = marca;
	}
	public int getPortas() {
		return portas;
	}
	public void setPortas(int portas) {
		this.portas = portas;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	//construtor
	
	
	public Carro(String mo, int ve, String pa, float com, String ma, int po, int ano ) {
		super(mo, ve, pa, com);
		this.marca = ma;
		this.portas = po;
		this.ano = ano;
		
		// TODO Auto-generated constructor stub
	}
	@Override
	public void status() {
		super.status();
		System.out.println("Marca: "+this.marca
		+"\nPortas: "+this.portas +
		"\nAno: "+this.ano		);
		// TODO Auto-generated method stub
		
	}
	
	//metodo
	

}
