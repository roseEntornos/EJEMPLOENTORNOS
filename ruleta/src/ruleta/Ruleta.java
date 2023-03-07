/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ruleta;


import java.io.*;
import java.util.Scanner;


public class Ruleta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int premios[]={0, 50,-1,0,0,100,-1,-1,75,0};       
	int tirada=3;
	int premio=0;   
	
	
	
		do{
			do{
				System.out.println("\nAnota la tirada:");
				tirada=sc.nextInt();
			}while (tirada<1 || tirada >=10);
			tirada--;             
			if (premios[tirada]==-1)
				System.out.println("\n Repite tu tirada");
		}
		while (tirada>0);
			                    
		System.out.println(" has ganado:" + premios[tirada]);
			
                  
			
    
    }
}
