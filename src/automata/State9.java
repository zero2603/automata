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
        if(c>='0' && c<='9') return 10;
        else return 9;
    }
    
    @Override
    public void show(){
        System.out.println("OK");
    }
}
