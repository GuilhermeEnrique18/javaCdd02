import java.util.Scanner;
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um texto para contar a quantidade de palavras: \n");
        String textoDigitado = sc.nextLine().trim();
        String[] palavras = textoDigitado.split("\\s+");

        if (textoDigitado.isEmpty()){
            System.out.println("Nenhuma palavra.");

        }else{
            System.out.println("O seu texto possui " + palavras.length + " palavras.");
        }


    }
}
