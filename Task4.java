import java.util.*;
import java.util.stream.Collectors;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        List<String> list = Arrays.stream(str.split("")).toList();
        List<String> list2 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++){
            if (!list2.contains(list.get(i))){
                list2.add(list.get(i));
            }else {
                System.out.printf("%s duplicates\n", list.get(i));
            }
        }
    }
}
