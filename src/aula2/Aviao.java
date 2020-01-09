package aula2;

public class Aviao extends Veiculo {
	
	//atributos
	private String tipo;
	private String uso;
	
	//metodos getters e setters
	
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
	public Aviao(String mo, int ve, String pa, float com,String ti, String uso) {
		super(mo, ve, pa, com);
		this.tipo = ti;
		this.uso = uso;
		// TODO Auto-generated constructor stub
	}
	// metodos
	@Override
	public void status() {
		super.status();
		System.out.println("Tipo: "+this.tipo+
				"\nUso: "+this.uso);
		
		// TODO Auto-generated method stub
		
	}
	
	
}
