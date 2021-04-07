package exemploscollections;

import java.util.Map;

public class CollectionHashMap {

    public static void main(String[] args) {

        // Cria um HashMap com os 10 clubes brasileiros e seus títulos internacionais;
        Map<String, Integer> clubesCampeoes = new java.util.HashMap<>();

        // Adicionando os 10 clubes no mapa já instanciado;
        clubesCampeoes.put("São Paulo", 13);        //Adiciona a chave São Paulo e valor 13;
        clubesCampeoes.put("Santos", 9);            //Adiciona a chave Santos e valor 9;
        clubesCampeoes.put("Internacional", 7);     //Adiciona a chave Internacional e valor 7;
        clubesCampeoes.put("Cruzeiro", 7);          //Adiciona a chave Cruzeiro e valor 7;
        clubesCampeoes.put("Grêmio", 6);            //Adiciona a chave Grêmio e valor 6;
        clubesCampeoes.put("Flamengo", 6);          //Adiciona a chave Flamengo e valor 6;
        clubesCampeoes.put("Corinthians", 5);       //Adiciona a chave Corinthians e valor 5;
        clubesCampeoes.put("Vasco", 4);             //Adiciona a chave Vasco e valor 4;
        clubesCampeoes.put("Atlético Mineiro", 4);  //Adiciona a chave Atlético Mineiro e valor 4;
        clubesCampeoes.put("Palmeiras", 3);         //Adiciona a chave Palmeiras e valor 3;

        // Imprimindo o mapa no console;
        System.out.println("Clubes & Número de Campeonatos Internacionais: ");
        System.out.println(clubesCampeoes + "\n");

        // Caso precise pesquisar se o mapa contém determinada chave, utilize o método containsKey();
        // O método containsKey retornará um valor booleano (true ou false) de acordo com a pesquisa.
        System.out.println("São Paulo aparece neste mapa? " + clubesCampeoes.containsKey("São Paulo") + ".");
        System.out.println("Bahia aparece neste mapa? " + clubesCampeoes.containsKey("Bahia") + ".\n");

        // Caso precise pesquisar se o mapa contém determinado valor, utilize o método containsValue();
        System.out.println("Algum clube tem 13 Títulos Internacionais? " + clubesCampeoes.containsValue(13) + ".");
        System.out.println("Algum clube tem 20 Títulos Internacionais? " + clubesCampeoes.containsValue(20) + ".\n");

        // É possível também atualizar o valor para determinadas chaves.
        // Vamos supôr que o Santos tenha ganhado mais um título após a construção do código;
        clubesCampeoes.put("Santos", 10);
        System.out.println(clubesCampeoes); // Note que após a atualização, Santos já aparece com 10.

        // Caso você queira remover um time, basta utilizar o método .remove();
        // Vamos supor que algum outro time tenha superado o décimo colocado, e queremos manter apenas 10 times.
        clubesCampeoes.remove("Palmeiras"); // removendo o Palmeiras;
        System.out.println(clubesCampeoes); // Novo mapa sem o Palmeiras;
        clubesCampeoes.put("Atlético Paranaense", 4); // insere o Clube Atlético Paranaense;
        System.out.println(clubesCampeoes + "\n"); // Novo mapa com o Atlético Paranaense;

        // Para saber o tamanho do mapa, é necessário usar o método .size();
        System.out.println("Qual o tamanho do mapa em questão? " + clubesCampeoes.size() + ".\n");

        // Caso queira navegar pelos ítens do mapa, é possível pelo comando for;
        System.out.println("Clube & Quantidade de Títulos Internacionais:");
        System.out.println("---------------------------------------------");
        for (String navega: clubesCampeoes.keySet()) {
            System.out.println("Clube: " + navega);
            System.out.println("Número de Títulos Internacionais: " + clubesCampeoes.get(navega));
            System.out.println("---------------------------------------------");
        }

        // Limpando o mapa através do método .clear();
        clubesCampeoes.clear(); // Limpa o mapa por completo;
        System.out.println(clubesCampeoes); // Imprime o mapa limpo, ou seja, {};

    }

}
