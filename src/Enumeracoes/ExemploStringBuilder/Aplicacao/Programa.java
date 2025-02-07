package Enumeracoes.ExemploStringBuilder.Aplicacao;

import Enumeracoes.ExemploStringBuilder.Entidades.Comentario;
import Enumeracoes.ExemploStringBuilder.Entidades.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Programa {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comentario c1 = new Comentario("Tenha uma Boa viagem!");
        Comentario c2 = new Comentario("Que lugar Incrivel!");

        Post post1 = new Post(sdf.parse("21/06/2024 13:02:2024"),
                "Viajando para a Holanda",
                "Vou visitar este pais Maravilhoso",
                12);
        post1.adicionaComentario(c1);
        post1.adicionaComentario(c2);

        Comentario c3 = new Comentario("Boa Noite");
        Comentario c4 = new Comentario("Que a força esteja com voce");
        Post post2 = new Post(sdf.parse("22/01/2025 14:55:56"),
                "Boa Noite Pessoal",
                "Vejo voces amanha",
                5);
        post2.adicionaComentario(c3);
        post2.adicionaComentario(c4);

        Comentario c5 = new Comentario("Que Legal");
        Comentario c6 = new Comentario("Meus Parabens");

        Post post3 = new Post(sdf.parse("07/02/2025 14:55:59"),
                "Minha nova Certificação",
                "consegui a certificação Cloud Pratictioner!",
                25);
        post3.adicionaComentario(c5);
        post3.adicionaComentario(c6);


        System.out.println("=======================================");
        System.out.print(post1);
        System.out.println("=======================================");
        System.out.print(post2);
        System.out.println("=======================================");
        System.out.print(post3);





    }
}
