package application;

import java.util.concurrent.ThreadLocalRandom;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        System.out.println("Selection Process");

        System.out.println("Final candidates");
        candidateSelection();

    }

    static void candidateSelection() {
        String[] candidates = {"Alice", "Bruno", "Caroline", "Davi", "Evandro", "Fabiana", "Giovana", "Henrique", "Ivan", "Julia"};
        List<String> candidatesSelected = new ArrayList<>();

        for (String candidate : candidates) {
            int checkSalary = applicantAnalysis(intendedSalary());
            if (checkSalary == 1) {
                candidatesSelected.add(candidate);
            }
        }

        for(String candidate : candidatesSelected){
            System.out.println(candidate);
        }
    }

    static double intendedSalary(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    static int applicantAnalysis(double intendedSalary){
        if(intendedSalary>=1800 && intendedSalary<=2000) {
            return 1;
        }
        return 0;
    }
}
