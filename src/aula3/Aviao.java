package aula3;

public class Aviao extends Veiculo{

	//atributos
		private String tipo;
		private String uso;
		
		
		
	//getters e setters
		public String getTipo() {
			return tipo;
		}
		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
		public String getUso() {
			return uso;
		}
		public void setUso(String uso) {
			this.uso = uso;
		}

	//construtor
		public Aviao() {
			
			
		}
		public Aviao(String modelo, String marca, String placa, String cor, int km, boolean isLigado,
				int litrosCombustivel, int velocidade, double preco, String tipo, String uso) {
			super(modelo, marca, placa, cor, km, isLigado, litrosCombustivel, velocidade, preco);
			this.tipo = tipo;
			this.uso = uso;
			
		}
		
	//metodos
		public void abastecer(String quant) {
			this.setLitrosCombustivel(Integer.parseInt(quant));
		}
		public void acelerar() {
			super.acelerar();
		}
		public void status() {
			super.status();
			System.out.println("Tipo: "+this.tipo+"\nUso: "+this.uso);
		}
}
