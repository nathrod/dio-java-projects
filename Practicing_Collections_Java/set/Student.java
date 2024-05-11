package set;

import java.util.Comparator;
import java.util.Objects;

public class Student implements Comparable<Student>{
    private String name;
    private long enrollment;
    private double average;

    public Student(String name, long enrollment, double average){
        this.name = name;
        this.enrollment = enrollment;
        this.average = average;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return getEnrollment() == student.getEnrollment();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEnrollment());
    }


    public String toString() {
        return "Student{Name: " + name + " ,enrollment: " + enrollment + " ,average: " + average + "}\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(Long enrollment) {
        this.enrollment = enrollment;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareToIgnoreCase(o.name);
    }

    static class ComparatorByGrade implements Comparator<Student> {

        @Override
        public int compare(Student s1, Student s2) {
            return Double.compare(s1.getAverage(), s2.getAverage());
        }
    }
}
