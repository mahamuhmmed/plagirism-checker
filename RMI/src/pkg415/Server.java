/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg415;



import java.net.ServerSocket;
import java.net.Socket;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


/**
 *
 * @author wifi
 */
public class Server {
    Server(){
        try {
            Registry registry=java.rmi.registry.LocateRegistry.createRegistry(1099);
            ServerSocket server = new ServerSocket(9090);
            while (true) {
                Socket socket = server.accept();
                ClientThread thread = new ClientThread(socket,registry);
                thread.start();
            }

            
            
           
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        new Server();
    }
}
