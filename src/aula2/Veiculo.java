package aula2;

public abstract class Veiculo {
	//atributos
	private String modelo;
	private int velocidade;
	private String passageiro;
	private float combustivel;
	
	// metodos getters e setters
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public String getPassageiro() {
		return passageiro;
	}
	public void setPassageiro(String passageiro) {
		this.passageiro = passageiro;
	}
	public float getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(float combustivel) {
		this.combustivel = combustivel;
	}
	
	//construtor 
	public Veiculo() {
		
	}
	
	public Veiculo(String mo, int ve, String pa, float com) {
		this.modelo = mo;
		this.velocidade = ve;
		this.passageiro = pa;
		this.combustivel = com;
		
	}
	
	public void status() {
		System.out.println("O veiculo modelo:"+this.modelo +
				"\nVelocidade: "+this.velocidade +
				"\nPassageiros: "+this.passageiro +
				"\nCombustivel: "+this.combustivel);
		
	}
}
