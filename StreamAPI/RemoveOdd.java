import java.util.Arrays;
import java.util.List;

public class RemoveOdd {
    public static void main(String[] args){
        Arrays Arrays = null;
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        //Remove all odd values
        System.out.println(numbers.stream().filter(num -> num % 2 == 0).toList());
    }
}
