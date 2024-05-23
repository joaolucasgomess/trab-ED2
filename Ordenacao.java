public class Ordenacao {

    public int[] selectionSort(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            int menor = vetor[i];
            int indiceMenor = i;
            for (int j = i; j < vetor.length; j++) {
                if (menor > vetor[j]) {
                    menor = vetor[j];
                    indiceMenor = j;
                }
            }
        vetor[indiceMenor] = vetor[i];
        vetor[i] = menor;
        }

        return vetor;
    }

    public int[] bubbleSort(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            boolean trocado = false;
            for (int j = 0; j < vetor.length - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                    trocado = true;
                }
            }
            if (!trocado) {
                break;
            }
        }
        return vetor;
    }

    public int[] mergeSort(int[] vetor) {
        if (vetor.length <= 1) {
            return null; 
        }

        int meio = vetor.length / 2;
        int[] vetorEsquerda = new int[meio];
        int[] vetorDireita = new int[vetor.length - meio];

        for (int i = 0; i < meio; i++) {
            vetorEsquerda[i] = vetor[i];
        }
        for (int i = 0; i < vetor.length-meio; i++) {
            vetorDireita[i] = vetor[i+meio];
        }

        mergeSort(vetorEsquerda);
        mergeSort(vetorDireita);

        int[] vetorOrdenado = merge(vetorEsquerda, vetorDireita, vetor);
        return vetorOrdenado; 
    }

    public int[] merge(int[] vetorEsquerda, int[] vetorDireita, int[] vetor) {
        int indiceEsq = 0;
        int indiceDir = 0;
        int indiceVetor = 0;

        while (indiceEsq < vetorEsquerda.length && indiceDir < vetorDireita.length) {
            if (vetorEsquerda[indiceEsq] < vetorDireita[indiceDir]) {
                vetor[indiceVetor++] = vetorEsquerda[indiceEsq++];
            }else{
                vetor[indiceVetor++] = vetorDireita[indiceDir++];
            }
        }
        
        while(indiceEsq < vetorEsquerda.length){
            vetor[indiceVetor++] = vetorEsquerda[indiceEsq++];
        }
        while(indiceDir < vetorDireita.length){
            vetor[indiceVetor++] = vetorDireita[indiceDir++];
        }

        return vetor;
    }
}