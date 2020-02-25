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
public class Tarikh {
    
    private int day,month,year;

    public Tarikh(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Day: "+day+" Month: "+month+" Year: "+year+"\n"+day+"/"+month+"/"+year;
    }
    
    
    
}
