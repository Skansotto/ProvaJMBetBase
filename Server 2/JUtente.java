import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JUtente {
    
    JConnect connessioneClient;

    String nome;
    String cognome;
    String eta;
    String numeroCarta;
    int numeroCrediti;

    List<JScommesse> partiteGiocate = new ArrayList<>();

    public JUtente(JConnect connessioneClient, String nome, String cognome, String eta, String numeroCarta,
            int numeroCrediti) {
        this.connessioneClient = connessioneClient;
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.numeroCarta = numeroCarta;
        this.numeroCrediti = numeroCrediti;
    }

    public void println(String messaggio){
        connessioneClient.out.println(messaggio);
    }

    public String AttendiRispota(){
        String messaggio = "Messaggio non ricevuto";

        try {
            messaggio = connessioneClient.in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return messaggio;
    }

    //Getters and setters
    public JConnect getConnessioneClient() {
        return connessioneClient;
    }

    public void setConnessioneClient(JConnect connessioneClient) {
        this.connessioneClient = connessioneClient;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEta() {
        return eta;
    }

    public void setEta(String eta) {
        this.eta = eta;
    }

    public String getNumeroCarta() {
        return numeroCarta;
    }

    public void setNumeroCarta(String numeroCarta) {
        this.numeroCarta = numeroCarta;
    }

    public int getNumeroCrediti() {
        return numeroCrediti;
    }

    public void setNumeroCrediti(int numeroCrediti) {
        this.numeroCrediti = numeroCrediti;
    }

    public List<JScommesse> getPartiteGiocate() {
        return partiteGiocate;
    }

    public void setPartiteGiocate(List<JScommesse> partiteGiocate) {
        this.partiteGiocate = partiteGiocate;
    }
}
