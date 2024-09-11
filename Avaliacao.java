package notaAluno;

public class Avaliacao {
	public static void main(String[] args) {
		int nota = 6; //Valor da nota do aluno
		
		if (nota >= 7) //Se a nota for maior igual a 7
			System.out.println("Aprovado!");// ele mostra "Aprovado!"
		
		else if (nota >= 5 && nota < 7)//Condição intermediaria 
			System.out.println ("prova de recuperação");
		
		else//caso a nota for menor que 7
			System.out.println("Reprovado!");//Ele mostra "Reprovado!"
	}
}
