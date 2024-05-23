public class Arvore{
   private No raiz;

   public void inserir(int valor){
    if(raiz == null){
        this.raiz = new No(valor);
    }else{
        inserir(valor, raiz);
    }
   }

   private void inserir(int valor, No raiz){
    if(valor < raiz.getValor()){
        if(raiz.getEsquerda() == null){
            raiz.setEsquerda(new No(valor));
        }else{
            inserir(valor, raiz.getEsquerda());
        }
    }
    if(valor >= raiz.getValor()){
        if(raiz.getDireita() == null){
            raiz.setDireita(new No(valor));
        }else{
            inserir(valor, raiz.getDireita());
        }
    }
   }

    public int buscarPrimeiroElemento() {
        if (this.raiz == null) {
            return -1;
        }
        No atual = this.raiz;
        while (atual.getEsquerda() != null) {
            atual = atual.getEsquerda();
        }
        return atual.getValor();
    }

    public int buscarUltimoElemento() {
        if (raiz == null) {
            return -1;
        }

        No noAtual = raiz;
        while (noAtual.getDireita() != null) {
            noAtual = noAtual.getDireita();
        }

        return noAtual.getValor();
    }

    public int buscarElemento(int valor) {
        if (raiz == null) {
            return -1;
        }

        return buscarElemento(valor, raiz);
    }

    private int buscarElemento(int valor, No raiz) {
        if (raiz == null) {
            return -1;
        } else if (raiz.getValor() == valor) {
            return this.raiz.getValor();
        } else if (valor < raiz.getValor()) {
            return buscarElemento(valor, raiz.getEsquerda());
        } else {
            return buscarElemento(valor, raiz.getDireita());
        }
    }

    public int buscarElementoCentral() {
        if (raiz == null) {
            return -1;
        }

        return buscarElementoCentral(raiz);
    }

    private int buscarElementoCentral(No raiz) {
        if (raiz.getEsquerda() == null && raiz.getDireita() == null) {
            return raiz.getValor();
        }

        int alturaEsquerda = this.getAltura(raiz.getEsquerda());
        int alturaDireita = this.getAltura(raiz.getDireita());

        if (alturaEsquerda == alturaDireita) {
            return raiz.getValor();
        } else if (alturaEsquerda > alturaDireita) {
            return buscarElementoCentral(raiz.getEsquerda());
        } else {
            return buscarElementoCentral(raiz.getDireita());
        }
    }

     private int getAltura(No no) {
        if (no == null) {
            return 0;
        } else {
            int alturaEsquerda = getAltura(no.getEsquerda());
            int alturaDireita = getAltura(no.getDireita());

            if (alturaEsquerda > alturaDireita) {
                return alturaEsquerda + 1;
            } else {
                return alturaDireita + 1;
            }
        }
    }
}