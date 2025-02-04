package DataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * Classe de exemplo para conversão de datas entre diferentes fusos horários e manipulação de datas e horas.
 * Demonstra como converter um Instant (UTC) para datas e horas em diferentes fusos horários.
 */
public class DataHoraExemplo03 {
    public static void main(String[] args) {

        // Criando objetos de data e hora a partir de strings formatadas no padrão ISO 8601
        LocalDate d01 = LocalDate.parse("2025-02-04"); // Apenas a data (ano, mês, dia)
        LocalDateTime d02 = LocalDateTime.parse("2025-02-04T01:30:26"); // Data e hora (ano, mês, dia, hora, minuto, segundo)
        Instant d03 = Instant.parse("2025-02-04T01:30:26Z"); // Instante de tempo no formato UTC (Tempo Universal Coordenado)

        // Convertendo um Instant (UTC) para a data local no fuso horário do sistema do usuário
        LocalDate resultado1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());

        // Convertendo um Instant (UTC) para a data local no fuso horário de Portugal
        LocalDate resultado2 = LocalDate.ofInstant(d03, ZoneId.of("Portugal"));

        // Convertendo um Instant (UTC) para data e hora no fuso horário do sistema do usuário
        LocalDateTime resultado3 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());

        // Convertendo um Instant (UTC) para data e hora no fuso horário de Portugal
        LocalDateTime resultado4 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));

        // Exibindo os resultados das conversões de fuso horário
        System.out.println("Data no fuso horário do sistema: " + resultado1);
        System.out.println("Data no fuso horário de Portugal: " + resultado2);
        System.out.println("Data e hora no fuso horário do sistema: " + resultado3);
        System.out.println("Data e hora no fuso horário de Portugal: " + resultado4);

        // Extraindo partes específicas da data (dia, mês, ano)
        System.out.println("Dia da data d01: " + d01.getDayOfMonth());
        System.out.println("Mês da data d01: " + d01.getMonthValue());
        System.out.println("Ano da data d01: " + d01.getYear());

        // Extraindo partes específicas da hora (hora, minuto)
        System.out.println("Hora da data d02: " + d02.getHour());
        System.out.println("Minuto da data d02: " + d02.getMinute());
    }
}
