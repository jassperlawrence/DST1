/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dstuto1;

/**
 *
 * @author Jassper
 */
public  class SmartPhone implements Comparable<SmartPhone>{   
    
    protected String name ;
    protected double cost;

    public SmartPhone(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }
   
    public int compareTo(SmartPhone a){
        if(this.cost==a.cost){
            return 0;
        }
        else 
            return this.cost>a.cost?1:-1;
        
    }

    

    

    

    
}
