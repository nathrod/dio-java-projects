import java.util.Arrays;
import java.util.List;

public class SecondNumber {
    //Find the second largest number in the list
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Integer secondLargest = numbers.stream().sorted((num1, num2) -> num2.compareTo(num1)).distinct().skip(1).findFirst().orElse(null);

        if (secondLargest != null) {
            System.out.println("Second largest number in the list: " + secondLargest);
        } else {
            System.out.println("No found!");
        }
    }
}
