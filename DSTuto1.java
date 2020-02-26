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
public class DSTuto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //No.1
        Tarikh a = new Tarikh(05,11,2016);
        System.out.println(a.toString());
        //No.2
        Sentence b= new Sentence ("How are you?");
        System.out.println(b.toString()+"\nThe length of sentence : "+b.length()+"\nThe number of vowels : "+b.vowels()+"\nThe number of words : "+b.words());
        //No.3 T1
        DPlan a = new DPlan (5,50,"5mbps Subscription and 50GB");
        Mplan b = new Mplan(5,50,"5mbps Subscription and 50GB");
        
        System.out.println(a.display());
        System.out.println(a.plan());
        System.out.println(b.plan());
        if(a.cost()<=b.cost()){
            System.out.println("DPlan is cheaper compared to MPlan");
        }
        else
           System.out.println("MPlan is cheaper compared to DPlan"); 
        
        //No.4 T1
        String[]brand={"iPhone","Samsung","Nokia","LG"};
            int[]cost={2400,2200,1400,1800};
            ArrayList<SmartPhone>a1=new ArrayList<SmartPhone>();
            a1.add(new SmartPhone("iPhone",2400));
            a1.add(new SmartPhone("Samsung",2200));
            a1.add(new SmartPhone("Nokia",1400));
            a1.add(new SmartPhone("LG",1800));
            //Unsorted
            System.out.println("List of Smart Phone:");
            for (SmartPhone a : a1) {
                System.out.print(a.name+" ("+a.cost+") ");
            }
            
            Collections.sort(a1);
            System.out.println("\nList of Smart Phone in ascending order according to price");
            for (SmartPhone a : a1) {
                System.out.print(a.name+" ("+a.cost+") ");
            }
    }
    
}
