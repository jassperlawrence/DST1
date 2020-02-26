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
public class Mplan extends ISP{
    
    protected double speed , GB;

    public Mplan(double speed, double GB, String name) {
        super(name);
        this.speed = speed;
        this.GB = GB;
    }

    
    
    public double cost(){
        return ((speed*5)+(0.8*GB));
    }
    
    public String plan(){
        return "Plan : DPlanwith price RM: "+cost();
    }
    //cheaper 
}
