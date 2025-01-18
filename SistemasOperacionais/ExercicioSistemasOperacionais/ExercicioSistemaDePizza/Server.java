package ExercicioSistemasOperacionais.ExercicioSistemaDePizza;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try{
            ServerSocket serverSocket = new ServerSocket(6013);
            System.out.println("Servidor ouvindo a porta 6013");

            while(true){
                Socket cliente = serverSocket.accept();
                System.out.println("Cliente conectado: "+cliente);

                ObjectOutputStream saida =  new ObjectOutputStream(cliente.getOutputStream());
                saida.flush();
                saida.writeObject(new java.util.Date().toString());

                saida.close();
                cliente.close();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
