import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Integer numeroConta;
        String agencia;
        String cliente;
        Float saldo;
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta: ");
        numeroConta = sc.nextInt();
        System.out.println("Por favor, digite o número da agência: ");
        agencia = sc.next();
        System.out.println("Por favor, digite o nome do cliente: ");
        cliente = sc.next();
        System.out.println("Por favor, digite o montante do saldo: ");
        saldo = sc.nextFloat();

        String message = String.format(
                "Olá, %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque.",
                cliente, agencia, numeroConta, saldo);

        System.out.println(message);

    }
}
