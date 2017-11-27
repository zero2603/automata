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
public class State0 {
    public int getNext(char c) {
        switch(c){
            case ' ': return 0;
            case 'C': return 1;
            case 'V': return 2;
            default: return 10;
        }
    }
    
    public void show() {
        System.out.println("Initialize");
    }
}
