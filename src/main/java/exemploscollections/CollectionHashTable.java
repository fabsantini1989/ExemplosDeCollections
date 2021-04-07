package exemploscollections;

import java.util.Hashtable;
import java.util.Map;

public class CollectionHashTable {

    public static void main(String[] args) {

        // Cria uma HashTable com dois tipos de variáveis (String e Integer);
        Hashtable<String, Integer> estudantes = new Hashtable<>();

        // Inserção de estudantes e idades por meio do método .put (key,value);
        estudantes.put("Maycon", 21);
        estudantes.put("Giulia", 19);
        estudantes.put("Fabiano", 31);
        estudantes.put("Eduardo", 35);
        estudantes.put("Erick", 22);

        System.out.println("Nome do aluno e sua idade: ");
        System.out.println(estudantes + "\n");

        // Removendo o objeto na HashTable por meio do método .remove();
        System.out.println("Nome do aluno e sua idade");
        estudantes.remove("Erick");
        System.out.println(estudantes + "\n");

        // Cria a variável idadeEstudante e recupera através do método .get();
        int idadeEstudante = estudantes.get("Giulia");
        System.out.println("Idade da aluna Giulia: " + idadeEstudante + "\n");

        // Informando o tamanho da HashTable através do método .size();
        System.out.println("Esta HashTable contém: " + estudantes.size() + " elementos \n");

        // Navegando nos registros do mapa for meio do for;
        System.out.println("---------------");
        System.out.println("NOME  :  IDADE");
        System.out.println("---------------");
        for (String key: estudantes.keySet()) {
            System.out.println(key + " : " + estudantes.get(key));
        }

        System.out.println("---------------");

    }

}
