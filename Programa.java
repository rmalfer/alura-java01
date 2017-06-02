public class Programa{
	public static void main(String[] args){
		int idadeJoao = 18;
		int idadeMaria = 21;
		int somaDasIdades = idadeJoao + idadeMaria;
		System.out.println(somaDasIdades);

		float outroNum1 = 2.14f;
		float outroNum2 = (float) 2.15;
		System.out.println("Float:" + outroNum1 + " - " + outroNum2);

		double pi = 3.1415;
		double dobroPi = pi * 2;
		
		System.out.println(dobroPi);

		boolean amigo = true;
		boolean inimigo = false;

		if (amigo)
			System.out.println("Amigo");

		String nome = "Riccardo";
		long grande = 99999999999999999L;
		System.out.println(grande);

		long numero = idadeJoao;
		int copiaDeNumero = (int) numero;
	}
}