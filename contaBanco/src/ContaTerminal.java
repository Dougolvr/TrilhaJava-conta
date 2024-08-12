import java.util.Scanner;

public class ContaTerminal {
        // TO DO: conhecer e importar a classe Scanner

        // Exibir as mensagens para nosso usuario

        // Obter pela scanner os valores digitados no terminal

        // Exibir a mensagem conta criada
//---------------------------------------------------------------

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero da conta: ");
        int Numero = scanner.nextInt();

        System.out.println("Digite o numero da agência: ");
        String Agencia = scanner.next();

        String NomeCliente = "Douglas Oliveira";
        Double Saldo = 237.48;

        System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é a " + Agencia + ", conta " + Numero + ". Seu saldo de R$" + Saldo + " já está disponível para saque.");

        scanner.close();
    }
}
