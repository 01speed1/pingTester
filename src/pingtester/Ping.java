/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pingtester;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Oscar
 */
public class Ping {
    
    private String url = "www.xvideos.com";
    private String response = "";

    public Ping( ) {
    makePing();
    }
    
    public Ping( String url ) {  
        this.url = url;
        makePing();
    }
    
    private void makePing() {
         try {
            Runtime r = Runtime.getRuntime();
            Process p = r.exec("ping "+ this.url);

            BufferedReader in = new BufferedReader(new
            InputStreamReader(p.getInputStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                System.out.println(inputLine);
                this.response += inputLine;
            }
            in.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }
    
    public String showResponse () {
        return this.response;
    }
    
}
