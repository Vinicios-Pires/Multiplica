import java.util.Scanner;

public class App {
    public static void main(String args[]) {
      Scanner numero = new Scanner(System.in);
      System.out.println("Digite o nu3mero que deseja a tabuada.");
          
      int multiplicador = numero.nextInt();
      int resultado;
      
      System.out.println("Tabela de multiplicação de " + multiplicador);
      
      for ( int multiplicado = 0; multiplicado < 11; multiplicado++ ) {
          resultado = multiplicador * multiplicado;
          System.out.println(multiplicador + " x " + multiplicado + " = " + resultado);
      }
    }
}