/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package reemplazacadena;
import java.io.*;
/**
 *
 * @author BEGO
 */
public class ReemplazaCadena {

    /**
     * @param args the command line arguments
     */
  
	static String cad;
	static String primera;
	static String segunda;
	
	public static void main(String[] a) throws IOException {
	
	
		    BufferedReader br=new BufferedReader( new InputStreamReader(System.in)); 
			System.out.println("\nIntroduce la cadena a modificar:");
			cad=br.readLine();
			System.out.println("\nIntroduce la cadena a sustituir:");
			primera=br.readLine();
			System.out.println("\nIntroduce la segunda cadena:");
			segunda=br.readLine();
			
			funcion();
			System.out.println("\nEste es el resultado:"+cad);
	
		}
		
	static void funcion(){
		int n,desde=0;
		String ant,sig;
		
	
			for (;;)
			{
				n=cad.indexOf(primera,desde);
				if (n==-1)
					break;
				ant=cad.substring(0,n);	
				sig=cad.substring(n+primera.length(),cad.length());
				cad=ant+segunda+sig;
                                desde=n+1+segunda.length();
			}	
		
	}
}


