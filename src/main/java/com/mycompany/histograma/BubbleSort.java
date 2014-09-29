/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.histograma;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author f211
 */
public class BubbleSort implements Command{
    public int x[];

    BubbleSort(int[] x){
        this.x = x;
    }
    public void BubbleSort(int x[]){
        this.x = x;
    }
    
    @Override
    public void Execute() {
    Boolean b=true;
        for (int i = 0; i < this.x.length; i++) {
            for (int j = i+1; j < this.x.length; j++) {
                if(this.x[i]>this.x[j]){
                    int tmp=this.x[i];
                    this.x[i]=this.x[j];
                    this.x[j]=tmp;                    
                }
                synchronized(b){
                    try {
                        b.wait(5);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Conjunto.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }
    
    public int [] getX()
    {
        return this.x;
    }
       
}
