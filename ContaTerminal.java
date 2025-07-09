import java.util.Locale; // Importa a classe Locale para configurar o formato de números decimais
import java.util.Scanner; // Importa a classe Scanner para entrada de dados via terminal

/**
 * Classe ContaTerminal para simular a criação de uma conta bancária
 * através da entrada de dados via terminal.
 */
public class ContaTerminal {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário.
        // Usa Locale.US para garantir que números decimais sejam lidos com ponto (.)
        // como separador, o que é comum em sistemas e evita problemas de formatação.
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Declaração das variáveis para armazenar os dados da conta
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        // Solicita e lê o número da conta
        System.out.println("Por favor, digite o número da Conta !");
        numero = scanner.nextInt();

        // Consome a quebra de linha pendente após nextInt()
        scanner.nextLine(); 

        // Solicita e lê o número da Agência
        System.out.println("Por favor, digite o número da Agência !");
        agencia = scanner.nextLine();

        // Solicita e lê o nome do Cliente
        System.out.println("Por favor, digite o Nome do Cliente !");
        nomeCliente = scanner.nextLine();

        // Solicita e lê o saldo da conta
        System.out.println("Por favor, digite o Saldo da Conta !");
        saldo = scanner.nextDouble();

        // Fecha o objeto Scanner para liberar os recursos do sistema
        scanner.close();

        // Constrói a mensagem final com os dados inseridos pelo usuário
        // Utiliza String.format para formatar o saldo com duas casas decimais
        String mensagemFinal = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
                             + agencia + ", conta " + numero + " e seu saldo " 
                             + String.format("%.2f", saldo) + " já está disponível para saque.";

        // Exibe a mensagem final no terminal
        System.out.println(mensagemFinal);
    }
}
