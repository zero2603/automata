/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automata;

import java.util.Scanner;

/**
 *
 * @author Pham Anh Thu
 */
public class Automata {

    public static State0[] arr = {new State0(), new State1(), new State2(), new State3(), new State4(),
                        new State5(), new State6(), new State7(), new State8(), new State9(), new State10()};
    
    public static State0 getState(int i){
        return arr[i];
    }
    
    public static void main(String[] args) {
        State0 s = arr[0];
        String input;
        int nextState;
        
        System.out.println("Enter string: ");
        Scanner scanIn = new Scanner(System.in);
        input = scanIn.nextLine();
        
        for(int i=0; i<input.length(); i++) {
            nextState = s.getNext(input.charAt(i));
            s = getState(nextState);
//            s.show();
        }
        s.show();
    }
    
}
