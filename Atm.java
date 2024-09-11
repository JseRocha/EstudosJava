package poupanca;

public class Atm {
	public static void main(String[] args) {
		
		double saldo = 25.0; //valor total do saldo
		double valorSolicitado = 15.50; //Aqui se coloca o valor total do saque
		
		if(valorSolicitado < saldo)
			saldo = saldo - valorSolicitado; //logica de saque, se o valor solicitado é menor que o saque, atualiza o valor do saldo subtraindo o valor do saque
		
		System.out.println(saldo); //Aqui o sistema mostra o saldo final após a transação. 
		
	}
}
