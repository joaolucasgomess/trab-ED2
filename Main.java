public class Main{
   public static void main(String[] args){
      Insercoes insercoes = new Insercoes();
      Buscas buscas = new Buscas();
      Ordenacao ordenador = new Ordenacao();

      System.out.println("--------------------------------");
      System.out.println("Insercoes: ");
      System.out.println();
      insercoes.insersaoVetor(100);
      insercoes.insersaoVetor(1000);
      int[] vetor = insercoes.insersaoVetor(10000);

      insercoes.insersaoArvore(100);
      insercoes.insersaoArvore(1000);
      Arvore arvore = insercoes.insersaoArvore(10000);
      
      insercoes.insersaoAVL(100);
      insercoes.insersaoAVL(1000);
      AVLTree AVL = insercoes.insersaoAVL(10000);
      System.out.println("--------------------------------");

      System.out.println("Buscas: ");
      System.out.println();
      System.out.println("Busca Vetores");
      buscas.buscaVetor(vetor);

      System.out.println();
      System.out.println("Busca Arvores");
      buscas.buscaArvore(arvore);

      System.out.println();
      System.out.println("Busca AVLs");
      buscas.buscaAVL(AVL);
      System.out.println("--------------------------------");

      System.out.println();
      System.out.println("Ordenacao e Busca Binaria em vetor ordenado: ");
      System.out.println();
      System.out.println("Selection Sort");
      long inicioSelectionSort = System.nanoTime();

      ordenador.selectionSort(vetor);

      long fimSelectionSort = System.nanoTime();
      long tempoExecucaoSelectionSort = fimSelectionSort - inicioSelectionSort;
      System.out.println("Tempo final de ordenacao selection sort em nanosegundos: " + tempoExecucaoSelectionSort);
      System.out.println();

      System.out.println("Bubble Sort");
      long inicioBubbleSort = System.nanoTime();

      ordenador.bubbleSort(vetor);

      long fimBubbleSort = System.nanoTime();
      long tempoExecucaoBubbleSort = fimBubbleSort - inicioBubbleSort;
      System.out.println("Tempo final de ordenacao bubble sort em nanosegundos: " + tempoExecucaoBubbleSort);
      System.out.println();

      System.out.println("Merge Sort");
      long inicioMergeSort = System.nanoTime();

      ordenador.mergeSort(vetor);

      long fimMergeSort = System.nanoTime();
      long tempoExecucaoMergeSort = fimMergeSort - inicioMergeSort;
      System.out.println("Tempo final de ordenacao merge sort em nanosegundos: " + tempoExecucaoMergeSort);
      System.out.println();
      System.out.println("--------------------------------");

   }
}