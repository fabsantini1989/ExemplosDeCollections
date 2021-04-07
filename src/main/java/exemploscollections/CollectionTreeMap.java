package exemploscollections;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class CollectionTreeMap {

    public static void main(String[] args) {

        TreeMap<String, String> treeEstados = new TreeMap<>();

        // Monta a árvore com as siglas dos países
        treeEstados.put("AC", "ACRE");
        treeEstados.put("AL", "ALAGOAS");
        treeEstados.put("AP", "AMAPA");
        treeEstados.put("AM", "AMAZONAS");
        treeEstados.put("BA", "BAHIA");
        treeEstados.put("CE", "CEARA");
        treeEstados.put("DF", "DISTRITO FEDERAL");
        treeEstados.put("ES", "ESPIRITO SANTO");
        treeEstados.put("GO", "GOIAS");
        treeEstados.put("MA", "MARANHAO");
        treeEstados.put("MT", "MATO GROSSO");
        treeEstados.put("MS", "MATO GROSSO DO SUL");
        treeEstados.put("MG", "MINAS GERAIS");
        treeEstados.put("PA", "PARA");
        treeEstados.put("PB", "JOAO PESSOA");
        treeEstados.put("PR", "PARANA");
        treeEstados.put("PE", "PERNAMBUCO");
        treeEstados.put("PI", "PIAUI");
        treeEstados.put("RJ", "RIO DE JANEIRO");
        treeEstados.put("RN", "RIO GRANDE DO NORTE");
        treeEstados.put("RO", "RONDONIA");
        treeEstados.put("RR", "RORAIMA");
        treeEstados.put("SC", "SANTA CATARINA");
        treeEstados.put("SP", "SAO PAULO");
        treeEstados.put("SE", "SERGIPE");
        treeEstados.put("TO", "TOCANTINS");

        System.out.println("A treeMap foi composta pelas seguintes chaves e valores:");
        System.out.println(treeEstados);

        // Retorna a primeira chave no topo da árvore através do método .firstKey();
        System.out.println("\nPRIMEIRA CHAVE NO TOPO DA ARVORE: " + treeEstados.firstKey()); // AC

        // Retorna a última chave no final da árvore através do método .lastKey();
        System.out.println("ULTIMA CHAVE NO FINAL DA ARVORE: " + treeEstados.lastKey());

        // Retorna a primeira chave abaixo da chave parametrizada;
        System.out.println("A CHAVE ABAIXO DE AM NA ARVORE É: " + treeEstados.lowerKey("AM"));

        // Retorna a primeira chave acima da chave parametrizada;
        System.out.println("O ESTADO QUE ESTA ACIMA DE SE NA ARVORE É: " + treeEstados.higherKey("SE"));

        // Retorna a primeira chave e o primeiro valor no topo da árvore.
        // Usar o método .firstEntry().getKey e o método firstEntry().getValue();
        System.out.println("\nA PRIMEIRA CHAVE E O PRIMEIRO VALOR DA ARVORE É:");
        System.out.println(treeEstados.firstEntry().getKey() + " - " + treeEstados.firstEntry().getValue());

        // Navega em todas as chaves do iterator
        System.out.println("\n---- Navegando com iterator---- ");
        Iterator<String> iterator = treeEstados.keySet().iterator();
        while   (iterator.hasNext()) {
            String chave = iterator.next();
            System.out.println(chave + " - " + treeEstados.get(chave));
        }
        System.out.println("----------------------------------");

        // Retorna a primeira chave e primeiro valor no topo da árvore e remove através do método .pollFirstEntry;
        Map.Entry<String, String> firstEntry = treeEstados.pollFirstEntry();

        // Retorna a última chave e ultimo valor da árvore e remove através do método .pollLastEntry;
        Map.Entry<String, String> lastEntry = treeEstados.pollLastEntry();

        // Imprime a TreeMap já com AC e TO removidos;
        System.out.println(treeEstados);





    }

}
