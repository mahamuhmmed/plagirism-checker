/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg415;

/**
 *
 * @author wifi
 */
import java.rmi.Remote;
import java.rmi.RemoteException;



public interface Service extends Remote {

    
  
    public float check(String original, String check) throws RemoteException;;
  
}
