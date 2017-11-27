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
public class State9 extends State0{
    @Override
    public int getNext(char c){
        switch(c){
            case ' ': 
            case '\u0000': return 9;
            default: return 10;
        }
    }
    
    @Override
    public void show(){
        System.out.println("OK");
    }
}
