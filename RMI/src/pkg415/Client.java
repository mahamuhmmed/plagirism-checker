/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg415;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.rmi.Naming;



/**
 *
 * @author wifi
 */
public class Client {



    public static void main(String[] args) throws InterruptedException, IOException {

 
    /*Thread thread = new Thread();
    
    thread.start();*/
    
        Socket socket = new Socket("localhost",9090);
        DataInputStream is = new DataInputStream(socket.getInputStream());
        DataOutputStream os = new DataOutputStream(socket.getOutputStream());
        System.out.println("1");
        try {
            Service s = (Service) Naming.lookup("//localhost/cs");
           // s.check("MahaMuhmmed", "MahaMuhmmed");
            System.out.println("Hi iam a client");
        } catch (Exception e) {
            e.printStackTrace();
        }

/*class ClientThread extends Thread {

    
    public ClientThread() {
        
    }

    @Override
    public void run() {
        
    }
}}*/
}}

