package herança;

public class Veiculo {
	// Atributos
	private String marca;
	private String modelo;
	private String placa;
	private String cor;
	private float km; 
	private boolean isLigado;
	private int litrosCombustivel;
	private int velocidade;
	private double preco;
	
	// metodos getters e setters
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
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public float getKm() {
		return km;
	}
	public void setKm(int km) {
		this.km = km;
	}
	public boolean getisLigado() {
		return isLigado;
	}
	public void setLigado(boolean isLigado) {
		this.isLigado = isLigado;
	}
	public int getLitrosCombustivel() {
		return litrosCombustivel;
	}
	public void setLitrosCombustivel(int litrosCombustivel) {
		this.litrosCombustivel = litrosCombustivel;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	 
	// construtor
		public Veiculo() {
			
		}
		
		public Veiculo(String ma, String mo, String pla, String cor, float km, Double preço  ) {
			this.marca = ma;
			this.modelo = mo;
			this.placa = pla;
			this.cor = cor;
			this.km = km;
			this.isLigado = false;
			this.litrosCombustivel = 50;
			this.velocidade = 0;
			this.preco = preço;
			
			
		}
		// metodos da interface 
		
		public void acelerar() {
			if(this.getisLigado() == true) {
				this.setVelocidade(this.getVelocidade()+20);
				this.setLitrosCombustivel(this.getLitrosCombustivel()-1);
			}else {
				System.out.println("Não é possivel acelerar com o carro desligado");
			}	
		}
			int dif;
		public void abastecer(int li) {
			if(this.getLitrosCombustivel()<100) {
				if(this.getLitrosCombustivel() + li > 100) {
					this.setLitrosCombustivel(100);
					dif = li - 50;
					System.out.println( "Não pode exceder o limite de abastecimento ");
					System.out.println(" Excedeu em "+ dif +" litros de combustivel no abastecimento ");
				}else {
					this.setLitrosCombustivel(this.getLitrosCombustivel() + li);	
					System.out.println(" abastecimento de "+ li +"concluido, o quantidade de combustivel é  " + this.litrosCombustivel + li);
				}
							
			}else {
				System.out.println("Não é possivel abastecer o tanque está cheio");
			}
		}
		
		public void frear() {
			if(this.getisLigado() == true) {
				if(this.getVelocidade() < 0 ) {
					System.out.println("O carro está parado");
				}else {
					this.velocidade = this.velocidade-10;
				}
			}else {
				System.out.println("Não é possivel frear seu carro está desligado");
			}
		}
		public void pintar(String cor) {
			this.cor = cor;
			
		}
		public void ligar() {
			if(this.isLigado == false) {
				this.isLigado = true;
				System.out.println("O carro ligou");
			}else {
				System.out.println("O carro se encontra ligado");
			}
		}
		public void desligar() {
			if(this.isLigado == true) {
				this.isLigado = false;
				System.out.println("Desligando o carro");
			}else {
				System.out.println("O carro está desligado");
			}
			
		}
		
		public void status() {
			System.out.println(" O veiculo modelo: "+ this.modelo +
					"\n Marca: " + this.marca +
					"\n Placa: " + this.placa +
					"\n Cor: " + this.cor+
					"\n KM: " + this.km+
					"\n Ligado: "+ this.isLigado+
					"\n Litros de combustvel "+ this.litrosCombustivel +
					"\n Velocidade "+ this.velocidade+
					"\n Preço "+ this.preco);
		}

	
}
