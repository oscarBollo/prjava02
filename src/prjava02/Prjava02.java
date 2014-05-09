package prjava02;

import java.io.*; import java.net.*;

public class Prjava02 {
    public static void main(String[] args){
        try {
            InetAddress addr = InetAddress.getLocalHost(); byte[] ipAddr = addr.getAddress();
            String hostname = addr.getHostName(); System.out.println("hostname="+hostname);
            System.out.println("Nom de l'usuari: " + System.getProperty("user.name"));
            System.out.println("Carpeta Personal: " + System.getProperty("user.home"));
            System.out.println("Sistema operatiu: " + System.getProperty("os.name"));
            System.out.println("Versió OS: " + System.getProperty("os.version"));
            System.out.println("Afegint codi a la branca01 del projecte prjava02");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}