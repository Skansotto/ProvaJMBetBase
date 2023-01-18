import java.io.IOException;
import java.net.ServerSocket;

public class Server {
    public static void main(String[] args) throws IOException
    {
        final int PORT = 8080;
        ServerSocket serverSocket = new ServerSocket(PORT);

        Connessioni.getInstance();

        ThreadWaitConnessioni x = new ThreadWaitConnessioni(serverSocket);
        x.start();
    }
}
