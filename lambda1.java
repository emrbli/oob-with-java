/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lamdaexpression;

/**
 *
 * @author Kemal
 */
public class Lamdaexpression {
     interface lambda{
         int calistir(int x,int y);
     }
     interface lambda2 {
         int calistir(int x);
     }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String s="deneme";
        System.out.println(s.charAt(3));
        //s.charAt(3)='k';  burada stringin 3. karakterini değiştirmek istedik.
        //fakat değişmez çünkü java da stringler immutable(değiişmez) dır.
        
        lambda l = (x,y)-> x * y;
        lambda2 l2=(x)-> x*x;
        System.out.println(l.calistir(5,6));
        System.out.println(l2.calistir(8));
        
    }
    
}
