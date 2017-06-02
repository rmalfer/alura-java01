public class BalancoTrimestral{
	public static void main(String[] args){
		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;
		int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		System.out.println("Gastro Tri: " + gastosTrimestre);

		float mediaMensal = 0;
		mediaMensal = gastosTrimestre / 3;
		System.out.println("Media mensal: " + mediaMensal);

		int i = 150;
		while (i < 300){
			//System.out.println(i);
			i++;			
		}

		int j = 1;
		long soma = 0;
		while (j <= 1000){
			soma = soma + i;
			j++;
		}
		System.out.println("Soma:" + soma);

		//mult3();
		fatorial();
	}

	public static void mult3(){
		
		int numero = 1;
		while (numero <= 100){
			if(numero % 3 == 0) {
 	 			System.out.println(numero); 	 			
 		 	}
 		 	numero++;
 	 	}
	}

	public static void fatorial(){
       long fatorial = (long) 1;
        for (int i = 1; i < 40; i++) {
            fatorial *= i;
            System.out.println("Fatorial de "+i+ " = " +fatorial);
        }
	}
}