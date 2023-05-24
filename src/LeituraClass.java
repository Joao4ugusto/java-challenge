import java.util.Scanner;

public class LeituraClass {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um filme!");
        String filme = leitura.nextLine();
        System.out.println("Digite o ano de lançamento:");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("Qual avaliação você da para esse filme?");
        double avaliacaoFilme = leitura.nextDouble();

        System.out.println();
        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacaoFilme);
    }
}
