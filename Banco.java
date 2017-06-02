class Conta{
	int numero;
	Pessoa titular;
	double saldo;
	int agencia;

	void deposita(double valorASerDepositado){
		this.saldo += valorASerDepositado;
	}

	void saca(double valorASerSacado){
		if(this.saldo >= valorASerSacado){
			this.saldo -= valorASerSacado;
		}
	}

	void transfere(double valor, Conta destino){
		this.saldo -= valor;
		destino.saldo += valor;
	}
}

class Pessoa{
	String titular;
	String cpf;
	String dataNascimento;
}

public class Banco{
	public static void main(String[] args){
		Conta mauricio = new Conta();
		mauricio.numero = 123;
		mauricio.saldo = 800.00;
		mauricio.agencia = 842;
		
		mauricio.titular = new Pessoa();
		mauricio.titular.nome = "Mauricio Aniche";
		mauricio.titular.cpf = "123456789";
		mauricio.titular.dataNascimento = "01/01/1975";

		mauricio.deposita(100.00);
		mauricio.saca(200.00);

		Conta guilherme = new Conta();
		guilherme.numero = 456;
		guilherme.saldo = 1200;
		guilherme.deposita(100.00);
		guilherme.saca(200.00);

		System.out.println(mauricio.saldo);
		System.out.println(guilherme.saldo);

		mauricio.transfere(100.00,guilherme);

		System.out.println(mauricio.saldo);
		System.out.println(guilherme.saldo);
	}
}