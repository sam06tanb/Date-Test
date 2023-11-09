import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {


        LocalDate TempoAgora = LocalDate.now();
        LocalDateTime HoraEtempo = LocalDateTime.now();
        Instant instante = Instant.now();

        DateTimeFormatter FormatarData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate pastWeek = TempoAgora.minusDays(7);

        System.out.println("A data de hoje: " + TempoAgora);
        System.out.println("A data de hoje e a hora: " + HoraEtempo);
        System.out.println("A data de hoje e o Fuso: " + instante);
        System.out.println("Data Formatada: " + TempoAgora.format(FormatarData));
        System.out.println("Passado: " + pastWeek);


    }
}