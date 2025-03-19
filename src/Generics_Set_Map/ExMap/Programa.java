package Generics_Set_Map.ExMap;

import java.util.Map;
import java.util.TreeMap;

public class Programa {
    public static void main(String[] args) {

        Map<String, String > cookies = new TreeMap<>();

        cookies.put("username", "maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("telefone", "988475144");

        cookies.remove("email");
        cookies.put("telefone","98885411");

        System.out.println("Contem chave 'telefone': " + cookies.containsKey("telefone"));
        System.out.println("Numero de Telefone: " + cookies.get("telefone"));
        System.out.println("Email: " + cookies.get("email"));
        System.out.println("Tamanho: " + cookies.size());

        System.out.println("Todos os cookies");
        for (String key : cookies.keySet()){
            System.out.println(key + ": " + cookies.get(key));
        }

    }
}
