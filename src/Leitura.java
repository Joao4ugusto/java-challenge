import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double media = 0;
        double nota = 0;

        for (int i = 0; i < 3 ; i++) {
            System.out.println("Digite uma avaliação de um filme:");
            nota = leitura.nextDouble();
            media += nota / 3;
        }

        System.out.println("Media de avaliações: " + media);

    }
}
