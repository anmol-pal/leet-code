package gsprep;
//https://www.geeksforgeeks.org/given-a-string-find-its-first-non-repeating-character/
//LinkedHashMap -> Ordered elements into map
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingImpl2 {
    public static void main(String[] args) {
    FirstNonRepeatingImpl2 firstNonRepeatingImpl2= new FirstNonRepeatingImpl2();
    String s="geeksForgeeks ";
    System.out.println("First non repeating: "+firstNonRepeatingImpl2.firstNonRep(s));
    }
    char firstNonRep(String s){
        LinkedHashMap <Character, Integer> linkedHashMap= new LinkedHashMap();
        for(int i=0;i<s.length();i++){
            if(linkedHashMap.containsKey(s.charAt(i))) {
                linkedHashMap.put(s.charAt(i),linkedHashMap.get(s.charAt(i))+1);
            }
            else{
                linkedHashMap.put(s.charAt(i),1);
            }
        }
        int min=Integer.MAX_VALUE;
        for (Map.Entry<Character, Integer> entry: linkedHashMap.entrySet()){
            if(entry.getValue()==1) {
           return entry.getKey();
        }
        }
        return 0;
    }
}
