public class Main {
    public static void main(String[] args) {
       int anoDeLancamento = 2023;
       boolean incluidoNoPlano = false;
       double notaDoFilme = 8.1;
       String tipoDoPlano = "Normal";

       if(anoDeLancamento > 2020){
           System.out.println("Filme é novo!");
       } else {
           System.out.println("Filme antigo, vale a pena ver de novo!");
       }
       if(incluidoNoPlano == true || tipoDoPlano.equals("Plus")){
           System.out.println("Você pode olhar o filme!");
       } else {
           System.out.println("Você precisa alugar o filme");
       }
    }
}
