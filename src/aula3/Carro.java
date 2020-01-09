package aula3;

public class Carro extends Veiculo{
	
//atributos
	private int portas;
	private int ano;
	
	
//getters e setters

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
	public Carro() {
		
	}
	public Carro(String modelo, String marca, String placa, String cor, int km, boolean isLigado, int litrosCombustivel,
			int velocidade, double preco, int portas, int ano) {
		super(modelo, marca, placa, cor, km, isLigado, litrosCombustivel, velocidade, preco);
		
		
		this.portas = portas;
		this.ano = ano;
	}
	
	
@Override
	public void frear() {
		// TODO Auto-generated method stub
		super.frear();
	}
	@Override
	public void pintar(String cor) {
		// TODO Auto-generated method stub
		super.pintar(cor);
	}
	@Override
	public void ligar() {
		// TODO Auto-generated method stub
		super.ligar();
	}
	@Override
	public void desligar() {
		// TODO Auto-generated method stub
		super.desligar();
	}
	//metodos
	public void abastecer(int quant) {
		this.setLitrosCombustivel(quant);
	}
	
	public void acelerar() {
	 super.acelerar();	
	}
	public void status() {
		super.status();
		System.out.println("Portas: " + this.portas
				+"\nAno: " + this.ano);
	}
}

