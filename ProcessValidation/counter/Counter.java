package counter;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Counter {
    public static void main(String[] args){
        Scanner terminal = new Scanner(System.in);
        System.out.print("First number: ");
        int start = terminal.nextInt();
        System.out.print("Second number: ");
        int end = terminal.nextInt();

        try{
            count(start,end);
        }catch (InvalidParametersException e){
            System.out.println("Running error: " + e.getMessage());
            System.out.println("Try again...");
        }
    }

    static void count(int start, int end ) throws InvalidParametersException {

        if(end<=start){
            throw new InvalidParametersException("The end value should be higher than the start value");
        }else{
            for(;start<=end;start++){
                System.out.println(start);
            }
        }
    }
}


