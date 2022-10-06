package estruturaDeControleEOperadores.java;

public class CurtoCircuitoOperadoresLogicos {

	public static void main(String[] args) {
		  int x = 10;
		    int y = 20;

		    // boolean resultado = x == 10 && y++ == 20;
		    boolean resultado = x == 15 || y++ == 20;
		    
		    //Quando a primeira expressão já é verdadeira o resto não é verificado

		    System.out.println(resultado);
		    System.out.println(y);
		  }

		}