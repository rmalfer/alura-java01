class ContaCompara{
	String dono;
	double saldo;
}


public class Compara{

	public static void main(String args[]) {
	    ContaCompara c1 = new ContaCompara();
	    c1.dono = "Duke";
	    c1.saldo = 227;

	    ContaCompara c2 = new ContaCompara();
	    c2.dono = "Duke";
	    c2.saldo = 227;

	    if (c1 == c2) {
	        System.out.println("Contas iguais");
	        //Não funciona, pois objetos instanciados não se comparam
	    }

   	    if (c1.saldo == c2.saldo) {
	        System.out.println("Saldos iguais");
	    }

	    ContaCompara c3 = c1;
	    if (c1 == c3) {
	        System.out.println("Contas iguais");
	        //Agora funciona
	    }

	}
}