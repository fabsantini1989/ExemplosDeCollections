package exemploscollections;

import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionTreeSet {

    public static void main(String[] args) {

        TreeSet<String> treeEstados = new TreeSet<>();

        // Monta a árvore com as siglas dos países
        treeEstados.add("ACRE");
        treeEstados.add("ALAGOAS");
        treeEstados.add("AMAPA");
        treeEstados.add("AMAZONAS");
        treeEstados.add("BAHIA");
        treeEstados.add("CEARA");
        treeEstados.add("DISTRITO FEDERAL");
        treeEstados.add("ESPIRITO SANTO");
        treeEstados.add("GOIAS");
        treeEstados.add("MARANHAO");
        treeEstados.add("MATO GROSSO");
        treeEstados.add("MATO GROSSO DO SUL");
        treeEstados.add("MINAS GERAIS");
        treeEstados.add("PARA");
        treeEstados.add("JOAO PESSOA");
        treeEstados.add("PARANA");
        treeEstados.add("PERNAMBUCO");
        treeEstados.add("PIAUI");
        treeEstados.add("RIO DE JANEIRO");
        treeEstados.add("RIO GRANDE DO NORTE");
        treeEstados.add("RONDONIA");
        treeEstados.add("RORAIMA");
        treeEstados.add("SANTA CATARINA");
        treeEstados.add("SAO PAULO");
        treeEstados.add("SERGIPE");
        treeEstados.add("TOCANTINS");

        // Navega em todos os itens do iterator;
        System.out.println("\nUNIDADES FEDERATIVAS DO BRASIL");
        Iterator<String> iterator = treeEstados.iterator();
        while (iterator.hasNext()) {
            System.out.println(" -" + iterator.next());
        }

        // Retorna o Estado de acordo com a ordem binária na árvore;
        System.out.println("\nLISTA DE ESTADOS NA TREESET:\n" + treeEstados + "\n");

        // Retornao primeiro Estado no topo da arvore;
        System.out.println("PRIMEIRO ESTADO NO TOPO DA TREESET:\n"+ treeEstados.first() + "\n");

        // Retorna o ultimo Estado no topo da arvore;
        System.out.println("ULTIMO ESTADO NO TOPO DA TREESET:\n"+ treeEstados.last() + "\n");

        // Retorna o primeiro Estado abaixo do Estado dado como parametro através do método .lower();
        System.out.println("PRIMEIRO ESTADO NA ARVORE ABAIXO DO ELEMENTO SAO PAULO: \n" + treeEstados.lower("SAO PAULO") + "\n");

        // Retorna o primeiro Estado acima do Estado dado como parametro através do método .higher();
        System.out.println("PRIMEIRO ESTADO NA ARVORE ACIMA DO ELEMENTO SAO PAULO: \n" + treeEstados.higher("SAO PAULO")+ "\n");

        // Retorna o primeiro Estado no topo da árvore e remove ele do set por meio do método .pollFirst();
        System.out.println("O PRIMEIRO ESTADO NO TOPO DA ARVORE É : " + treeEstados.pollFirst());

        // Retorna o primeiro Estado no final da árvore e remove ele do set por meio do método .pollLast();
        System.out.println("O PRIMEIRO ESTADO NO FINAL DA ARVORE É : " + treeEstados.pollLast());

        // Verifica, limpa e verifica novamente se a árvore está vazia;
        System.out.println("\nA TREEMAP ESTA VAZIA: " + treeEstados.isEmpty());
        treeEstados.clear();
        System.out.println("A TREEMAP ESTA VAZIA: " + treeEstados.isEmpty());

    }

}