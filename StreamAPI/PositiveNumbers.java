import java.util.Arrays;
import java.util.List;

public class PositiveNumbers {
    //Check if all numbers in the list are positive
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        boolean allPositive = numbers.stream().allMatch(num -> num > 0);
        if (allPositive) {
            System.out.println("All numbers are positive");
        } else {
            System.out.println("There are negative numbers in the list");
        }
    }
}
