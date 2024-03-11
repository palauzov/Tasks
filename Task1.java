import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] chars = str.split("");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = chars.length - 1; i >= 0 ; i--){
           stringBuilder.append(chars[i]);
        }

        System.out.println(stringBuilder);
    }
}
