import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class GreaterFive {
    //Calculate the average of numbers greater than 5
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        OptionalDouble average = numbers.stream().filter(num -> num > 5).mapToDouble(Double::valueOf).average();

        if (average.isPresent()) {
            System.out.println("Average: " + average.getAsDouble());
        } else {
            System.out.println("There are no numbers greater than 5.");
        }
    }
}
