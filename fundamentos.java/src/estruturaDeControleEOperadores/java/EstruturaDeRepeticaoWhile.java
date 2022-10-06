package estruturaDeControleEOperadores.java;

import java.util.Scanner;

public class EstruturaDeRepeticaoWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

	    System.out.print("Peso m�ximo da aeronave: ");
	    int pesoMaximo = entrada.nextInt();

	    int pesoTotalPassageiros = 0;
	    boolean incluirNovoPassageiro = true;

	    
	    // while (true) {
	    
	  //USADO PARA RODAR ENQUANTO A EXPRESS�O BOOLEANA FOR VERDADEIRA
	    while (pesoTotalPassageiros <= pesoMaximo && incluirNovoPassageiro) {
	      System.out.print("Peso do passageiro: ");
	      int pesoPassageiro = entrada.nextInt();

	      pesoTotalPassageiros += pesoPassageiro;

	      System.out.print("Incluir novo passageiro? ");
	      incluirNovoPassageiro = entrada.nextBoolean();
	    }

	    System.out.printf("Peso m�ximo da aeronave: %d kg%n", pesoMaximo);
	    System.out.printf("Peso total dos passageiros: %d kg%n", pesoTotalPassageiros);
	    System.out.printf("Situa��o da aeronave: %s%n", 
	        pesoTotalPassageiros > pesoMaximo ? "peso excedido" : "liberada");
	  }

	}