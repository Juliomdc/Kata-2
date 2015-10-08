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
    
    Histogram <Integer> histograma = HistogramBuilder.compuHistory(numeros);
    
   for (Object key : histograma.KeySet()){
            System.out.println(key+" : "+histograma.get(key));
    }


}
