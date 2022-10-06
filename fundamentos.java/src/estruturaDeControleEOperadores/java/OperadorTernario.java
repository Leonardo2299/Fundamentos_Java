package estruturaDeControleEOperadores.java;

public class OperadorTernario {

	public static void main(String[] args) {
		 char tipoNotaFiscal = 'P';
		    double totalFaturado = 1200.30;

		    /*
		    double valorImpostos;
		    if (tipoNotaFiscal == 'S') {
		      valorImpostos = totalFaturado * 0.16;
		    } else {
		      valorImpostos = totalFaturado * 0.35;
		    }
		    */

		    // double valorImpostos = tipoNotaFiscal == 'S' ? totalFaturado * 0.16 : totalFaturado * 0.35;

		    
		    //Se tipoNotaFiscal = S, então o imposto é 0.16, se não vai ser 0.35
		    double taxaImpostos = tipoNotaFiscal == 'S' ? 0.16 : 0.35;
		    double valorImpostos = totalFaturado * taxaImpostos;

		    System.out.printf("Total faturado: R$%.2f%n", totalFaturado);
		    System.out.printf("Valor dos impostos: R$%.2f%n", valorImpostos);
		  }

		}