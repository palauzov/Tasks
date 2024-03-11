import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] words = string.split(", ");
        HashMap<String, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < words.length; i++){
            if (!hashMap.containsKey(words[i])){
                hashMap.put(words[i], 1);
            }else {
                int count = hashMap.get(words[i]);
                hashMap.replace(words[i], count, count + 1);
            }
        }

      for(Map.Entry<String, Integer> entry : hashMap.entrySet()){
          System.out.println(entry.getKey() + ": " + entry.getValue());
      }


    }
}


