package exemploscollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionHashSet {

    public static void main(String[] args) {

        Set<Integer> idadeAlunos = new HashSet<>();

        System.out.println("As idades dos alunos do curso de ADS Tarde, terceiro semestre: ");

        //Adiciona as idades dos alunos de ADS ao Set;
        idadeAlunos.add(18);
        idadeAlunos.add(19);
        idadeAlunos.add(20);
        idadeAlunos.add(22);
        idadeAlunos.add(31);
        idadeAlunos.add(34);
        idadeAlunos.add(41);

        // Vai printar a idadeAlunos, no entanto, vai em qualquer ordem.
        //* Isso garante melhor performance, uma vez que a máquina não se preocupará com a ordem, por isso,
        //** o HashSet tem melhor performance.
        System.out.println(idadeAlunos + "\n");

        // Remove determinada idade do Set criado, no caso abaixo o 20.
        idadeAlunos.remove(20); // Se não existir 20, não dará erro, porém nada será feito.
        System.out.println("Idade dos Alunos aplicando o método .remove(20): ");
        System.out.println(idadeAlunos + "\n");

        // Para retornar a quantidade de itens do set, utiliza-se o método .size();
        System.out.println("Quantidade de itens do Set: " + idadeAlunos.size() + "\n");

        // Usando o Iterator para navegar nos ítens do Set;
        Iterator<Integer> iterator = idadeAlunos.iterator();
        while (iterator.hasNext()) {
            System.out.println("Navegação dos ítens por meio do iterator: "+ iterator.next());
        }

        System.out.println(" ");

        // Navegação dos ítens por meio do while;
        for (Integer nota: idadeAlunos) {
            System.out.println("Navegação dos ítens por meio do while: " + nota);
        }

        System.out.println(" ");

        // Retorna se o set está vazio ou não por meio de um boolean, nesse caso vai retornar false pois não está;
        System.out.println("O set está vazio? " + idadeAlunos.isEmpty());

        // Apaga todas as idades registradas no set;
        idadeAlunos.clear();

        // Retorna se o set esta vazio ou não. Como aplicou-se clear acima, vai retornar true.
        System.out.println("O set está vazio? " + idadeAlunos.isEmpty());

        System.out.println(idadeAlunos); // Imprime no console o HashSet já vazio, neste caso, [];

    }

}
