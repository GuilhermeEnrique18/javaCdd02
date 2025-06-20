import java.util.Scanner;
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String texto;

        System.out.println("Converso de texto para maiúsculas, digite o texto: ");
        texto = sc.nextLine().toUpperCase();

        System.out.println(texto);

    }
}
