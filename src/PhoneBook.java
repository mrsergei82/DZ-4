import java.util.*;

public class PhoneBook {
    public static HashMap<String, List<String>> pBook = new HashMap<>();


    public static void addPhBook(String name, String phone){
        List<String> list = new ArrayList<>();
        if (!pBook.containsKey(name)){
            list.add(phone);

        pBook.put(name, list);
        }else {
            pBook.get(name).add(phone);
        }
    }
    public static void getPh(String name){
        pBook.get(name);
        System.out.println(name+" "+pBook.get(name));
    }


}
