import java.util.Scanner;

public class ContaTerminal {
    String nomeCliente;
    int agencia;
    int numero;
    double saldo;

    public static void main(String[] args) {
        ContaTerminal account = new ContaTerminal();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Por favor, digite o nome do cliente: ");
            account.nomeCliente = scanner.nextLine();
            
            System.out.print("Por favor, digite o número da agência: ");
            account.agencia = scanner.nextInt();
            
            System.out.print("Por favor, digite o número da conta: ");
            account.numero = scanner.nextInt();
            
            System.out.print("Por favor, digite o saldo da conta: ");
            account.saldo = scanner.nextDouble();
            
            System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, " +
                    "sua agência é %d, conta %d e seu saldo %.2f já está disponível para saque.%n",
                    account.nomeCliente, account.agencia, account.numero, account.saldo);
        }
    }
}