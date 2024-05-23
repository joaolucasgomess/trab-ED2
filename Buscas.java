import java.util.Random;

public class Buscas {

    public void buscaVetor(int[] vetor){
        Random random = new Random();
        long inicioPrimeiroValor = System.nanoTime();

        int primeiroValor = vetor[0];

        long fimPrimeiroValor = System.nanoTime();
        long tempoExecucaoPrimeiroValor = fimPrimeiroValor - inicioPrimeiroValor;

        long inicioUltimoValor = System.nanoTime();

        int ultimoValor = vetor[vetor.length - 1];

        long fimUltimoValor = System.nanoTime();
        long tempoExecucaoUltimoValor = fimUltimoValor - inicioUltimoValor;

        long inicioValorCentral = System.nanoTime();

        int valorCentral = vetor[(vetor.length - 1) / 2];

        long fimValorCentral = System.nanoTime();
        long tempoExecucaoValorCentral = fimValorCentral - inicioValorCentral;

        long inicioValorAleatorio = System.nanoTime();
        int valorBuscado = random.nextInt((vetor.length - 1) - 0) + 0;

        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] == valorBuscado){
                break;
            }
        }

        long fimValorAleatorio = System.nanoTime();
        long tempoExecucaoValorAleatorio = fimValorAleatorio - inicioValorAleatorio;

        long inicioValorInexistente = System.nanoTime();

        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] == 99999){
                break;
            }
        }

        long fimValorInexistente = System.nanoTime();
        long tempoExecucaoValorInexistente = fimValorInexistente - inicioValorInexistente;

        System.out.println("Tempo final de busca primeiro valor em nanosegundos: " + tempoExecucaoPrimeiroValor);
        System.out.println("Tempo final de busca ultimo valor em nanosegundos: " + tempoExecucaoUltimoValor);
        System.out.println("Tempo final de busca valor central em nanosegundos: " + tempoExecucaoValorCentral);
        System.out.println("Tempo final de busca valor aleatorio em nanosegundos: " + tempoExecucaoValorAleatorio);
        System.out.println("Tempo final de busca valor inexistente em nanosegundos: " + tempoExecucaoValorInexistente);
        System.out.println();
    }

    public int buscaBinaria(int[] vetor, int valor){
        int inicio = 0;
        int fim = vetor.length - 1;

        while (inicio <= fim) {
            int meio = inicio + (fim - inicio) / 2;
            int valorMeio = vetor[meio];

            if (valorMeio == valor) {
                return meio;
            } else if (valorMeio < valor) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        return -1;
    }

    public void buscaArvore(Arvore arvore){
        Random random = new Random();
        long inicioPrimeiroValor = System.nanoTime();

        int primeiroValor = arvore.buscarPrimeiroElemento();

        long fimPrimeiroValor = System.nanoTime();
        long tempoExecucaoPrimeiroValor = fimPrimeiroValor - inicioPrimeiroValor;

        long inicioUltimoValor = System.nanoTime();

        int ultimoValor = arvore.buscarUltimoElemento();

        long fimUltimoValor = System.nanoTime();
        long tempoExecucaoUltimoValor = fimUltimoValor - inicioUltimoValor;

        long inicioValorCentral = System.nanoTime();

        int valorCentral = arvore.buscarElementoCentral();

        long fimValorCentral = System.nanoTime();
        long tempoExecucaoValorCentral = fimValorCentral - inicioValorCentral;

        long inicioValorAleatorio = System.nanoTime();
        int valorBuscado = random.nextInt((10000 - 1) - 0) + 0;

        arvore.buscarElemento(valorBuscado);

        long fimValorAleatorio = System.nanoTime();
        long tempoExecucaoValorAleatorio = fimValorAleatorio - inicioValorAleatorio;

        long inicioValorInexistente = System.nanoTime();

        arvore.buscarElemento(999999);

        long fimValorInexistente = System.nanoTime();
        long tempoExecucaoValorInexistente = fimValorInexistente - inicioValorInexistente;

        System.out.println("Tempo final de busca primeiro valor em nanosegundos: " + tempoExecucaoPrimeiroValor);
        System.out.println("Tempo final de busca ultimo valor em nanosegundos: " + tempoExecucaoUltimoValor);
        System.out.println("Tempo final de busca valor central em nanosegundos: " + tempoExecucaoValorCentral);
        System.out.println("Tempo final de busca valor aleatorio em nanosegundos: " + tempoExecucaoValorAleatorio);
        System.out.println("Tempo final de busca valor inexistente em nanosegundos: " + tempoExecucaoValorInexistente);
        System.out.println();
    }

    public void buscaAVL(AVLTree AVL){
        Random random = new Random();
        long inicioPrimeiroValor = System.nanoTime();

        int primeiroValor = AVL.buscarPrimeiroElemento();

        long fimPrimeiroValor = System.nanoTime();
        long tempoExecucaoPrimeiroValor = fimPrimeiroValor - inicioPrimeiroValor;

        long inicioUltimoValor = System.nanoTime();

        int ultimoValor = AVL.buscarUltimoElemento();

        long fimUltimoValor = System.nanoTime();
        long tempoExecucaoUltimoValor = fimUltimoValor - inicioUltimoValor;

        long inicioValorCentral = System.nanoTime();

        int valorCentral = AVL.buscarElementoCentral();

        long fimValorCentral = System.nanoTime();
        long tempoExecucaoValorCentral = fimValorCentral - inicioValorCentral;

        long inicioValorAleatorio = System.nanoTime();
        int valorBuscado = random.nextInt((10000 - 1) - 0) + 0;

        AVL.buscarElemento(valorBuscado);

        long fimValorAleatorio = System.nanoTime();
        long tempoExecucaoValorAleatorio = fimValorAleatorio - inicioValorAleatorio;

        long inicioValorInexistente = System.nanoTime();

        AVL.buscarElemento(999999);

        long fimValorInexistente = System.nanoTime();
        long tempoExecucaoValorInexistente = fimValorInexistente - inicioValorInexistente;

        System.out.println("Tempo final de busca primeiro valor em nanosegundos: " + tempoExecucaoPrimeiroValor);
        System.out.println("Tempo final de busca ultimo valor em nanosegundos: " + tempoExecucaoUltimoValor);
        System.out.println("Tempo final de busca valor central em nanosegundos: " + tempoExecucaoValorCentral);
        System.out.println("Tempo final de busca valor aleatorio em nanosegundos: " + tempoExecucaoValorAleatorio);
        System.out.println("Tempo final de busca valor inexistente em nanosegundos: " + tempoExecucaoValorInexistente);
        System.out.println();
    }
}