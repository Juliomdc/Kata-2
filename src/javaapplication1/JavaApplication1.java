/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.HashMap;

/**
 *
 * @author usuario
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
    Integer[] numeros ={1,4,7,1,1,8,4,1,4,9};
    String[] nombres ={"Ana","Juan","Pedro","Juan"};
    
    Histograma x = new Histograma(numeros);
    
    HashMap <Integer,Integer> pepe = x.getHisto();
    
   for (Integer key : pepe.getKeys()){
            System.out.println(key+" : "+pepe.get(key));
    }


}
