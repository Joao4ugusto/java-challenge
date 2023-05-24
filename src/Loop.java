import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double media = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while ( nota != -1){
            System.out.println("Digite uma avaliação ou -1 para terminar");
            nota = leitura.nextDouble();
            if(nota != -1){
                media += nota / 3;
                totalDeNotas++;
            } else if (nota == -1) {
                System.out.println("Sua nota foi zero!!");
                break;
            }

        }

        System.out.println(media);
    }
}
