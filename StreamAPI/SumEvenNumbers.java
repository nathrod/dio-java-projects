import java.util.Arrays;
import java.util.List;

public class SumEvenNumbers {

    //Print the sum of even numbers
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        int sumEven = numbers.stream().filter(num -> num % 2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println(sumEven);

    }
}
