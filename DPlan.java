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
public class DPlan extends ISP {

    protected double speed , GB;

    public DPlan(double speed, double GB, String name) {
        super(name);
        this.speed = speed;
        this.GB = GB;
    }
    
    public double cost(){
        return ((speed*10)+(0.2*GB));
    }
    
    public String plan(){
        return "Plan : DPlanwith price RM: "+cost();
    }
    
}
