package aula3;

public class Carro extends Veiculo {

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

	public void frear() {

		super.frear();
	}

	public void pintar(String cor) {

		super.pintar(cor);
	}

	public void ligar() {

		super.ligar();
	}

	public void desligar() {

		super.desligar();
	}

	// metodos
	public void abastecer(int quant) {
		this.setLitrosCombustivel(quant);
	}

	public void acelerar() {
		super.acelerar();
	}

	public void status() {
		super.status();
		System.out.println("Portas: " + this.portas + "\nAno: " + this.ano);
	}
}
