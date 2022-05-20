import java.time.Clock;
import java.time.LocalDateTime;

public class DataHora {

  public static void main(String[] args) {
    String explicacao = "representa o instante atual em relação ao fuso horário \ndo computador que está executando o programa ";
    
    Clock relogio = Clock.systemDefaultZone();
    System.out.println(relogio.instant()); // UTC: Tempo Universal Coordenado, fuso horário de referência pelo qual se calculam todas as outras zonas horárias do mundo.

    System.out.println(explicacao + relogio); // fuso horário não brasileiro

    
    LocalDateTime now = LocalDateTime.now();
    System.out.println(now); // fuso horário brasileiro
    
    now.adjustInto(now);
    System.out.println("adjustInto " + now);
    
    LocalDateTime diaSofrimento = LocalDateTime.parse("2014-07-08T17:00:00");
    System.out.println("Dia do sofrimento: " + diaSofrimento);

  }

}
