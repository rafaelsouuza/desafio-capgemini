import java.util.Scanner;

public class Questão3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("------Encriptador de Texto----- \nEntre com um texto/frase:");
        String texto = encriptaTexto(sc.nextLine());

        System.out.println(texto);

        sc.close();

    }

    public static String encriptaTexto(String texto) {

        String result = texto.replaceAll(" ", "");          // Retira os espaço em branco do texto
        String arr[] = result.split("");                              // Convertendo o texto é um array

        Long regra = Math.round(Math.ceil(Math.sqrt(arr.length)));         // Regra para calcular a quatidade de linhas x colunas

        String grid[][] = new String[regra.intValue()][regra.intValue()];  // Intanciando uma grid com o tamanho recebido na regra
        int count = 0;

        for (int i = 0; i < regra.intValue(); i++) {
            for (int j = 0; j < regra.intValue(); j++) {
                if (count < result.length()) {
                    grid[i][j] = arr[count];                              // Aqui a grid/matriz é populada com os elementos do vetor
                    count++;
                }
            }
        }

        String encripta = "";

        for (int i = 0; i < regra.intValue(); i++) {
            for (int j = 0; j < regra.intValue(); j++) {
                if (grid[j][i] != null) {
                    encripta += grid[j][i];
                }
            }
            encripta += " ";                                               // Da um espaço quando a coluna chega ao fim
        }

        return encripta.trim();
    }

}
