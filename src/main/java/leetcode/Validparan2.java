package leetcode;

import java.util.Stack;

public class Validparan2 {
    public static void main(String[] args) {
        Validparan2 vp = new Validparan2();
        String s = "(])";
        System.out.println(vp.isValid(s));
    }
    public boolean isValid(String s) {
    Stack<Character> stack= new Stack();
    for(int i=0; i<s.length();i++){
        if(s.charAt(i)=='(' |s.charAt(i)=='[' | s.charAt(i)=='{' ){
            stack.push(s.charAt(i));
        }
        else {
            if(stack.isEmpty()){
                return false;
            }
            else{
                char c=stack.peek();
                if((s.charAt(i)==')' && c=='(') || (s.charAt(i)==']' && c=='[') || (s.charAt(i)=='}' && c=='{') ){
                    stack.pop();
            }
                else return false;
            }
        }
    }
    return  stack.isEmpty();
    }
}
