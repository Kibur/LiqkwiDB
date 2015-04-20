/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liqkwidb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author manuel
 */
public class StreamGobbler extends Thread {
    private InputStream inputStream;
    private String type;
    private String data = "";

    public StreamGobbler(InputStream inputStream, String type) {
        this.inputStream = inputStream;
        this.type = type;
    }

    @Override
    public void run() {
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String line = null;
            
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(type + " > " + line);
                
                data += line + "\n";
            }
        } catch (IOException ex) {
            Logger.getLogger(StreamGobbler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String getData() {
        return this.data;
    }
}
