import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Connessioni {
    private static Connessioni instance = null;
    List<ThreadConnessione> ListaClient = new ArrayList<ThreadConnessione>();
    Logger logger;
    FileHandler fileHandler;

    private Connessioni() {
        logger = Logger.getLogger("LogConnections");
        try {
            fileHandler = new FileHandler("log/LogConnections.log");
            logger.addHandler(fileHandler);
            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);
            logger.info("Avvio gestione connessioni");
        } catch (Exception e) {
            e.printStackTrace();
        }
         
    }

    public static Connessioni getInstance() {
        if (instance == null) {
            instance = new Connessioni();
        }
        return instance;
    }
    
    public boolean AddClient(JConnect conn) {
        ThreadConnessione t = new ThreadConnessione(conn);
        boolean b = ListaClient.add(t);
        t.start();
        return b;
    }
    
    public void RemoveClient(ThreadConnessione conn){
        ListaClient.remove(conn);
    }

    public void ClientEndConnection(ThreadConnessione conn) {
        ListaClient.remove(conn);
        try {
            conn.connessioneClient.socket.close();
            System.out.println("Chiusura client " + conn.connessioneClient.getId());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}