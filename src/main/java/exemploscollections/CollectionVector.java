package exemploscollections;

import java.util.List;
import java.util.Vector;

public class CollectionVector {

    public static void main(String[] args) {

        List<String> lutas = new Vector<>();

        // Adiciona lutas no vector por meio do método .add();
        lutas.add("TAEKWONDO");
        lutas.add("KARATE");
        lutas.add("MUAY THAI");
        lutas.add("BOXE");
        lutas.add("KUNG FU");
        lutas.add("HAPKIDO");
        lutas.add("KRAV MAGA");
        lutas.add("SUMO");
        lutas.add("JIU JITSU");

        System.out.println("\nCOMPOSICAO DO VECTOR: \n" + lutas + "\n");

        // Navega no vector lutas;
        System.out.println("AS LUTAS DISPONIVEIS SAO:");
        for (String luta: lutas) {
            System.out.println("-" + luta);
        }

        // Altera o elemento da posição 6 para "MMA" por meio do método .set();
        lutas.set (6, "MMA");
        System.out.println("COMPOSIÇÃO ATUAL DO VECTOR: " + lutas);

        // Remove o elemento da posição 2 por meio do método .remove(int i);
        lutas.remove(2);
        System.out.println("COMPOSIÇÃO ATUAL DO VECTOR: " + lutas);

        // Remove o elemento "Karatê" por meio do método .remove(Object o);
        lutas.remove("SUMO");
        System.out.println("COMPOSIÇÃO ATUAL DO VECTOR: " + lutas);

        // Retorna o primeiro ítem do Vector através do método .get(int i);
        System.out.println(lutas.get(0));

    }
}

