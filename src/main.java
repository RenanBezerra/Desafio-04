import herança.Veiculo;

class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Veiculo v1 = new herança.Veiculo("General Motors","Spin","ELW4025","branca", 15.00f, 30.00  );
		Veiculo v2 = new Veiculo();
//		v1.ligar();
//		v1.pintar("azul");
//		
//		
//		v1.abastecer(80);
//		System.out.println("----------------------");
//
		v1.status();
//		System.out.println("----------------------");
		v2.status();
	}
	
}


