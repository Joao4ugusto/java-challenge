public class MinhaClasse {
    public static void main(String[]  args) {
        String PrimeiroNome = "João";
        String SegundoNome = "Augusto";

        System.out.println(NomeCompleto(PrimeiroNome, SegundoNome));
    }
    public static String NomeCompleto(String PrimeiroNome, String SegundoNome){
        return "Nome da pessoa é: " + PrimeiroNome.concat(" ").concat(SegundoNome);
    }
}