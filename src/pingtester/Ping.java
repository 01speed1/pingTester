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

    public Ping() {
    this.response = whileResponse();
   
    }
    
    public Ping( String url ) {  
        this.url = url;
        this.response = whileResponse();
        
    }
    
    public void makePing() {
         try {
             
             this.response = "Cargando";
            Runtime r = Runtime.getRuntime();
            Process p = r.exec("ping "+ this.url);

            BufferedReader in = new BufferedReader(new
            InputStreamReader(p.getInputStream()));
            String inputLine;              
            this.response = "";
            while ((inputLine = in.readLine()) != null) {
                //System.out.println(inputLine);
                this.response += inputLine;
            }
            in.close();           
            
        } catch (IOException e) {
            this.response = "Error w883 in Memory Posic. 34567856x32, You don´t may to be in Porn, do other thing cabron:"  +e;
        }
         
    }
    
    public String showResponse () {
        return this.response;
    }
       
    private String whileResponse(){
        return "Calculando el ping";
    } 
}
