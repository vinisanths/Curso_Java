package DataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/**
 * Classe de exemplo para manipulação e formatação de datas e horas em Java.
 * Utiliza as classes LocalDate, LocalDateTime e Instant para representar diferentes formas de data e hora.
 * Também demonstra o uso de diferentes formatadores para conversão e exibição de datas.
 */
public class DataHoraExemplo2 {
    public static void main(String[] args) {
        // Criando objetos de data e hora utilizando a classe LocalDate e LocalDateTime
        // A classe LocalDate representa apenas a data (ano, mês e dia) sem informações de horário.
        LocalDate d01 = LocalDate.parse("2025-02-04"); // Criando uma data específica

        // A classe LocalDateTime representa data e horário (ano, mês, dia, hora, minuto, segundo)
        LocalDateTime d02 = LocalDateTime.parse("2025-02-04T01:30:26"); // Criando uma data e hora específicas

        // A classe Instant representa um instante no tempo, baseado no fuso horário UTC (tempo universal coordenado)
        Instant d03 = Instant.parse("2025-02-04T01:30:26Z"); // Criando um instante de tempo no formato UTC

        // Criando diferentes formatadores para exibição personalizada das datas e horários
        DateTimeFormatter formatador1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Formato de data dia/mês/ano
        DateTimeFormatter formatador2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); // Formato com data e hora

        // Formatador que considera o fuso horário do sistema do usuário
        DateTimeFormatter formatador3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        // Formatador no padrão ISO para data e hora (ex: 2022-02-04T01:30:26)
        DateTimeFormatter formatador4 = DateTimeFormatter.ISO_DATE_TIME;

        // Formatador para instantes no formato ISO padrão (ex: 2025-02-04T01:30:26Z)
        DateTimeFormatter formatador5 = DateTimeFormatter.ISO_INSTANT;

        // Exibindo os valores formatados das datas e horários utilizando os formatadores criados
        System.out.println("Data formatada (dd/MM/yyyy): " + d01.format(formatador1));
        System.out.println("Data formatada (dd/MM/yyyy) - outra forma: " + formatador1.format(d01));
        System.out.println("Data formatada diretamente (dd/MM/yyyy): " + d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println("Data e hora formatadas (dd/MM/yyyy): " + d02.format(formatador1));
        System.out.println("Data e hora formatadas (dd/MM/yyyy HH:mm): " + d02.format(formatador2));
        System.out.println("Data e hora formatadas (ISO_DATE_TIME): " + d02.format(formatador4));

        // Exibição de instantes de tempo levando em consideração diferentes fusos horários
        System.out.println("Instante formatado no fuso horário de Londres: " + formatador2.format(d02));
        System.out.println("Instante formatado no fuso horário do sistema: " + formatador3.format(d03));
        System.out.println("Instante formatado (ISO_INSTANT): " + formatador5.format(d03));
        System.out.println("Instante como string padrão ISO 8601: " + d03.toString());
    }
}
