import java.util.Random;
import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(10);
        int chutou = 0;
        int numeroTentativas = 0;

        while(numeroTentativas < 5) {
            System.out.println("Digite um numero entre 1 e 10");
            chutou = leitor.nextInt(10);
            System.out.println("Seu chute foi: " + chutou);
            numeroTentativas++;

            if(chutou == numeroAleatorio){
                System.out.println("Você acertou!");
                break;
            } else if (chutou > numeroAleatorio) {
                System.out.println("Seu chute foi maior do que número aleatório!");
            } else if (chutou < numeroAleatorio) {
                System.out.println("Seu chute foi menor do que número aleatório!");
            } else if (numeroTentativas == 5) {
                System.out.println("Você não conseguiu acertar o número aleatório em até 5 tentativas!!");
            }

        }
    }
}
