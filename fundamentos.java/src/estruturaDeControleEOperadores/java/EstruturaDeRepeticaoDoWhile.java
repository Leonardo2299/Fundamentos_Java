package estruturaDeControleEOperadores.java;

import java.util.Scanner;

public class EstruturaDeRepeticaoDoWhile {

	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);

		    int quantidadeNumeros = 0;

		    do {
		      System.out.print("Quantidade de n�meros: ");
		      quantidadeNumeros = entrada.nextInt();

		      if (quantidadeNumeros < 6 || quantidadeNumeros > 15) {
		        System.out.println("Quantidade de n�meros deve ser entre 6 e 15.");
		      }
		    } while (quantidadeNumeros < 6 || quantidadeNumeros > 15);

		    int numeroAtual = 1;
		    String numerosEscolhidos = "";

		    do {
		      System.out.printf("N�mero %d/%d: ", numeroAtual, quantidadeNumeros);
		      int numeroEscolhido = entrada.nextInt();

		      if (numeroEscolhido < 1 || numeroEscolhido > 60) {
		        System.out.println("N�mero deve ser de 1 a 60");
		      } else {
		        numerosEscolhidos += numeroEscolhido + " ";
		        numeroAtual++;
		      }
		    } while (numeroAtual <= quantidadeNumeros);

		    System.out.printf("N�meros escolhidos: %s%n", numerosEscolhidos);
		  }

		}