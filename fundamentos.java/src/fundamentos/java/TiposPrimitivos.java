package fundamentos.java;

public class TiposPrimitivos {

	public static void main(String[] args) {
		//Exemplo boolean
		boolean compraAprovada = true;
	    boolean clienteBloqueado = false;

	    System.out.println(compraAprovada);
	    System.out.println(clienteBloqueado);


	    int quantidadeEstoque = 10;
	    int quantidadePedidoCompra = 15;

	    boolean estoqueSuficiente = quantidadeEstoque >= quantidadePedidoCompra;
	    System.out.println("Estoque suficiente: " + estoqueSuficiente);
	    
	    
	    //Exemplo byte
	    byte idade = 127; // valor máximo
	    // byte idade2 = 128; // não compila

	    short quantidadeEstoque1 = 32767; // valor máximo
	    // short quantidadeEstoque2 = 32768; // não compila
	    
	    
	    //Exemplo char
	    
	    // char inicialDoNome = "T"; // não compila
	    char teclaASC = 65;  //vai imprimir a letra A
	    char inicialDoNome = 'T';
	    char tipoCliente = '2';
	    char simbolo = '@';

	    System.out.println(teclaASC);
	    System.out.println(inicialDoNome);
	    System.out.println(tipoCliente);
	    System.out.println(simbolo);
	    
	    
	    //Exemplo de Int
	    int populacaoUberlandia = 699_097;    //O _ serve para separar visualmente o número

	    // int populacaoUberlandia2 = 2_147_483_648; // não compila, pois passou do máximo
	    int populacaoUberlandia2 = 2_147_483_647;
	    
	    
	    //Exemplo Long
	    
	    long populacaoUberlandia3 = 699_097;

	    long populacaoUberlandia4 = 2_147_483_648L;

	    // System.out.println(2_147_483_648); // não compila, pois entende que a variável é um inteiro
	    System.out.println(2_147_483_648L); //compila, pois no long tem que colocar o L no final 

	    
	    //Exemplo Float e Double
	    
	    double peso = 84.9d; // "d" é opcional
	    System.out.println(peso);

	    // float taxa = 1_294.93; // não compila
	    float taxa = 1_294.93f;  // tem que colocar o f no final
	    System.out.println(taxa);
	    
	}

}
