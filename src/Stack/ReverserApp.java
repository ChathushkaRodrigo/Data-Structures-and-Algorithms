package dataStructures.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverserApp {

    public static void main(String[] args) {
        String input,output;

        while (true) {
            System.out.println("Enter a String: ");
            System.out.flush();

            input = getString(); 
            if( input.equals(null)) break;
           
            
            Reverser theReverser = new Reverser(input);
            output = theReverser.doRev(); // use it
            System.out.println(“Reversed: “ + output);
            }
            
            
            
            
            
            
            
            
            // end while
            } // end main()

            public static String getString() throws IOException
            {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String s = br.readLine();
            return s;
            }
            
        }






    
    
    
    
