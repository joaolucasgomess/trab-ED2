import java.util.Random;

public class Insercoes {

    public int[] insersaoVetor(int tamanhoVetor){
        Random random = new Random();

        int[] vetorInsersaoOrdenada = new int[tamanhoVetor];
        long inicioOrdenado = System.nanoTime();
        
        for(int i = 0; i < tamanhoVetor; i++){
            vetorInsersaoOrdenada[i] = i;
        }
        
        long fimOrdenado = System.nanoTime();
        long tempoExecucaoOrdenado = fimOrdenado - inicioOrdenado;


        int[] vetorInsersaoInversamenteOrdenada = new int[tamanhoVetor];     
        long inicioInversamenteOrdenada = System.nanoTime();

        for(int i = (tamanhoVetor - 1); i >= 0; i--){
            vetorInsersaoInversamenteOrdenada[i] = i;
        }

        long fimInversamenteOrdenada = System.nanoTime();
        long tempoExecucaoInversamenteOrdenada = fimInversamenteOrdenada - inicioInversamenteOrdenada;


        int[] vetorInsersaoAleatoria = new int[tamanhoVetor];     
        long inicioAleatorio = System.nanoTime();

        for(int i = 0; i < tamanhoVetor; i++){
            vetorInsersaoAleatoria[i] = random.nextInt((tamanhoVetor - 1) - 0) + 0;
        }

        long fimAleatorio = System.nanoTime();
        long tempoExecucaoAleatorio = fimAleatorio - inicioAleatorio;

            
        System.out.println("Vetores " + tamanhoVetor + " elemetos: ");
        System.out.println("Tempo final de insercao ordenada vetor " + tamanhoVetor + " elementos em nanosegundos: " + tempoExecucaoOrdenado);
        System.out.println("Tempo final de insercao inversamente ordenada vetor " + tamanhoVetor + " elementos em nanosegundos: " + tempoExecucaoInversamenteOrdenada);
        System.out.println("Tempo final de insercao aleatoria vetor " + tamanhoVetor + " elementos em nanosegundos: " + tempoExecucaoAleatorio);
        System.out.println();

        return vetorInsersaoAleatoria;
    }

    public Arvore insersaoArvore(int tamanhoArvore){
        Random random = new Random();

        Arvore arvoreInsersaoOrdenada = new Arvore();
        long inicioOrdenado = System.nanoTime();
        
        for(int i = 0; i < tamanhoArvore; i++){
            arvoreInsersaoOrdenada.inserir(i);
        }
        
        long fimOrdenado = System.nanoTime();
        long tempoExecucaoOrdenado = fimOrdenado - inicioOrdenado;

        Arvore arvoreInsersaoInversamenteOrdenada = new Arvore();    
        long inicioInversamenteOrdenada = System.nanoTime();

        for(int i = (tamanhoArvore - 1); i >= 0; i--){
            arvoreInsersaoOrdenada.inserir(i);
        }

        long fimInversamenteOrdenada = System.nanoTime();
        long tempoExecucaoInversamenteOrdenada = fimInversamenteOrdenada - inicioInversamenteOrdenada;


        Arvore arvoreInsersaoAleatoria = new Arvore();     
        long inicioAleatorio = System.nanoTime();

        for(int i = 0; i < tamanhoArvore; i++){
            arvoreInsersaoAleatoria.inserir(random.nextInt((tamanhoArvore - 1) - 0) + 0);
        }

        long fimAleatorio = System.nanoTime();
        long tempoExecucaoAleatorio = fimAleatorio - inicioAleatorio;

            
        System.out.println("Arvores " + tamanhoArvore + " elemetos: ");
        System.out.println("Tempo final de insercao ordenada arvore " + tamanhoArvore + " elementos em nanosegundos: " + tempoExecucaoOrdenado);
        System.out.println("Tempo final de insercao inversamente ordenada arvore " + tamanhoArvore + " elementos em nanosegundos: " + tempoExecucaoInversamenteOrdenada);
        System.out.println("Tempo final de insercao aleatoria arvore " + tamanhoArvore + " elementos em nanosegundos: " + tempoExecucaoAleatorio);
        System.out.println();

        return arvoreInsersaoAleatoria;
    }

    public AVLTree insersaoAVL(int tamanhoAVL){
        Random random = new Random();

        AVLTree AVLInsersaoOrdenada = new AVLTree();
        long inicioOrdenado = System.nanoTime();
        
        for(int i = 0; i < tamanhoAVL; i++){
            AVLInsersaoOrdenada.insert(i);
        }
        
        long fimOrdenado = System.nanoTime();
        long tempoExecucaoOrdenado = fimOrdenado - inicioOrdenado;

        AVLTree AVLInsersaoInversamenteOrdenada = new AVLTree();    
        long inicioInversamenteOrdenada = System.nanoTime();

        for(int i = (tamanhoAVL - 1); i >= 0; i--){
            AVLInsersaoOrdenada.insert(i);
        }

        long fimInversamenteOrdenada = System.nanoTime();
        long tempoExecucaoInversamenteOrdenada = fimInversamenteOrdenada - inicioInversamenteOrdenada;


        AVLTree AVLInsersaoAleatoria = new AVLTree();     
        long inicioAleatorio = System.nanoTime();

        for(int i = 0; i < tamanhoAVL; i++){
            AVLInsersaoAleatoria.insert(random.nextInt((tamanhoAVL - 1) - 0) + 0);
        }

        long fimAleatorio = System.nanoTime();
        long tempoExecucaoAleatorio = fimAleatorio - inicioAleatorio;

            
        System.out.println("AVLs " + tamanhoAVL + " elemetos: ");
        System.out.println();
        System.out.println("Tempo final de insercao ordenada AVL " + tamanhoAVL + " elementos em nanosegundos: " + tempoExecucaoOrdenado);
        System.out.println("Tempo final de insercao inversamente AVL arvore " + tamanhoAVL + " elementos em nanosegundos: " + tempoExecucaoInversamenteOrdenada);
        System.out.println("Tempo final de insercao aleatoria AVL " + tamanhoAVL + " elementos em nanosegundos: " + tempoExecucaoAleatorio);
        System.out.println();

        return AVLInsersaoAleatoria;
    }
}