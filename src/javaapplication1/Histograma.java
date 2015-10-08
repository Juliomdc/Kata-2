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
class Histograma {
    int[] elVector;

    Histograma(int[] elVector) {
        this.elVector = elVector;
    }
    
    public HashMap<Integer,Integer> getHisto(){
        HashMap<Integer,Integer> history = new HashMap<>();
        for(int i:elVector){
            if(!history.containsKey(elVector[i])){
                history.put(elVector[i],0);
            }
            history.put(elVector[i],history.get(elVector[i])+1);
        }
        return history;
    }
    
}
