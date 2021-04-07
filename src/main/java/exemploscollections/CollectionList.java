package exemploscollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionList {

    public static void main(String[] args) {

        System.out.println(" -- Lista de Compras --");

        // Cria e instancia a ArrayList;
        List<String> compras = new ArrayList<>(); //Em Listas a posição 0 é sempre o primeiro

        // Adiciona nomes à List por meio do método .add();
        compras.add("Feijão");
        compras.add("Arroz");
        compras.add("Açúcar");
        compras.add("Café");
        compras.add("Sal");
        compras.add("Ovos");

        System.out.println(compras + "\n"); // A impressão é feita de acordo com a ordem de inserção( Menor desempenho);

        // O método .contains(), retorna um booleano dizendo se há ou não na lista determinado elemento;
        boolean contemOvos = compras.contains("Ovos");
        System.out.println("A lista contém Ovos? " + contemOvos);
        // ou pode ser feito também da seguinte forma:
        System.out.println("A lista de compras contém Sal? " + compras.contains("Sal") + "\n");

        // O método .size(), retorna o número de elementos que há na lista;
        System.out.println("Há " + compras.size() + " ítens na lista.\n");

        // Cria uma variável e recupera através do método .get(i);
        String item = compras.get(5); // O índice 2 vai retornar, deve instanciar outro objeto
        //* se colocarmos um elemento que não tem posição, por exemplo et(6), ira dar um erro
        //** chamado de "IndexOutOfBoundsException", ou seja, elemento acima do numero da lista.
        System.out.println("Qual o ítem na posicao 5? " + item);

        //O método .indexOf() recebe um elemento e retorna o índice dele. Quando não encontra o elemento,
        // ele retorna o valor -1.
        int indice = compras.indexOf("Ovos");
        System.out.println("Qual a posição do ítem Ovos? " + indice + "\n");

        // Organizando a Lista em Ordem Alfabética por meio do método .sort();
        Collections.sort(compras);
        System.out.println("-- Lista de Compras em Ordem Alfabética --");
        System.out.println(compras + "\n");

        // Alteração do item de acordo por meio do método .set(int i, String e);
        System.out.println("Após a troca do café por óleo de soja: ");
        compras.set(3, "Óleo de Soja"); // set altera o item pela posicao dada, café por óleo de soja;
        System.out.println(compras + "\n");    //vai printar os nomes na ordem do código novamente

        // Remoção de ítens da List por meio do método .remove(i) ou remove(o);
        compras.remove(1); // Remove o elemento do índice 1;
        compras.remove("Ovos"); //remove o objeto Ovos;
        System.out.println("Após a remoção do Arroz e Ovos: ");
        System.out.println(compras + "\n");

        // Para navegar na lista por meio do for;
        System.out.println("----- Navegando por meio do for ----");
        for (String nomeDoItem: compras) {
            System.out.println(" " + nomeDoItem);
        }
        System.out.println("------------------------------------");

        // Para iteirar, além do for, é possível utilizar o iterator que funciona da seguinte forma;
        System.out.println("-- Navegando por meio do Iterator --");
        Iterator<String> iterator = compras.iterator();
        while (iterator.hasNext()) {    //hasNext retorna um booleano true ou false sempre q existir + 1 objeto no
            //interator que so irá retornar false quando passar por todos os elementos da sua coleção.
            System.out.println(" " + iterator.next());   //o método Next retorna o objeto que está iteirando naquele
            //momento, no nosso caso, uma String.
        }

        System.out.println("------------------------------------");

        // O método .isEmpty, retorna um booleando informando se a lista está vazia ou não;
        boolean listaVazia = compras.isEmpty();
        System.out.println("A lista está vazia? " + listaVazia + "\n"); // Retorna false pois não está;

        // O método .clear, limpa a lista;
        System.out.println("Quais ítens na lista agora? \n" + compras);
        compras.clear();
        listaVazia = compras.isEmpty();
        System.out.println("Após a limpeza, a lista ficou vazia? : " + listaVazia);

        System.out.println(compras); //retorna [] devido o método clear ter sido utilizado acima;

    }

}
