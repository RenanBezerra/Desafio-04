import aula2.Aviao;
import aula2.Carro;

public class mainex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro c1 = new Carro("zafira", 0, "Renan", 50f,"GM",4,2017);
		c1.status();
		System.out.println("-------------------");
		Aviao a1 = new Aviao("boing", 0,"Pedro", 100f,"grande","comercial");
		a1.status();
		System.out.println("-------------------");
	}

}
