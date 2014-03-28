/*
package Client_Server;


import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {

    public static void main(String[] args) {

            Socket socket = new Socket("localhost", 11111);

            OutputStream outputStream = socket.getOutputStream();
            outputStream.write(4);
            outputStream.flush();

            InputStream inputStream = socket.getInputStream();
            int response = inputStream.read();

            System.out.println(response);


    }
}
*/
