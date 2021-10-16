import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] words = new String[10];
        words[0] = "первое";
        words[1] = "второе";
        words[2] = "третье";
        words[3] = "третье";
        words[4] = "четвертое";
        words[5] = "пятое";
        words[6] = "шестое";
        words[7] = "седьмое";
        words[8] = "седьмое";
        words[9] = "восьмое";
        HashMap<String, Integer> map = new HashMap<>();
        for (String wo: words){
            if (!map.containsKey(wo)){
                map.put(wo, 1);
            }
            else {
                map.put(wo, map.get(wo) + 1);
            }
        }
        for (Map.Entry<String, Integer> elem: map.entrySet()){
            System.out.println(elem.getKey()+" "+elem.getValue());
        }
        PhoneBook.addPhBook("Ivanov","2-22-22");
        PhoneBook.addPhBook("Petrov","3-33-33");
        PhoneBook.addPhBook("Ivanov", "4-44-44");

        PhoneBook.getPh("Ivanov");
        PhoneBook.getPh("Petrov");

        }
    }




