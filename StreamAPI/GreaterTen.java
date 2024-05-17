import java.util.Arrays;
import java.util.List;

public class GreaterTen {
    //Check if the list contains any number greater than 10
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        boolean greaterThanTen = numbers.stream().allMatch(num -> num > 10);
        if (greaterThanTen){
            System.out.println("Numbers greater than 10: ");
            numbers.stream().filter(num -> num>10).forEach(System.out::println);
        }else{
            System.out.println("There are no numbers greater than 10.");
        }

    }
}
