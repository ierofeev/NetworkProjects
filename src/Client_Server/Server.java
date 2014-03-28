/*
package Client_Server;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    //private static final Logger LOG = Logger.getLogger(SqServer.class.getName());

    public static void main(String[] args) throws Exception {
         ServerSocket serverSocket = new ServerSocket(11111);

                 Socket socket = serverSocket.accept();
                    serveClient(socket);
    }




    private static void serveClient(Socket socket) throws IOException {
        //LOG.info("Serving client " + socket.getInetAddress());

        InputStream inputStream = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();

        while (true) {
            int request = inputStream.read();
            if (request == -1) {
                break;
            }

            //    LOG.info("Request: " + request);
            outputStream.write(request * request);
            outputStream.flush();
        }
    }
}
*/