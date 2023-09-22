import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Train {
    public static void main(String[] args) {
        LocalDateTime dt1 = LocalDateTime.now();

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("DIA = " + dt1.format(fmt));
        System.out.println("DIA E HORA = " + dt1.format(fmt1));

        // Obtendo o ZonedDateTime a partir do LocalDateTime usando o ZoneId do sistema
        ZonedDateTime zdt = dt1.atZone(ZoneId.systemDefault());

        // Criando formatters para exibir data e hora com informações de fuso horário
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm Z");
        DateTimeFormatter fmt3 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_INSTANT;

        System.out.println("DIA E HORA COM FUSO HORÁRIO DO SISTEMA = " + zdt.format(fmt2));
        System.out.println("FUSO " + zdt.format(fmt3));
        System.out.println("FUSO " + zdt.format(fmt4));
    }
}
