package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberSorting {
    private List<Integer> integers;

    public NumberSorting(){
        integers = new ArrayList<>();
    }

    public void addNumber(int number){
        integers.add(number);
    }

    public List<Integer> sortAscending(){
        List<Integer> integersAscending = new ArrayList<>(integers);
        Collections.sort(integersAscending);
        return integersAscending;
    }

    public List<Integer> sortDescending(){
        List<Integer> integerDescending = new ArrayList<>(integers);
        Collections.sort(integerDescending, Collections.reverseOrder());
        return integerDescending;
    }
}
