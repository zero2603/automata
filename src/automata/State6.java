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
public class State6 extends State5{
    @Override
    public int getNext(char c){
        if(c>='0' && c<='9') return 6;
        else if(c=='-') return 7;
        else return 10;
    }
}
