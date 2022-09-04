package gsprep;

import java.util.HashMap;
import java.util.Map;

//https://www.geeksforgeeks.org/given-a-string-find-its-first-non-repeating-character/
class CountIndex{
    int count, index;

    public int getCount() {
        return count;
    }
    public int getIndex(){
        return index;
    }
    public CountIndex(int index){
        this.count= 1;
        this.index=index;
    }
    public void index(){
        count++;
    }
}
public class NonRepeatingChar {
    public static void main(String[] args) {
        String s= "geeee";
        NonRepeatingChar nonRepeatingChar=new NonRepeatingChar();
        nonRepeatingChar.firstNonRepeating(s);

    }

    public int firstNonRepeating(String s){

        HashMap<Character,CountIndex> map= new HashMap();
        System.out.println(map);
        for(int i=0; i<s.length()-1;i++){
            if(map.containsKey(s.charAt(i))){
                System.out.println("Here "+map.get(s.charAt(i)));
                    map.put(s.charAt(i),map.get(s.charAt(i)).index(););
            }
            else{
                map.put(s.charAt(i),new CountIndex(i));
            }
        }
        for( Map.Entry<Character, CountIndex> entry : map.entrySet() ){
        int c= entry.getValue().count;
        int ind= entry.getValue().index;
        char ci= entry.getKey();
        System.out.println("Char: "+ci+" Index:"+ind+" Count"+c);
        }
        return 0;
    }
}
