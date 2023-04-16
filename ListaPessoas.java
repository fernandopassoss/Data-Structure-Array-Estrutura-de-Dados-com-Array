package atvVeV;

public class ListaPessoas {
    private Pessoa[] elementos;
    private int tamanho;

    public ListaPessoas() {
        elementos = new Pessoa[30];
        tamanho = 0;
    }

    public void adicionar(Pessoa pessoa) {
        if (tamanho == elementos.length) {
            Pessoa[] novoArray = new Pessoa[elementos.length * 2];
            for (int i = 0; i < elementos.length; i++) {
                novoArray[i] = elementos[i];
            }
            elementos = novoArray;
        }
        elementos[tamanho] = pessoa;
        tamanho++;
    }
    
    public void remover(int indice) {
        if (indice < 0 || indice >= tamanho) {
            throw new IndexOutOfBoundsException("Índice inválido");
        }
        
        //When removing an element, the others are shifted to 
        //the left and the last one is given value=null
        for (int i = indice; i < tamanho - 1; i++) {
            elementos[i] = elementos[i+1];
        }
        elementos[tamanho-1] = null;
        tamanho--;
    }

    public Pessoa get(int indice) {
        if (indice < 0 || indice >= tamanho) {
            throw new IndexOutOfBoundsException("Índice inválido");
        }
        return elementos[indice];
    }

    public int tamanho() {
        return tamanho;
    }
}
