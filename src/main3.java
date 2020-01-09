import aula3.Aviao;
import aula3.Caminhao;
import aula3.Carro;

public class main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro c1 = new Carro();
		Carro c2 = new Carro("Fit","Honda","efr4987","cinza",10000,false,40,0,40.9,4,2017);
		Aviao a1 = new Aviao();
		Aviao a2 = new Aviao("771","boing","7654rfde","braca",210000,false,1000,0,500000,"grande","comercial");
		Caminhao ca1 = new Caminhao();
		Caminhao ca2 = new Caminhao("S10","Ford","ret5421","vermelho",1000000,false,60,0,350000,4500,6);
		
		c1.abastecer(40);
		a1.abastecer("40");
		ca1.abastecer(43.4f);
		ca2.acelerar();
		ca2.acelerar();
		c1.ligar();
		
		
		c1.status();
		System.out.println("-------------------------------");
		c2.status();
		System.out.println("-------------------------------");
		a1.status();
		System.out.println("-------------------------------");
		a2.status();
		System.out.println("-------------------------------");
		ca1.status();
		System.out.println("-------------------------------");
		ca2.status();
		System.out.println("-------------------------------");
	}

}
