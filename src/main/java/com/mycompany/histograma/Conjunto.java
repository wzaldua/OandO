/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.histograma;

import java.util.Observable;
import java.util.Random;

/**
 *
 * @author f211
 */
public class Conjunto extends Observable{
    int x[];
    private Command buCommand;
    
    public Conjunto(int intQuantity) {
        x=new int[intQuantity];
        Random r=new Random(System.currentTimeMillis());
        for (int i = 0; i < x.length; i++) {
            x[i]=r.nextInt(200);            
        }
    }
    
    public void setCommand(Command command)
    {
        this.buCommand = command;
    }
    
    public void Ordenar()
    {
       buCommand.Execute();
       this.setChanged();
       this.notifyObservers(this.x);
    }
    
    int[] getX() {
        return x;
    }
}
