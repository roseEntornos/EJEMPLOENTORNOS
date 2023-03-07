/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package refactorizacion3;


 public class Tarjeta {
 public int numero;
 public String nombre;


 public static int t=5000;
private double saldo; 

 
 public Tarjeta(final String n, final double s){
     nombre=n;
     saldo=s;
     numero=t;
     t++;
 }
 
 
 /** 
  * @param d
  * @return double
  */
 public double sacarDinero(final double d){
     if (d>saldo){
         saldo=0;
         return saldo;
     }
     saldo=saldo-d;
     return d;
 }
 

     
 
 
 
}
