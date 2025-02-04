package DataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataHoraExemplo1 {
    public static void main(String[] args) {

        // Definição de formatadores para datas e horas personalizadas
        DateTimeFormatter formatador01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatador02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        // Obtendo a data e hora atuais do sistema
        LocalDate d01 = LocalDate.now(); // Data atual sem horário
        LocalDateTime d02 = LocalDateTime.now(); // Data e hora atuais
        Instant d03 = Instant.now(); // Data e hora atuais em UTC

        // Criando datas e horários a partir de Strings formatadas no padrão ISO 8601
        LocalDate d04 = LocalDate.parse("2022-07-20"); // Data sem horário
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:25"); // Data e hora
        Instant d06 = Instant.parse("2022-07-20T01:30:25Z"); // Data e hora em UTC
        Instant d07 = Instant.parse("2022-07-20T01:30:25-03:00"); // Data e hora com fuso horário GMT-3

        // Criando datas e horários a partir de Strings formatadas com os formatadores personalizados
        LocalDate d08 = LocalDate.parse("20/07/2025", formatador01); // Data no formato dd/MM/yyyy
        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", formatador02); // Data e hora formatadas

        // Criando datas e horários manualmente informando ano, mês, dia, hora e minutos
        LocalDate d10 = LocalDate.of(2025, 7, 2); // Data específica sem horário
        LocalDateTime d11 = LocalDateTime.of(2025, 7, 2, 16, 55); // Data e hora específicas

        // Exibição dos valores das variáveis de data e hora
        System.out.println("Data atual (sem horário): " + d01);
        System.out.println("Data e hora atuais: " + d02);
        System.out.println("Data e hora atuais em UTC: " + d03);
        System.out.println("Data específica (ISO 8601): " + d04);
        System.out.println("Data e hora específicas (ISO 8601): " + d05);
        System.out.println("Data e hora em UTC (ISO 8601): " + d06);
        System.out.println("Data e hora com fuso horário GMT-3 (ISO 8601): " + d07);
        System.out.println("Data específica formatada (dd/MM/yyyy): " + d08);
        System.out.println("Data e hora formatadas (dd/MM/yyyy HH:mm): " + d09);
        System.out.println("Data criada manualmente: " + d10);
        System.out.println("Data e hora criadas manualmente: " + d11);
    }
}
