package gsprep;

import java.util.HashMap;
import java.util.Map;

//https://www.geeksforgeeks.org/given-a-string-find-its-first-non-repeating-character/
class CountIndex{
    private int count;
    private int index;
    public CountIndex(int index){
        this.setCount(1);
        this.setIndex(index);
    }
    public void index(){
        setCount(getCount() + 1);
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
public class NonRepeatingChar {
    public static void main(String[] args) {
        String s= "geeksforgeeks";
        NonRepeatingChar nonRepeatingChar=new NonRepeatingChar();
        System.out.println("First Non Repeating character: "+s.charAt(nonRepeatingChar.firstNonRepeating(s)));
    }

    public int firstNonRepeating(String s){
        int min=+10000000;
        HashMap<Character,CountIndex> map= new HashMap();
        System.out.println(map);
        for(int i=0; i<=s.length()-1;i++){
            if(map.containsKey(s.charAt(i))){
                map.get(s.charAt(i)).index();
            }
            else{
                map.put(s.charAt(i),new CountIndex(i));
            }
        }
        for( Map.Entry<Character, CountIndex> entry : map.entrySet() ){
        if(entry.getValue().getCount()==1) min=Math.min(min,entry.getValue().getIndex());
        }
        System.out.println("Printing : "+s.charAt(min) );
        return min;
    }
}
