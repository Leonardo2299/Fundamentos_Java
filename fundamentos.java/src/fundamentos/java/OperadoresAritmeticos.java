package fundamentos.java;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		int minhaIdade = 40;
	    int suaIdade = 25;

	    // Adi��o
	    int totalIdades = minhaIdade + suaIdade + 100;
	    System.out.println("Soma das idades: " + totalIdades);

	    // Subtra��o
	    int diferencaIdades = minhaIdade - suaIdade;
	    System.out.println("Diferen�a das idades: " + diferencaIdades);

	    // Multiplica��o
	    int dobroDaIdade = 2 * suaIdade;
	    System.out.println("Dobro da sua idade: " + dobroDaIdade);

	    // Divis�o
	    int metadeDaIdade = suaIdade / 2;
	    System.out.println("Metade da sua idade: " + metadeDaIdade);

	    // M�dulo
	    int restoDivisao = 7 % 2;
	    System.out.println("Resto da divis�o (m�dulo): " + restoDivisao);
	    
		int quantidadeProdutos = 10;

	    // Isso aqui:
	    // quantidadeProdutos = quantidadeProdutos + 3;

	    // � o mesmo que isso aqui:
	    quantidadeProdutos += 3;

	    // quantidadeProdutos -= 3;
	    // quantidadeProdutos *= 3;
	    // quantidadeProdutos /= 2;
	    // quantidadeProdutos %= 4;
	    System.out.println(quantidadeProdutos);

	}

}
