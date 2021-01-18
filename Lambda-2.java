/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda2;

import java.util.*;
import static java.util.Collections.list;

/**
 *
 * @author Kemal
 */
public class Lambda2 {

    interface lambda{
    long calistir(long x);
} 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List<Integer> intSeq=Arrays.asList(1,2,3);
        int z=10;
        intSeq.forEach(x-> {
            
            x+=2+z;//10 ile topla
            int y=x+2;
            //burada "intSeq.forEach(System.out::println);" kodunu yazarsam bu lambda içerisinde bir daha print kodu yazmama gerek kalmaz hepsini yazar.
            System.out.println(y);
                });
        List<Integer> list2=Arrays.asList(1,2,3,4);
        int sum = list2.stream().map(x->x*x).reduce((x,y)->x+y).get();
        System.out.println(sum);//1,2,3,4 olarak hepsinin karesini alıp topladı.

//-
        lambda l=(x)-> (long) Math.pow(x,64);
        System.out.println(l.calistir(2));
//-
    }
    
}
