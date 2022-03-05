public class Questao1 {

    public static void main(String[] args) {

        /* Questão 01 - A mediana de uma lista de números é basicamente o elemento que se encontra no meio da lista após a ordenação.
        Dada uma lista de números com um número ímpar de elementos, desenvolva um algoritmo que encontre a mediana.*/

        int[] arr = {9, 2, 1, 4, 6};

        System.out.print("Array antes da ordenação: ");
        for (int x : arr) {
            System.out.printf(x + " ");
        }

        // Chamada para o método ordemCrescente
        ordemCrescente(arr);

        System.out.print("\nArray depois da ordenação: ");
        for (int x : arr) {
            System.out.printf(x + " ");
        }

        //Chamada para o método que calcula a mediana e o imprima o resultado no console
        System.out.printf("\nMediana: " + calcularMediana(arr));

    }

    // Método que recebe um array como parametro e o ordena do menor para o maior
    public static void ordemCrescente(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    // Método que recebe um array como parametro, calcula a mediana e retorna o resultado
    public static int calcularMediana(int[] arr) {
        int posicaoNumero = ((arr.length + 1) / 2) - 1;
        int mediana = arr[posicaoNumero];
        return mediana;
    }
}
