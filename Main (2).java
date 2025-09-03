/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    
	    System.out.print("Digite o primeiro número: ");
	    int numero1 = scanner.nextInt();
	    
	    System.out.print("Digite o primeiro número: ");
	    int numero2 = scanner.nextInt();
	    
	    int subtracao = numero1 - numero2;
	    int multiplicacao = numero1 * numero2;
	    int divisao = numero1 / numero2;
	    
	    System.out.println("A subtração do primeiro numero pelo segundo é: " + subtracao);
	    System.out.println("A multiplicacao dos dois número é: " + multiplicacao );
	    System.out.println("A divisao do primero numero pelo segundo é: " + divisao);
	
	}
}