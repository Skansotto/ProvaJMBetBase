import java.time.LocalDateTime;  

public class JPartite {
    String squadra1;
    String squadra2;
    LocalDateTime dataOra;

    public JPartite(String squad1, String squad2, LocalDateTime dataOra){
        this.squadra1 = squad1;
        this.squadra2 = squad2;
        this.dataOra = dataOra;
    }

    public String getSquadra1() {
        return squadra1;
    }

    public void setSquadra1(String squadra1) {
        this.squadra1 = squadra1;
    }

    public String getSquadra2() {
        return squadra2;
    }

    public void setSquadra2(String squadra2) {
        this.squadra2 = squadra2;
    }

    public LocalDateTime getDataOra() {
        return dataOra;
    }

    public void setDataOra(LocalDateTime dataOra) {
        this.dataOra = dataOra;
    }

}