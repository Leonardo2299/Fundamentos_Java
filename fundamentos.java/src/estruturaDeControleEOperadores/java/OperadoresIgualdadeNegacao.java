package estruturaDeControleEOperadores.java;

public class OperadoresIgualdadeNegacao {

	public static void main(String[] args) {
		// boolean numerosIguais = 10 == 10;
	    // boolean numerosIguais = (4 + 6) == (5 * 2);

	    int numero1 = 10;
	    int numero2 = 11;
	    // boolean numerosIguais = numero1 == 10;
	    boolean numerosIguais = numero1 == numero2;

	    // boolean numerosDiferentes = !numerosIguais;
	    // boolean numerosDiferentes = !(numero1 == numero2);
	    boolean numerosDiferentes = numero1 != numero2;

	    System.out.printf("N�meros iguais: %b%n", numerosIguais);
	    // System.out.printf("N�meros iguais: %b%n", numero1 == numero2);

	    System.out.printf("N�meros diferentes: %b%n", numerosDiferentes);

	    //Para comparar Strings existe uma outra maneira. Essa n�o � acomselh�vel
	    String nome1 = "Thiago";
	    String nome2 = "Miguel";
	    boolean nomesIguais = nome1 == nome2;
	    System.out.printf("Nomes iguais: %b%n", nomesIguais);
	  }

	}
