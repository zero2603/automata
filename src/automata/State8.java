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
public class State8 extends State7{
    @Override
    public int getNext(char c){
        if((c >='0' && c<='9') || c=='\u0000') return 8;
        else if(c=='-') return 9;
        else return 10;
    }
    
    @Override
    public void show(){
        System.out.println("OK");
    }
}
