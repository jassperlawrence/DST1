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
        Tarikh a = new Tarikh(05,11,2016);
        System.out.println(a.toString());
        Sentence b= new Sentence ("How are you?");
        System.out.println(b.toString()+"\nThe length of sentence : "+b.length()+"\nThe number of vowels : "+b.vowels()+"\nThe number of words : "+b.words());
    }
    
}
