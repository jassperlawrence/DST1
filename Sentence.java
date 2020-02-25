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
public class Sentence {
    private String sentence;

    public Sentence(String sentence) {
        this.sentence = sentence;
    }
    
    //method to find length
    int length(){
        return sentence.length();
    }
    int vowels(){
        int count =0;
        for(int i=0;i<sentence.length();i++){
            if(sentence.charAt(i)=='A'||sentence.charAt(i)=='E'||sentence.charAt(i)=='I'||sentence.charAt(i)=='O'||sentence.charAt(i)=='U'){
                count++;
            }
            else if(sentence.charAt(i)=='a'||sentence.charAt(i)=='e'||sentence.charAt(i)=='i'||sentence.charAt(i)=='o'||sentence.charAt(i)=='u'){
                count++;
            }
            
        }
        return count;
    }
     int words(){
        int words =0;
        for(int i=0;i<sentence.length();i++){
            if(sentence.charAt(i)==' '){
                words++;
            }
        }
            return words+1;
    }

    @Override
    public String toString() {
        return "The sentence is : "+sentence;
    }
    
}
