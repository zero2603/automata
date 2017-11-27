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
public class State3 extends State1{
    @Override
    public int getNext(char c){
        switch(c){
            case ' ': return 5;
            default: return 10;
        }
    }
}
