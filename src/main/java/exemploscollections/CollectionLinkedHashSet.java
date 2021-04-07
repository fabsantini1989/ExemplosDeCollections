package exemploscollections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class CollectionLinkedHashSet {

    public static void main(String[] args) {

        // Cria uma LinkedHashSet
        LinkedHashSet<String> nome = new LinkedHashSet<>();

        // Adiciona os números no set por meio do método .add();
        nome.add("Fabiano");
        nome.add("Giulia");
        nome.add("Maycon");
        nome.add("Eduardo");
        nome.add("Erick");

        System.out.println(nome + "\n"); // Vai printar da forma que foi inserido.

        // Remove o número do set por meio do método .remove();
        nome.remove("Maycon");
        System.out.println("LinkedHashSet com a remoção do Maycon: ");
        System.out.println(nome + "\n");

        // Retorna a quantidade de itens do set por meio do método .size();
        System.out.println("Quantidade de ítens no LinkedHashSet: " + nome.size());

        // Navega em todos os itens do iterator;
        System.out.println("-----------------------------");
        System.out.println("-- NAVEGAÇÃO PELO ITERATOR --");

        Iterator<String> iterator = nome.iterator();
        while (iterator.hasNext()) {
            System.out.println(" " + iterator.next());
        }
        System.out.println("-----------------------------");

        // Navega nos itens do set pelo for:
        System.out.println("---- NAVEGAÇÃO PELO FOR -----");
        for (String aluno: nome) {
            System.out.println(" " + aluno);
        }
        System.out.println("-----------------------------");

        // Verifica se o set está vazio ou não;
        System.out.println("SET LIMPO? " + nome.isEmpty());

        // Retorna quantos ítens tem no set;
        System.out.println("QUANTIDADE DE ITENS NO SET: " + nome.size());

        // Limpa o set através do método .clear();
        nome.clear();
        System.out.println("Após o método clear, o set foi limpo? " + nome.isEmpty() + ".");
        System.out.println(nome);   // Após o clear, a impressão retornada é [] pois o set estará limpo;

    }
}
