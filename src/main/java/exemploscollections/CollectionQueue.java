package exemploscollections;

import java.util.LinkedList;
import java.util.Queue;

public class CollectionQueue {

    public static void main(String[] args) {

        // Cria e instancia uma LinkediList;
        Queue<String> filaPadaria = new LinkedList<>();

        // Adiciona clientes à Fila por meio do método .add();
        filaPadaria.add("CLIENTE 1");
        filaPadaria.add("CLIENTE 2");
        filaPadaria.add("CLIENTE 3");
        filaPadaria.add("CLIENTE 4");
        filaPadaria.add("CLIENTE 5");
        filaPadaria.add("CLIENTE 6");

        // Mostra a fila da padaria com os 6 clientes;
        System.out.println("FILA DA PADARIA : " + filaPadaria + "\n");

        // Também é possível navegar entre os elementos da fila.
        for (String cliente : filaPadaria) {
            System.out.println("->" + cliente);
        }

        // Adicionando um outro elemento na fila e mostra fila da padaria com o cliente 7;
        filaPadaria.add("CLIENTE 7");
        System.out.println("FILA DA PADARIA : " + filaPadaria + "\n");

        // Método .peek() apenas mostra o primeiro elemento da fila, mas nao remove.
        // System.out.println("PRIMEIRO CLIENTE DA FILA: " + filaPadaria.peek() + "\n");

        System.out.println("TAMANHO DA FILA ATUAL : " + filaPadaria.size() + " CLIENTES.\n");

        // Método .poll() mostra o cabeça da fila e remove, ou seja, o primeiro.
        System.out.println(filaPadaria.poll() + " EM ATENDIMENTO.");
        System.out.println("FILA DA PADARIA : " + filaPadaria + "\n");
        System.out.println(filaPadaria.poll() + " EM ATENDIMENTO.");
        System.out.println("FILA DA PADARIA : " + filaPadaria + "\n");
        System.out.println(filaPadaria.poll() + " EM ATENDIMENTO.");
        System.out.println("FILA DA PADARIA : " + filaPadaria + "\n");
        System.out.println(filaPadaria.poll() + " EM ATENDIMENTO.");
        System.out.println("FILA DA PADARIA : " + filaPadaria + "\n");

        // Método .isEmpty retorna se a fila está vazia ou não com um boolean;
        System.out.println("A FILA ACABOU? " + filaPadaria.isEmpty());

        System.out.println(filaPadaria.poll() + " EM ATENDIMENTO.");
        System.out.println("FILA DA PADARIA : " + filaPadaria + "\n");
        System.out.println(filaPadaria.poll() + " EM ATENDIMENTO.");
        System.out.println("FILA DA PADARIA : " + filaPadaria + "\n");
        System.out.println(filaPadaria.poll() + " EM ATENDIMENTO.");
        System.out.println("FILA DA PADARIA : " + filaPadaria + "\n");

        // Verificando o tamanho da fila atual por meio do método .size();
        System.out.println("TAMANHO DA FILA ATUAL : " + filaPadaria.size() + " CLIENTES.");

        // Método .isEmpty() retorna se a fila está vazia ou não com um boolean;
        System.out.println("A FILA ACABOU? " + filaPadaria.isEmpty());

    }

}


