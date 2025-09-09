/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************//*
Welcome to JDoodle!

You can execute code here in 88 languages. Right now you’re in the Java IDE.

  1. Click the orange Execute button ▶ to execute the sample code below and see how it works.

  2. Want help writing or debugging code? Type a query into JDroid on the right hand side ---------------->

  3.Try the menu buttons on the left. Save your file, share code with friends and open saved projects.

Want to change languages? Try the search bar up the top.
*/
import java.util.Scanner;
public class Main 
{
  public static void main(String args[]) {
     Scanner scanner = new Scanner(System.in);
     
     System.out.print("Qual o seu nome? ");
     String nome = scanner.next();
     
     System.out.print("Qual a sua idade? ");
     int idade = scanner.nextInt();
     
     System.out.print("Qual a sua altura? ");
     double altura = scanner.nextDouble();
     
     System.out.println(nome + " você tem " + idade + " anos e " + altura + " de altura. ");
   

  }
}