package estruturaDeControleEOperadores.java;

import java.util.Scanner;

public class EstruturaSwitch1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
/*
	    System.out.print("Avalie o nosso atendimento (1 a 5): ");
	    int nota = entrada.nextInt();

	    String descricaoNota;

	    switch (nota) {
	      case 1:
	        descricaoNota = "Muito ruim";
	        break;
	      case 2:
	        descricaoNota = "Ruim";
	        break;
	      case 3:
	        descricaoNota = "Razo�vel";
	        break;
	      case 4:
	        descricaoNota = "Muito bom";
	        break;
	      case 5:
	        descricaoNota = "Excelente";
	        break;
	      default:
	        descricaoNota = "Op��o inv�lida";
	        break;
	    }
	    System.out.printf("Sua nota foi: %d - %s%n", nota, descricaoNota);
	   
	    */
		

		/*
	    //Outro exemplo
	    System.out.print("Digite um dia da semana (ex: seg, ter, qua, etc): ");
	    String diaSemana = entrada.nextLine();
	    String horarioFuncionamento;

	    switch (diaSemana) {
	      case "seg":
	        horarioFuncionamento = "Fechado";
	        break;
	      case "ter":
	      case "qua":
	      case "qui":
	      case "sex":
	        horarioFuncionamento = "08:00 �s 18:00";
	        break;
	      case "sab":
	      case "dom":
	        horarioFuncionamento = "08:00 �s 12:00";
	        break;
	      default:
	        horarioFuncionamento = "Dia inv�lido";
	    }
	    
	    System.out.printf("Hor�rio de funcionamento: %s%n", horarioFuncionamento);
	   */
	    
		
	
		/*
	    System.out.print("Dia da semana (ex: seg, ter, qua, etc): ");
	    String diaSemana2 = entrada.nextLine();
 
	    System.out.print("M�s: ");
	    int mes = entrada.nextInt();

	    System.out.printf("Hor�rio de funcionamento: %s%n", switch (diaSemana2) {
	      case "seg" -> {
	         if (mes == 12) {
	           yield "08:00 �s 16:00";
	         }
	         yield "Fechado";
	      }
	      case "ter", "qua", "qui", "sex" -> "08:00 �s 18:00";
	      case "sab", "dom" -> "08:00 �s 12:00";
	      default -> "Dia inv�lido";
	    });
	    
	    */
		

	    /*
	    String horarioFuncionamento = switch (diaSemana) {
	      case "seg" -> "Fechado";
	      case "ter", "qua", "qui", "sex" -> "08:00 �s 18:00";
	      case "sab", "dom" -> "08:00 �s 12:00";
	      default -> "Dia inv�lido";
	    };
	    */

	    /*
	    String horarioFuncionamento;
	    switch (diaSemana) {
	      case "seg" -> horarioFuncionamento = "Fechado";
	      case "ter", "qua", "qui", "sex" -> horarioFuncionamento = "08:00 �s 18:00";
	      case "sab", "dom" -> {
	        horarioFuncionamento = "08:00 �s 12:00";
	      }
	      default -> horarioFuncionamento = "Dia inv�lido";
	    }
	     */
	    // System.out.printf("Hor�rio de funcionamento: %s%n", horarioFuncionamento);

	  }

	}