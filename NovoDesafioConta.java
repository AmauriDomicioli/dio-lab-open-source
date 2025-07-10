import java.util.Scanner; // Importa a classe Scanner para permitir entrada de dados do usuário

public class ContaTerminal {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do console
        Scanner scanner = new Scanner(System.in);

        // --- 1. Solicitar e ler o número da conta (Inteiro) ---
        System.out.println("Por favor, digite o número da Conta !");
        int numero = scanner.nextInt(); // Lê o próximo número inteiro do terminal

        // Consome a quebra de linha que fica pendente após nextInt()
        // Isso é crucial para que o próximo nextLine() funcione corretamente
        scanner.nextLine(); 

        // --- 2. Solicitar e ler o número da Agência (Texto) ---
        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.nextLine(); // Lê a linha completa do terminal (incluindo espaços)

        // --- 3. Solicitar e ler o Nome do Cliente (Texto) ---
        System.out.println("Por favor, digite o Nome do Cliente !");
        String nomeCliente = scanner.nextLine(); // Lê a linha completa do terminal

        // --- 4. Solicitar e ler o Saldo (Decimal) ---
        System.out.println("Por favor, digite o Saldo inicial !");
        double saldo = scanner.nextDouble(); // Lê o próximo número decimal do terminal

        // Fecha o objeto Scanner para liberar recursos
        scanner.close();

        // --- Exibir a mensagem final com as informações concatenadas ---
        // Podemos concatenar Strings usando o operador '+' ou o método .concat()
        String mensagem = "Olá ".concat(nomeCliente)
                               .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
                               .concat(agencia)
                               .concat(", conta ")
                               .concat(String.valueOf(numero)) // Converte int para String
                               .concat(" e seu saldo R$")
                               .concat(String.format("%.2f", saldo)) // Formata o double para 2 casas decimais
                               .concat(" já está disponível para saque.");

        System.out.println(mensagem);

        // Alternativamente, usando apenas o operador '+' (mais comum e legível):
        // System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
        //                    + agencia + ", conta " + numero + " e seu saldo R$" 
        //                    + String.format("%.2f", saldo) + " já está disponível para saque.");
    }
}
