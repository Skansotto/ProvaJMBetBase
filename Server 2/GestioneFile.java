import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class GestioneFile {

    public void creaFile(String nomeUtente) {
        String path = nomeUtente + ".txt";
        try {
            File file = new File(path);
            if (file.exists())
                System.out.println("Il file " + path + " esiste");
            else if (file.createNewFile())
                System.out.println("Il file " + path + " è stato creato");
            else
                System.out.println("Il file " + path + " non può essere creato");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String cercaFile(String nomeUtente) throws IOException {
        String s = "";

        BufferedReader reader = new BufferedReader(new FileReader("Utenti/" + nomeUtente + ".txt"));

        String line = reader.readLine() + ";";

        while (line != null) {
            System.out.println(line);
            line = reader.readLine() + ";";
        }

        reader.close();

        return s;
    }

    public String getNome(String nomeFile) { // attributo: nomeUtente che corrisponde al nome del file personale
        String nome = "";
        return nome;
    }

}
