package tamanhos;

public class TamanhoDePecas {
	public stativ void main(String [] args) {
		String sigla = "M";//Insere o valor a o objeto
		
		switch (sigla) {
		case "P":{
			System.out.println("Pequeno");
			break;//para o codigo na execução
		}
		case "M":{
			System.out.println("Medio");
			break;
		}
		case "G":{
			System.out.println("Grande");
			break
		}
		default:
			System.out.println("Indefinido");
		}
	}
}
