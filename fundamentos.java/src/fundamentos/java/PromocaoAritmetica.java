package fundamentos.java;

public class PromocaoAritmetica {

	public static void main(String[] args) {
		int x = 10;
	    long y = 5;
	    // int z = x * y; // não compila
	    long z = x * y;
	    System.out.println(z);
	    
	    
	    //O ponto flutuante tem mais importancia na operacao
	    long a = 10;
	    float b = 9.34f;
	    // long z = x * y; // não compila
	    float c = a * b;
	    System.out.println(z);

	    
	    int e = 3;
	    int f = 2;

	    // float g = e / f; // atribui 1.0
	    // float g = (float) (e / f); // atribui 1.0
	    float g = e / (float) f; // atribui 1.5
	    System.out.println(z);

	    
	    //Desafio
	    int idade1 = 30;
	    int idade2 = 40;
	    int idade3 = 60;

	    float idadeMedia = ((float) idade1 + (float) idade2 + (float) idade3) / 3;

	    System.out.println("Idade média: " + idadeMedia);
	}

}
