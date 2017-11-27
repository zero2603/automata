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
public class State10 extends State8{
    @Override
    public int getNext(char c){
        return 10;
    }
    
    @Override
    public void show(){
        System.out.println("Fail");
    }
}
