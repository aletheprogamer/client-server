package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("server");

        ServerSocket ss = new ServerSocket(3000);
        Socket s = ss.accept();

        
        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);

        String testo;

        while (true) {
            testo = in.readLine();
        
            if (testo == null) {
                break; 
            }
        
            if (testo.equalsIgnoreCase("exit")) {
                break; 
            }
            System.out.println(testo.toUpperCase());
        }
        s.close();
    }
}
            
