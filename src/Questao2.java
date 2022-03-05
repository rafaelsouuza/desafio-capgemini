public class Questao2 {

    public static void main(String[] args) {

        /*Questão 02 - Dado um vetor de inteiros n e um inteiro qualquer x. Construa um algoritmo que determine o número
        de elementos pares do vetor que tem uma diferença igual ao valor de x.*/

        int[] arr = {1, 5, 3, 4, 2};
        int diferenca = 2;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] - arr[i] == diferenca) {
                    count++;
                }
            }
        }

        System.out.println(count);

    }

}
