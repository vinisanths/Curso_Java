package DataHora;

import java.sql.SQLOutput;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * Classe de exemplo para manipulação de datas e duração de tempo em Java.
 * Demonstra operações com LocalDate, LocalDateTime e Instant, incluindo adição e subtração de dias.
 * Também utiliza a classe Duration para calcular a diferença entre datas.
 */
public class DataHoraExemplo4 {
    public static void main(String[] args) {

        // Criando instâncias de datas usando LocalDate, LocalDateTime e Instant
        LocalDate d01 = LocalDate.parse("2025-02-04"); // Data sem horário
        LocalDateTime d02 = LocalDateTime.parse("2025-02-04T01:30:26"); // Data com horário
        Instant d03 = Instant.parse("2025-02-04T01:30:26Z"); // Instante de tempo em UTC

        System.out.println("Data Referençia: " + d01);

        // Subtraindo e adicionando 7 dias a uma data LocalDate
        LocalDate semanaPassadaLocalDate = d01.minusDays(7);
        LocalDate proximaSemanaLocalDate = d01.plusDays(7);

        System.out.println("Data há 7 dias atrás (LocalDate): " + semanaPassadaLocalDate);
        System.out.println("Data daqui a 7 dias (LocalDate): " + proximaSemanaLocalDate);

        // Subtraindo e adicionando 7 dias a uma data LocalDateTime
        LocalDateTime semanaPassadaLocalDateTime = d02.minusDays(7);
        LocalDateTime proximaSemanaLocalDateTime = d02.plusDays(7);

        System.out.println("Data há 7 dias atrás (LocalDateTime): " + semanaPassadaLocalDateTime);
        System.out.println("Data daqui a 7 dias (LocalDateTime): " + proximaSemanaLocalDateTime);

        // Subtraindo e adicionando 7 dias a um instante de tempo Instant (UTC)
        Instant semanaPassadaInstant = d03.minus(7, ChronoUnit.DAYS);
        Instant proximaSemanaInstant = d03.plus(7, ChronoUnit.DAYS);

        System.out.println("Instante há 7 dias atrás (Instant): " + semanaPassadaInstant);
        System.out.println("Instante daqui a 7 dias (Instant): " + proximaSemanaInstant);

        // Calculando a diferença entre datas usando Duration
        Duration duracao01 = Duration.between(semanaPassadaLocalDate.atStartOfDay(), d01.atStartOfDay());
        System.out.println("Duração entre datas (LocalDate) em dias: " + duracao01.toDays());

        Duration duracao02 = Duration.between(semanaPassadaLocalDateTime, d02);
        System.out.println("Duração entre datas (LocalDateTime) em dias: " + duracao02.toDays());

        Duration duracao03 = Duration.between(semanaPassadaInstant, d03);
        System.out.println("Duração entre datas (Instant) em dias: " + duracao03.toDays());

        // Exemplo de duração negativa ao inverter os parâmetros
        Duration duracao04 = Duration.between(d03, semanaPassadaInstant);
        System.out.println("Duração negativa entre datas (Instant) em dias: " + duracao04.toDays());
    }
}
