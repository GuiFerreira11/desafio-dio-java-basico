import java.util.Scanner;

/**
 * Classe para receber como input dados de uma conta bancária pelo terminal e
 * imprimir os valores recebidos.
 * 
 * @author Guilherme Ferreira Lemos Pereira
 * @version 0.1
 * @since 21/03/2025
 */
public class ContaTerminal {

  /** Método main a ser executado ao rodar o programa. */
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Por favor, digite o número da conta:");
    int numero = scanner.nextInt();
    System.out.println("Por favor, digite o número da agência:");
    String agencia = scanner.next();
    System.out.println("Por favor, digite o nome do cliente:");
    String nomeCliente = scanner.next();
    System.out.println("Por favor, digite o saldo da conta:");
    Double saldo = scanner.nextDouble();

    System.out.println(
        "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$%.2f já está disponível para saque"
            .formatted(nomeCliente, agencia, numero, saldo));

  }
}
