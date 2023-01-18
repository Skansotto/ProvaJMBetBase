import java.io.*;
import java.io.PrintWriter;

public class ThreadConnessione extends Thread {
    JConnect connessioneClient;
    boolean isActive = true;
    GestioneFile gestioneFile;

    public ThreadConnessione(JConnect connessioneClient) {
        this.connessioneClient = connessioneClient;
    }

    @Override
    public void run() {
        BufferedReader in = connessioneClient.in;
        PrintWriter out = connessioneClient.out;

        String request;
        String[] parts;

        while (isActive) {
            try {
                if (in.ready()) {
                    request = in.readLine();
                    System.out.println(request);
                    parts = request.split(";");

                    switch (parts[0]) {
                        case "login":
                            // TODO: cercare file con nome utente
                            
                            out.println("LoginCorretto");
                            break;

                        case "iscrizione":
                            // Todo: creazione file
                            gestioneFile.creaFile(parts[1]);
                            out.println("IscrizioneCorretta");
                            break;

                        case "scommessa":
                            out.println("ScommessaEffettuata");
                            break;

                        case "cancellaScommessa":
                            out.println("ScommessaCancellata");
                            break;

                    }
                }
            } catch (IOException e) {
                isActive = false;
                Connessioni.getInstance().ClientEndConnection(this);
            }
        }
    }

}