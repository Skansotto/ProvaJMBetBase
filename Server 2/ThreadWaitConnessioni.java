import java.net.*;

public class ThreadWaitConnessioni extends Thread {
    ServerSocket serverSocket;
    //List<ThreadConnessione> threadList = new ArrayList<ThreadConnessione>();

    public ThreadWaitConnessioni(ServerSocket serverSocket){
        this.serverSocket = serverSocket;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Started waiting on: " + serverSocket);
                Socket ClientSocket = serverSocket.accept();
                System.out.println("Connection accepted: "+ ClientSocket);
                
                Connessioni.getInstance().AddClient(new JConnect("", ClientSocket));

            } catch(Exception e){e.printStackTrace();}
            finally{}
        }
    }
}
