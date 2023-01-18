public class JScommesse {
    String squadra1;
    String squadra2;
    String squadraPuntata;
    int crediti;

    public JScommesse(String squad1, String squad2, String punt, int crediti){
        this.squadra1 = squad1;
        this.squadra2 = squad2;
        this.squadraPuntata=punt;
        this.crediti = crediti;
    }

    public String getSquadra1() {
        return squadra1;
    }

    public String getSquadra2() {
        return squadra2;
    }

    public String getSquadraPuntata() {
        return squadraPuntata;
    }

    public int getCrediti() {
        return crediti;
    }

    public void setSquadra1(String squadra1) {
        this.squadra1 = squadra1;
    }

    public void setSquadra2(String squadra2) {
        this.squadra2 = squadra2;
    }

    public void setSquadraPuntata(String squadraPuntata) {
        this.squadraPuntata = squadraPuntata;
    }

    public void setCrediti(int crediti) {
        this.crediti = crediti;
    }
    
}