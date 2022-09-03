package leetcode;

//https://leetcode.com/problems/reverse-integer/
public class ReverseInteger {
    public static void main(String[] args) {
    ReverseInteger reverseInteger= new ReverseInteger();
    int x=-1534236469;
//    int x=-120;
    System.out.println(reverseInteger.reverse(x));
    }
    public int reverse(int x) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        int sign=1, reversed=0, tail;
        if(x<0){
            sign=-1;
        }
        while(x!=0){
            if(reversed>Integer.MAX_VALUE/10 || reversed<Integer.MIN_VALUE/10){
                return 0;
            }
            tail=x%10;
            reversed=tail+ reversed*10;
            x=x/10;
            }
            System.out.println("Rev: "+reversed+" x: "+x);
        return reversed;

    }

    }



