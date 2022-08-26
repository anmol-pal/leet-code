import java.util.HashMap;
import java.util.Map;
import java.util.stream.StreamSupport;

public class ValidParanthesis {
    public static void main(String[] args) {
    ValidParanthesis validParanthesis= new ValidParanthesis();
    String paranthesis="()";
    System.out.println(validParanthesis.isValid(paranthesis));
    }
    public boolean isValid(String s) {
    boolean result=false, unmacthed=false;
    System.out.println("Control");
    Map <String, String> map=new HashMap();
        map.put("(",")");
        map.put("{","}");
        map.put("[","]");
        System.out.println(map.get("("));
        System.out.println(s.replaceFirst(""+s.charAt(0),""));
        for(int i=0; i<= s.length();i++){
        while (s.isEmpty()==false && unmacthed==false ){
            if(s.contains(map.get(s.charAt(i)))){
                s.replaceFirst(map.get(s.charAt(i)),"");
                s.replaceFirst(""+s.charAt(i),"");
            }
        }
    }
    return result;
    }


}
