import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        String input = scanner.nextLine();
        while (!input.equals("Exit")){
            try {
                int num = Integer.parseInt(input);
                numbers.add(num);
            }catch (NumberFormatException e){
                throw new RuntimeException("Invalid input");

            }
            input = scanner.nextLine();
        }

        for (int i = 0; i < numbers.size(); i++){
            System.out.print(numbers.get(i) + " ");
        }
    }
}
