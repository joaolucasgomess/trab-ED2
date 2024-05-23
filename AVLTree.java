public class AVLTree {
    private AVLNode root;

    public AVLTree() {
        root = null;
    }

    public void insert(int key) {
        root = insert(root, key);
    }

    private AVLNode insert(AVLNode node, int key) {
        if (node == null) {
            return new AVLNode(key);
        }

        if (key < node.key) {
            node.left = insert(node.left, key);
        } else if (key > node.key) {
            node.right = insert(node.right, key);
        } else {
            return node;
        }

        node.height = 1 + Math.max(getHeight(node.left), getHeight(node.right));

        int balance = getBalance(node);

        if (balance > 1 && key < node.left.key) {
            return rightRotate(node);
        }

        if (balance < -1 && key > node.right.key) {
            return leftRotate(node);
        }

        if (balance > 1 && key > node.left.key) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        if (balance < -1 && key < node.right.key) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    private AVLNode rightRotate(AVLNode y) {
        AVLNode x = y.left;
        AVLNode z = x.right;
        x.right = y;
        y.left = z;
        y.height = 1 + Math.max(getHeight(y.left), getHeight(y.right));
        x.height = 1 + Math.max(getHeight(x.left), getHeight(x.right));
        return x;
    }

    private AVLNode leftRotate(AVLNode x) {
        AVLNode y = x.right;
        AVLNode z = y.left;
        y.left = x;
        x.right = z;
        x.height = 1 + Math.max(getHeight(x.left), getHeight(x.right));
        y.height = 1 + Math.max(getHeight(y.left), getHeight(y.right));
        return y;
    }

    private int getHeight(AVLNode node) {
        if (node == null) {
            return 0;
        }

        return node.height;
    }

    private int getBalance(AVLNode node) {
        if (node == null) {
            return 0;
        }

        return getHeight(node.left) - getHeight(node.right);
    }

    public int buscarPrimeiroElemento() {
        if (this.root == null) {
            return -1;
        }
        AVLNode atual = this.root;
        while (atual.left != null) {
            atual = atual.left;
        }
        return atual.key;
    }

    public int buscarUltimoElemento() {
        if (root == null) {
            return -1;
        }

        AVLNode noAtual = root;
        while (noAtual.right != null) {
            noAtual = noAtual.right;
        }

        return noAtual.key;
    }

    public int buscarElemento(int valor) {
        if (root == null) {
            return -1;
        }

        return buscarElemento(valor, root);
    }

    private int buscarElemento(int valor, AVLNode root) {
        if (root == null) {
            return -1;
        } else if (root.key == valor) {
            return this.root.key;
        } else if (valor < root.key) {
            return buscarElemento(valor, root.left);
        } else {
            return buscarElemento(valor, root.right);
        }
    }

    public int buscarElementoCentral() {
        if (root == null) {
            return -1;
        }

        return buscarElementoCentral(root);
    }

    private int buscarElementoCentral(AVLNode root) {
        if (root.left == null && root.right == null) {
            return root.key;
        }

        int alturaEsquerda = this.getAltura(root.left);
        int alturaDireita = this.getAltura(root.right);

        if (alturaEsquerda == alturaDireita) {
            return root.key;
        } else if (alturaEsquerda > alturaDireita) {
            return buscarElementoCentral(root.left);
        } else {
            return buscarElementoCentral(root.right);
        }
    }

     private int getAltura(AVLNode no) {
        if (no == null) {
            return 0;
        } else {
            int alturaEsquerda = getAltura(no.left);
            int alturaDireita = getAltura(no.right);

            if (alturaEsquerda > alturaDireita) {
                return alturaEsquerda + 1;
            } else {
                return alturaDireita + 1;
            }
        }
    }
}