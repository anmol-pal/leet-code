package leetcode;

//https://leetcode.com/problems/roman-to-integer/
public class RomantoInteger {
    public static void  main(String[] args) {
        RomantoInteger romantoInteger = new RomantoInteger();
//        String s="MCMXCIV"; //1994
        String s="III"; //3
        System.out.println(romantoInteger.romanToInt(s));
//        System.out.println(romantoInteger.romanToInt2(s));

    }
    public int romanToInt(String s) {
        char c;
        int counter=0;
        for(int i=0; i<s.length(); i++){
            switch (s.charAt(i)){
                case 'I':
                    if(i<s.length()-1 && (s.charAt(i+1) == 'V' || s.charAt(i+1)=='X' ) ){
                        switch (s.charAt(i+1)){
                            case 'V':
                                counter=counter+4;
                                i++;
                                break;
                            case 'X':
                                counter=counter+9;
                                i++;
                                break;
                        }
                    }
                    else {
                        counter = counter + 1;
                    }
                    break;
                case 'V':
                    counter=counter+5;
                    break;
                case 'X':
                    if(i<s.length()-1 && (s.charAt(i+1) == 'L' || s.charAt(i+1)=='C' ) ){
                        switch (s.charAt(i+1)){
                            case 'L':
                                counter=counter+40;
                                i++;
                                break;
                            case 'C':
                                counter=counter+90;
                                i++;
                                break;
                        }}
                    else {
                        counter=counter+10;
                    }
                    break;
                case 'L':
                    counter=counter+50;
                    break;
                case 'C':
                    if(i<s.length()-1 && (s.charAt(i+1) == 'D' || s.charAt(i+1)=='M' ) ){
                        switch (s.charAt(i+1)){
                            case 'D':
                                counter=counter+400;
                                i++;
                                break;
                            case 'M':
                                counter=counter+900;
                                i++;
                                break;
                        }}
                    else {
                        counter=counter+100;
                    }
                    break;
                case 'D':
                    counter=counter+500;
                    break;
                case 'M':
                    counter=counter+1000;
                    break;

            }
        }
        return counter;
    }
//    public int romanToInt2(String s) {
//    int counter=0;
//    Map<Character,Integer=>
//    return counter;
//    }


}
