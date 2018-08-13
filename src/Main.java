import java.util.*;

public class Main {

    public static void main(String[] args) {


        Map<String, String> map = new TreeMap<String, String>();

        map.put("1","Chapter1");
        map.put("2","Chapter2");
        map.put("3","Chapter3");

        Map<String, List<String>> map1 = new TreeMap<String, List<String>>();

        List<String> list1= new ArrayList<>();
        list1.add("Chapter1 Start");
        list1.add("Chapter1 Introduction");
        list1.add("Chapter1 End");
        map1.put(map.get("1"),list1);
        map1.put(map.get("1"),list1);
        map1.put(map.get("1"),list1);

        Map<String,List<String>> map11 = new TreeMap<String, List<String>>();

        List<String> listKey= new ArrayList<>();
        List<String> listValue= new ArrayList<>();

        listKey.add("1");
        listValue.add("Start part1");
        listValue.add("Intro part1");

        map11.put(list1.get(0),listValue);
        map11.put(list1.get(0),listValue);


        Map<String, List<String>> map2 = new TreeMap<String, List<String>>();

        List<String> list2= new ArrayList<>();
        list2.add("Chapter2 Start");
        list2.add("Chapter2 Introduction");
        list2.add("Chapter2 End");

        map2.put(map.get("2"),list2);
        map2.put(map.get("2"),list2);
        map2.put(map.get("2"),list2);

        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String  values = entry.getValue();
            System.out.println(key);
            System.out.println(values);
            }

        for (Map.Entry<String, List<String>> entry : map1.entrySet()) {
            String key = entry.getKey();
            List<String> values = entry.getValue();
            System.out.println("Key = " + key);
            System.out.println("Values = " + values);
            System.out.println(map.keySet());
        }

        for (Map.Entry<String, List<String>> entry : map11.entrySet()) {
            String key = entry.getKey();
            List<String> values = entry.getValue();
            System.out.println("Key = " + key);
            System.out.println("Values = " + values);
        }


        for (Map.Entry<String, List<String>> entry : map2.entrySet()) {
            String key = entry.getKey();
            List<String> values = entry.getValue();
            System.out.println("Key = " + key);
            System.out.println("Values = " + values);
        }
    }
}
