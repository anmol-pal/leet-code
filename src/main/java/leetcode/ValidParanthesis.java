package leetcode;

import java.util.*;

public class ValidParanthesis {
    public static void main(String[] args) {
        ValidParanthesis validParanthesis = new ValidParanthesis();
        String paranthesis = "()";
        System.out.println(validParanthesis.isValid(paranthesis));
    }
    public boolean isValid(String s) {
        Stack stack = new Stack();
        char c;
        for(int i=0; i<s.length()-1;i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{'|| s.charAt(i)=='[') {
                stack.push(s.charAt(i));
                System.out.println(stack+" ?"+s.charAt(i));
            }
            else{
                c=(char)stack.peek();
                if((s.charAt(i)==c)) stack.pop();
                else return false;
            }
        }
        return stack.isEmpty();

        }
    }
