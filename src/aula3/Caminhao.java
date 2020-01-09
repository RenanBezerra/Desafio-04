package aula3;

public class Caminhao extends Veiculo {
//atributos
	int carga;
	int eixos;
	
//setters e getters
	public int getCarga() {
		return carga;
	}
	public void setCarga(int carga) {
		this.carga = carga;
	}
	public int getEixos() {
		return eixos;
	}
	public void setEixos(int eixos) {
		this.eixos = eixos;
	}
	
//construtor	
	public Caminhao() {
		super();
	}
	public Caminhao(String modelo, String marca, String placa, String cor, int km, boolean isLigado,
			int litrosCombustivel, int velocidade, double preco,int carga, int eixos) {
		super(modelo, marca, placa, cor, km, isLigado, litrosCombustivel, velocidade, preco);
		this.carga = carga;
		this.eixos = eixos;
	}
	
//metodos
	public void abastecer(float qua) {
		this.setLitrosCombustivel((int) qua);
	}
	public void acelerar() {
		super.acelerar();
		this.setVelocidade(getVelocidade()+50);
	}
	public void status() {
		super.status();
		System.out.println("Carga: "+this.carga
				+"Eixos: "+this.eixos);
	}
}
