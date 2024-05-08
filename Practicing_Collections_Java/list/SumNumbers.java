package list;

import java.util.ArrayList;
import java.util.List;

public class SumNumbers {
    private List<Integer> integers;

    public SumNumbers(){
        integers = new ArrayList<>();
    }

    public void addNumber(int number){
        integers.add(number);
    }

    public void calculateSum(){
        int sum = 0;
        for(Integer integer : integers){
            sum += integer;
        }

        System.out.println("Sum = " + sum);
    }

    public void findHighestNumber(){
        int max = Integer.MIN_VALUE;
        for(Integer integer : integers){
            if(integer>max){
                max=integer;
            }
        }
        System.out.println("Highest number: " + max);
    }

    public void findLowestNumber(){
        int min = Integer.MAX_VALUE;
        for(Integer integer : integers){
            if(integer<min){
                min=integer;
            }
        }
        System.out.println("Lowest number: " + min);
    }

    public void displayNumbers(){
        for (Integer integer : integers){
            System.out.print(integer + " ");
        }
    }
}
