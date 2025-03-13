package Generics_Set_Map.HashCode_Equals.Aplicacao;

import Generics_Set_Map.HashCode_Equals.Entidades.Cliente;

public class Programa {
    public static void main(String[] args) {

        Cliente c1 = new Cliente("Maria", "Maria@gmail.com");
        Cliente c2 = new Cliente("Maria", "Maria@gmail.com");

        String s1 = "teste";
        String s2 = "teste";
        //String s2 = new String("teste"); força a criação de um novo objeto em memória

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));//Compara o conteúdo dos objetos
        System.out.println(c1 == c2);// Compara a referência dos objetos em mémoria
        System.out.println(s1 == s2);



    }
}
