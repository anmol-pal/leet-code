package blackrock;

import java.lang.reflect.Array;
import java.util.*;
public class CurrencyConversion {
    public static void main(String[] args) {
        Map<String, Map<String, Double>> foreignExchange = new HashMap<String, Map<String, Double>>();
        Map<String, Double> currencyValueUSD=new HashMap<String, Double>();
        Map<String, Double> currencyValueINR=new HashMap<String, Double>();
        Map<String, Double> currencyValueJPY=new HashMap<String, Double>();
        Map<String, Double> currencyValueAUD=new HashMap<String, Double>();

        TreeSet <Integer>s = new TreeSet();
        currencyValueUSD.put("GBP",0.77);
        currencyValueUSD.put("AUD",1.45);
        currencyValueUSD.put("JPY",10.0);

        currencyValueINR.put("GPB",0.002);
        currencyValueINR.put("EUR",0.12);
        currencyValueINR.put("JPY",1.77);

        currencyValueJPY.put("GBP",20.0);
        currencyValueAUD.put("GBP",2000.0);

        foreignExchange.put("USD", currencyValueUSD);
        foreignExchange.put("INR", currencyValueINR);
        foreignExchange.put("JPY", currencyValueJPY);
        foreignExchange.put("AUD", currencyValueAUD);

        ArrayList<String> path=new ArrayList<>();
        ArrayList <Double> solutions=new ArrayList<>();
        String start="USD";
        String end="GBP";
        path.add(start);
        CurrencyConversion currencyConversion= new CurrencyConversion();
        System.out.println("Goodnight "+currencyConversion.util(path,solutions,start,1.00,foreignExchange,end));
    }
    double util(ArrayList<String> path, ArrayList<Double> solutions,String currentCurrency, double currentNotes, Map<String, Map<String, Double>> foreignExchange, String end){
        System.out.println(path.get(path.size()-1)+"End " +end);
        if(path.get(path.size()-1).equals(end)) { //if last e
            System.out.println("Some meaningful Text"+currentNotes);
            solutions.add(currentNotes);
        }
        else{
            Map<String,Double> currentcurr=foreignExchange.get(currentCurrency);
            for (Map.Entry<String, Double> entry : currentcurr.entrySet()){
//                path.append(x[0])
//            util(path, x[0], num*x[1], mm,d, end)
//            path.pop()
                path.add(entry.getKey());
                util(path,solutions,entry.getKey(),currentNotes*entry.getValue(),foreignExchange,end);
                System.out.println("Key = " + entry.getKey() +
                        ", Value = " + entry.getValue());
                path.remove(path.size()-1);
        }
        }

        return Collections.max(solutions);
    }

}
