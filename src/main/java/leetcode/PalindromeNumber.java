package leetcode;

public class PalindromeNumber {
    public static void main(String[] args) {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        System.out.println(palindromeNumber.isPalindrome(212));
    }

    public boolean isPalindrome(int x) {
    int tail, pal=0, val=x;
    while(x!=0&& x>0) {
        tail=x%10;
        pal= tail + 10* pal;
        x=x/10;
    }
    if(val==pal) return  true;
    else return false;
    }
}
