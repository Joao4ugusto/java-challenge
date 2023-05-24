import java.util.Scanner;

public class BankGR {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("**************************************");
        System.out.println("Fazendo cadastro dos dados do cliente!");
        String nome;
        String tipoDeConta;
        double saldoInicial = 0;

        System.out.println("Digite seu nome:");
        nome = leitor.nextLine();
        System.out.println("Qual conta você deseja ter, corrente ou poupança?");
        tipoDeConta = leitor.nextLine();
        System.out.println("Quanto de saldo inicial você deseja ter?");
        saldoInicial = leitor.nextDouble();

        System.out.println();
        System.out.println("**************************************");
        System.out.println("Dados iniciais do cliente");
        System.out.println();
        System.out.println();
        System.out.println("Nome: " + nome);
        System.out.println("Tipo da conta: " + tipoDeConta);
        System.out.println("Saldo inicial: " + saldoInicial);
        System.out.println("**************************************");
        System.out.println();
        System.out.println();

        int acoes = 0;

        while (acoes < 4) {
            System.out.println();
            System.out.println("Operações");
            System.out.println();
            System.out.println("1 - consultar saldo");
            System.out.println("2 - receber dinheiro");
            System.out.println("3 - transferir dinheiro");
            System.out.println("4 - sair");
            System.out.println();
            int opcao;
            System.out.println("Digite uma opção:");
            opcao = leitor.nextInt();

            if (opcao == 1) {
                System.out.println("Nome: " + nome);
                System.out.println("Tipo da conta: " + tipoDeConta);
                System.out.println("Saldo: " + saldoInicial);
            } else if (opcao == 2) {
                System.out.println("Quanto você deseja receber: ");
                double receber = leitor.nextDouble();
                saldoInicial += receber;
                System.out.println("Você recebeu: " + receber);
                System.out.println("Seu saldo é de: " + saldoInicial);
            } else if (opcao == 3) {
                System.out.println("Quanto você deseja pagar: ");
                double pagar = leitor.nextDouble();
                if(pagar > saldoInicial){
                    System.out.println("Você não pode fazer esse pagamento!");
                } else {
                    saldoInicial -= pagar;
                    System.out.println("Você pagou: " + pagar);
                    System.out.println("Seu saldo é de: " + saldoInicial);
                }
            } else if (opcao == 4) {
                System.out.println("Você escolheu sair!");
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
                continue;
            }

            acoes++;
            if (acoes == 4) {
                System.out.println("Limite de ações atingido. Encerrando o programa.");
                break;
            }
        }
    }
}

