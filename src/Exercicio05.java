public class Exercicio05 {
    public static void main(String[] args) {

        String[] array = {"a", "vida", "é", "bela"};
        StringBuilder texto = new StringBuilder();
        for(int i = array.length -1; i >= 0; i-- ) {
            texto.append(array[i]).append(" ");
        }
        System.out.println(texto.toString().toUpperCase().trim());

    }
}
