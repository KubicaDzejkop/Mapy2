package pl.gornik.map2;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, List<Integer>> subjects = new HashMap<>();
        addGrades(subjects, "matematyka", 5);
        addGrades(subjects, "polski", 3);
        addGrades(subjects, "matematyka", 4);
        addGrades(subjects, "fizyka", 2);
        addGrades(subjects, "religia", 6);
        addGrades(subjects, "polski", 5);

        for (Map.Entry<String, List<Integer>> sub : subjects.entrySet()){
            System.out.println(sub.getKey() + " - " + sub.getValue());
        }

        int gradesSum = 0;
        int gradeCount = 0;
        for (Map.Entry<String, List<Integer>> sub : subjects.entrySet()){
            for (int grade : sub.getValue()){
                gradesSum += grade;
                gradeCount++;
            }
        }
        System.out.println("Średnia: " + (double)gradesSum / gradeCount);

    }

    public static void addGrades(Map<String, List<Integer>> subjects, String subject, int grade){
        if (subjects.containsKey(subject)){
            subjects.get(subject).add(grade);
        }else{
            subjects.put(subject, new ArrayList<>(Arrays.asList(grade)));
        }
    }
}
