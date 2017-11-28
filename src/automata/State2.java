/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automata;

/**
 *
 * @author Pham Anh Thu
 */
public class State2 extends State0{
    @Override
    public int getNext(char c){
        switch(c){
            case 'C': return 4;
            default: {
                System.out.println("saaaaaaaaaaaaaa");
                return 10;
            } 
        }
    }
    
    @Override
    public void show(){
        System.out.println("Processing");
    }
}
