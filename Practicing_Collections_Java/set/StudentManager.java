package set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class StudentManager {
    private Set<Student> studentsSet;

    public StudentManager(){
        studentsSet = new HashSet<>();
    }

    public void addStudent(String name, Long enrollment, double average){
        studentsSet.add(new Student(name, enrollment, average));
    }

    public void removeStudent(long enrollment){
        Set<Student> studentToRemove = new HashSet<>();
        for(Student student : studentsSet){
            if(student.getEnrollment() == enrollment){
                studentToRemove.add(student);
                break;
            }
        }
        studentsSet.remove(studentToRemove);
    }

    public Set<Student> displayStudentsByName(){
        Set<Student> studentByName = new TreeSet<>(studentsSet);
        return studentByName;
    }

    public Set<Student> displayStudentsByGrade(){
        Set<Student> studentsByGrade = new TreeSet<>(new Student.ComparatorByGrade());
        studentsByGrade.addAll(studentsSet);
        return studentsByGrade;
    }

    public void displayStudents() {
        for (Student student : studentsSet) {
            System.out.println(student.toString());
        }
    }
}
